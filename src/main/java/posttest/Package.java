

import com.fasterxml.jackson.annotation.*;


import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

    "packageId",



public class Package {


    @JsonProperty("functionName") private String functionName;
    @JsonProperty("tests") private List<Test> tests;



    }
    @JsonProperty("jsScript")

        return jsScript;
    }




    @JsonProperty("tests")

        return tests;
    }
    @JsonProperty("packageId")


    }




    @JsonProperty("functionName")


    }
    @JsonProperty("tests")



}
