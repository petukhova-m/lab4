

import java.util.ArrayList;
import java.util.List;

public class TestRequest {
    private String function;


    private String rightResult;
    private int packageId;

    public TestRequest(String function, String script, List<String> arguments, String rightResult, int packageId) {
        this.function = function;
        this.script = script;
        this.arguments = arguments;

        this.packageId = packageId;
    }






        return script;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getRightResult() {
        return rightResult;



        return packageId;
    }
}
