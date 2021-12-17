

import akka.NotUsed;

import akka.actor.dsl.Creators;

import akka.http.javadsl.Http;





import akka.http.javadsl.server.AllDirectives;








public class PostTestApp extends AllDirectives {





        final Http http = Http.get(system);



        routeFlow = instance.createRoute(system).flow(system, materializer);




        );






        ActorRef routerActor = system.actorOf(Props.create(RouterActor.class));

                    get(routerActor)
        );
    }




                    return complete("Test started!");
                }
        );

    private Route get(ActorRef routerActor) {


                new PackageResultsRequest(Integer.parseInt(packageID)),
                timeout);
                return completeOKWithFuture(result, Jackson.marshaller());


}
