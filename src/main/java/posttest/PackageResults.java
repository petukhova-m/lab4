package posttest;


public class PackageResults {
    private ArrayList<String> results;


    public ArrayList<String> getResults() {
        return results;
    }





    public PackageResults(int packageId, ArrayList<String> results) {
        this.results = results;
        this.packageId = packageId;
    }

}
