package posttest;

public class TestResult {
    private int packageId;


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
    public String toString() {

                "packageId=" + packageId +
                ", result='" + result + "\'" +
                '}';

}
