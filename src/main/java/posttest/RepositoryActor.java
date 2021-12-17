
import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepositoryActor extends AbstractActor {


    private void initializeId(int id) {
        ArrayList<String> resultArray = new ArrayList<>();

    }


        String result = m.getResult();
        if (!repository.containsKey(id)) {
            initializeId(id);

        repository.get(id).add(result);

    }
    private void getPackageResults(PackageResultsRequest m) {

        sender().tell(new PackageResults(id, repository.get(id)),

    }
    @Override


                .match(TestResult.class, this::storeResult)


    }
}
