



import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "testName",
        "expectedResult",

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

    @JsonProperty("expectedResult")
    public String getExpectedResult() {
        return expectedResult;
    }

    @JsonProperty("params")

        return params;
    }

    @JsonProperty("testName")
    public void setTestName(String testName) {

    }

    @JsonProperty("expectedResult")
    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;


    @JsonProperty("params")
    public void setParams(List<String> params) {
        this.params = params;
    }
}
