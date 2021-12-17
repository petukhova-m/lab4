





import javax.script.ScriptEngine;




public class TesterActor extends AbstractActor {
    private ActorRef repository;








        String result;










        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");


        String[] args = request.getArguments()




    @Override


                .match(TestRequest.class, this::testRun)
                .build();

}
