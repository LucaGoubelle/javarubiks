package solversMinx.solverKilominx.processors.firstCorners;

import java.util.HashMap;

public class WBYProcessor {
    private HashMap<String, String> data;
    public WBYProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
