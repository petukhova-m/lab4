

import akka.NotUsed;



import akka.http.javadsl.Http;














public class PostTestApp extends AllDirectives {














        );






        ActorRef routerActor = system.actorOf(Props.create(RouterActor.class));

                    get(routerActor)








        );





                timeout);



}
