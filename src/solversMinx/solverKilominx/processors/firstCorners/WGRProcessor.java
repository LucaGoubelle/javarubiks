package solversMinx.solverKilominx.processors.firstCorners;

import java.util.HashMap;

public class WGRProcessor {
    private HashMap<String, String> data;

    public WGRProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
