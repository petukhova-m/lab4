

import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




    private void initializeId(int id) {
        ArrayList<String> resultArray = new ArrayList<>();

    }
    private void storeResult(TestResult m) {
        int id = m.getPackageId();
        String result = m.getResult();
        if (!repository.containsKey(id)) {
            initializeId(id);

        repository.get(id).add(result);
        System.out.println("result of test saved " + m.toString());

    private void getPackageResults(PackageResultsRequest m) {
        int id = m.getPackageId();
        sender().tell(new PackageResults(id, repository.get(id)),
                      getSelf());
    }
    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(TestResult.class, this::storeResult)
                .match(PackageResultsRequest.class, this::getPackageResults)
                .build();
    }
}
