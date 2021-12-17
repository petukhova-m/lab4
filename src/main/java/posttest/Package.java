package posttest;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
    public String getPackageId() {
        return packageId;
    }
    @JsonProperty("jsScript")
    public String getJsScript() {
        return jsScript;
    }

    public String getFunctionName() {
        return functionName;
    }
    @JsonProperty("tests")
    public List<Test> getTests() {
        return tests;
    }
    @JsonProperty("packageId")

        this.packageId = packageId;
    }
    @JsonProperty("jsScript")
    public void setJsScript(String jsScript) {
        this.jsScript = jsScript;
    }
    @JsonProperty("functionName")
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    @JsonProperty("tests")
    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
