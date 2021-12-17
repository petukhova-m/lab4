

import com.fasterxml.jackson.annotation.*;


import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

    "packageId",

    "functionName",
    "tests"})
public class Package {


    @JsonProperty("functionName") private String functionName;
    @JsonProperty("tests") private List<Test> tests;


        return packageId;
    }
    @JsonProperty("jsScript")

        return jsScript;
    }


        return functionName;

    @JsonProperty("tests")

        return tests;
    }
    @JsonProperty("packageId")


    }

    public void setJsScript(String jsScript) {
        this.jsScript = jsScript;

    @JsonProperty("functionName")
    public void setFunctionName(String functionName) {

    }
    @JsonProperty("tests")

        this.tests = tests;

}
