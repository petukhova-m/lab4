package posttest;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;
import akka.actor.*;
import akka.routing.RoundRobinPool;

public class RouterActor extends AbstractActor {
    private ActorRef repository;
    private ActorRef tester;


        repository = getContext().actorOf(Props.create(RepositoryActor.class));
        tester = getContext().actorOf(new RoundRobinPool(5).props(Props.create(TesterActor.class, repository)));



    @Override
    public AbstractActor.Receive createReceive() {
        return ReceiveBuilder.create()
                .match(Package.class, this::runPackage)
                .match(PackageResultsRequest.class, this::getPackageResults)
                .build();
    }

    private void runPackage(Package pack) {
        pack.getTests()
                .stream()
                .map(test -> generateTestRequest(pack, test))

    }
    private TestRequest generateTestRequest(Package pack, Test test) {
        return new TestRequest(pack.getFunctionName(),

                test.getParams(),
                test.getExpectedResult(),
                Integer.parseInt(pack.getPackageId()));
    }

        repository.tell(request, getSender());
    }
}
