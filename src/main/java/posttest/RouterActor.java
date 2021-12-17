


import akka.actor.ActorRef;




public class RouterActor extends AbstractActor {
    private ActorRef repository;



        repository = getContext().actorOf(Props.create(RepositoryActor.class));




    @Override

        return ReceiveBuilder.create()



    }


        pack.getTests()
                .stream()






                test.getParams(),
                test.getExpectedResult(),
                Integer.parseInt(pack.getPackageId()));




}
