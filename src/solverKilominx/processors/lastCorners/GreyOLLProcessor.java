package solverKilominx.processors.lastCorners;

import java.util.HashMap;

public class GreyOLLProcessor {
    private HashMap<String, String> data;

    public GreyOLLProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
