package solversMinx.solverKilominx.processors.middleCorners;

import java.util.HashMap;

public class OrangePurpleYellowProcessor {
    private HashMap<String, String> data;

    public OrangePurpleYellowProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
