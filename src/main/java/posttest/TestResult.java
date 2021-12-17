

public class TestResult {

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


                "packageId=" + packageId +
                ", result='" + result + "\'" +
                '}';
    }
}
