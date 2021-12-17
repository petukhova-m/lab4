

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "testName",
        "expectedResult",

})

public class Test {
    @JsonProperty("testName")

    @JsonProperty("expectedResult")
    private String expectedResult;

    private List<String> params;

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


    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @JsonProperty("params")
    public void setParams(List<String> params) {

    }
}
