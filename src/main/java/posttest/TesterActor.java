





import javax.script.ScriptEngine;




public class TesterActor extends AbstractActor {
    private ActorRef repository;





        repository.tell(new TestResult(packageId, result), ActorRef.noSender());


        String result;
        try {


            result = "ScriptException: " + exception.getLocalizedMessage();





    public String eval(TestRequest request) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        Invocable invocable = (Invocable) engine;
        String[] args = request.getArguments()




    @Override


                .match(TestRequest.class, this::testRun)
                .build();

}
