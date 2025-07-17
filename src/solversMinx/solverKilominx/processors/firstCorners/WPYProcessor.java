package solversMinx.solverKilominx.processors.firstCorners;

import java.util.HashMap;

public class WPYProcessor {
    private HashMap<String, String> data;
    public WPYProcessor(){
        this.data = new HashMap<>();
        //todo: add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
