package posttest;



import java.util.ArrayList;



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

    }


    public String getExpectedResult() {
        return expectedResult;
    }


    public List<String> getParams() {
        return params;
    }

    @JsonProperty("testName")
    public void setTestName(String testName) {
        this.testName = testName;


    @JsonProperty("expectedResult")
    public void setExpectedResult(String expectedResult) {

    }

    @JsonProperty("params")

        this.params = params;
    }
}
