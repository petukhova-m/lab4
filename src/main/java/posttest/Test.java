package posttest;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "testName",
        "expectedResult",
        "params"
})

public class Test {
    @JsonProperty("testName")
    private String testName;
    @JsonProperty("expectedResult")
    private String expectedResult;
    @JsonProperty("params")
    private List<String> params;

    @JsonProperty("testName")
    public String getTestName() {
        return testName;
    }


    public String getExpectedResult() {
        return expectedResult;
    }

    @JsonProperty("params")
    public List<String> getParams() {
        return params;
    }

    @JsonProperty("testName")
    public void setTestName(String testName) {
        this.testName = testName;


    @JsonProperty("expectedResult")
    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @JsonProperty("params")

        this.params = params;
    }
}
