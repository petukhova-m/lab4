





import javax.script.ScriptEngine;




public class TesterActor extends AbstractActor {
    private ActorRef repository;

    public TesterActor(ActorRef repository) {



        repository.tell(new TestResult(packageId, result), ActorRef.noSender());
    }
    public void testRun(TestRequest request) {
        String result;
        try {


            result = "ScriptException: " + exception.getLocalizedMessage();



        sendToRepository(request.getPackageId(), result);
    }
    public String eval(TestRequest request) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(request.getScript());
        Invocable invocable = (Invocable) engine;
        String[] args = request.getArguments()
                .toArray(new String[request.getArguments().size()]);

        return invocable.invokeFunction(request.getFunction(), args).toString();

    @Override
    public Receive createReceive() {

                .match(TestRequest.class, this::testRun)
                .build();
    }
}
