package posttest;


import akka.actor.ActorRef;




public class RouterActor extends AbstractActor {
    private ActorRef repository;
    private ActorRef tester;


        repository = getContext().actorOf(Props.create(RepositoryActor.class));




    @Override

        return ReceiveBuilder.create()


                .build();
    }


        pack.getTests()
                .stream()
                .map(test -> generateTestRequest(pack, test))





                test.getParams(),
                test.getExpectedResult(),
                Integer.parseInt(pack.getPackageId()));
    }

        repository.tell(request, getSender());

}
