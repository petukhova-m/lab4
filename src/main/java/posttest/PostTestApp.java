

import akka.NotUsed;



import akka.http.javadsl.Http;





import akka.http.javadsl.server.AllDirectives;








public class PostTestApp extends AllDirectives {














        );






        ActorRef routerActor = system.actorOf(Props.create(RouterActor.class));

                    get(routerActor)








        );





                timeout);



}
