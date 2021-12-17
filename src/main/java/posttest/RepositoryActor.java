package posttest;
import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepositoryActor extends AbstractActor {


    private void initializeId(int id) {
        ArrayList<String> resultArray = new ArrayList<>();

    }
    private void storeResult(TestResult m) {
        int id = m.getPackageId();
        String result = m.getResult();
        if (!repository.containsKey(id)) {
            initializeId(id);
        }
        repository.get(id).add(result);

    }
    private void getPackageResults(PackageResultsRequest m) {
        int id = m.getPackageId();
        sender().tell(new PackageResults(id, repository.get(id)),

    }
    @Override
    public Receive createReceive() {

                .match(TestResult.class, this::storeResult)


    }
}
