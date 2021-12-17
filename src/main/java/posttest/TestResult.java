

public class TestResult {
    private int packageId;
    private String result;

    public TestResult(int packageId, String result) {
        this.packageId = packageId;
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public int getPackageId() {
        return packageId;
    }

    @Override

        return "posttest.TestResult{" +
                "packageId=" + packageId +
                ", result='" + result + "\'" +
                '}';
    }
}
