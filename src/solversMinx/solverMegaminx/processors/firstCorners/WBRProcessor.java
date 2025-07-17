package solversMinx.solverMegaminx.processors.firstCorners;

import java.util.HashMap;

public class WBRProcessor {
    private HashMap<String, String> data;

    public WBRProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
