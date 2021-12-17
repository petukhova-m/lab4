





import javax.script.ScriptEngine;




public class TesterActor extends AbstractActor {
    private ActorRef repository;





        repository.tell(new TestResult(packageId, result), ActorRef.noSender());


        String result;



            result = "ScriptException: " + exception.getLocalizedMessage();






        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");


        String[] args = request.getArguments()




    @Override


                .match(TestRequest.class, this::testRun)
                .build();

}
