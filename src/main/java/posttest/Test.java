package posttest;



import java.util.ArrayList;



@JsonPropertyOrder({

        "expectedResult",
        "params"
})

public class Test {
    @JsonProperty("testName")

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


    public void setTestName(String testName) {
        this.testName = testName;


    @JsonProperty("expectedResult")
    public void setExpectedResult(String expectedResult) {

    }

    @JsonProperty("params")

        this.params = params;
    }
}
