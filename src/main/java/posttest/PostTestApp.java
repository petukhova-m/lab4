package posttest;

import akka.NotUsed;

import akka.actor.dsl.Creators;

import akka.http.javadsl.Http;
import akka.http.javadsl.IncomingConnection;
import akka.http.javadsl.ServerBinding;

import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;
import scala.concurrent.Future;



public class PostTestApp extends AllDirectives {


    public static final int timeout = 5000;


        final Http http = Http.get(system);

        PostTestApp instance = new PostTestApp();
        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow;
        routeFlow = instance.createRoute(system).flow(system, materializer);
        final CompletionStage<ServerBinding> binding = http.bindAndHandle(

                ConnectHttp.toHost("localhost", serverport),

        );
        System.out.println("Server online at http://localhost:8080/\nPress RETURN to stop...");


    }

    private Route createRoute(ActorSystem system) {
        ActorRef routerActor = system.actorOf(Props.create(RouterActor.class));
        return route(post(routerActor),
                    get(routerActor)
        );
    }


                msg -> {
                    routerActor.tell(msg, ActorRef.noSender());
                    return complete("Test started!");
                }
        );

    private Route get(ActorRef routerActor) {

                Future<Object> result = Patterns.ask(routerActor,
                new PackageResultsRequest(Integer.parseInt(packageID)),
                timeout);
                return completeOKWithFuture(result, Jackson.marshaller());


}
