





import javax.script.ScriptEngine;




public class TesterActor extends AbstractActor {
    private ActorRef repository;





        repository.tell(new TestResult(packageId, result), ActorRef.noSender());

    public void testRun(TestRequest request) {
        String result;
        try {


            result = "ScriptException: " + exception.getLocalizedMessage();





    public String eval(TestRequest request) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(request.getScript());
        Invocable invocable = (Invocable) engine;
        String[] args = request.getArguments()


        return invocable.invokeFunction(request.getFunction(), args).toString();

    @Override


                .match(TestRequest.class, this::testRun)
                .build();

}
