package posttest;

import com.fasterxml.jackson.annotation.*;


import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

    "packageId",
    "jsScript",
    "functionName",
    "tests"})
public class Package {
    @JsonProperty("packageId") private String packageId;

    @JsonProperty("functionName") private String functionName;
    @JsonProperty("tests") private List<Test> tests;
    @JsonProperty("packageId")

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
