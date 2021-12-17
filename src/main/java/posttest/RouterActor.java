package posttest;


import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;
import akka.actor.*;
import akka.routing.RoundRobinPool;

public class RouterActor extends AbstractActor {
    private ActorRef repository;
    private ActorRef tester;


        repository = getContext().actorOf(Props.create(RepositoryActor.class));




    @Override

        return ReceiveBuilder.create()

                .match(PackageResultsRequest.class, this::getPackageResults)
                .build();
    }

    private void runPackage(Package pack) {
        pack.getTests()
                .stream()
                .map(test -> generateTestRequest(pack, test))

    }
    private TestRequest generateTestRequest(Package pack, Test test) {


                test.getParams(),
                test.getExpectedResult(),
                Integer.parseInt(pack.getPackageId()));
    }

        repository.tell(request, getSender());
    }
}
