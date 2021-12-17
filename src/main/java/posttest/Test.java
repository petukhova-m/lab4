package posttest;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "testName",

        "params"
})


    @JsonProperty("testName")
    private String testName;


    @JsonProperty("params")


    @JsonProperty("testName")
    public String getTestName() {
        return testName;
    }

    @JsonProperty("expectedResult")
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
    }

    @JsonProperty("expectedResult")

        this.expectedResult = expectedResult;
    }

    @JsonProperty("params")
    public void setParams(List<String> params) {
        this.params = params;


