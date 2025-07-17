package solversMinx.solverMegaminx.processors.firstEdges;

import java.util.HashMap;

public class WBProcessor {
    private HashMap<String, String> data;

    public WBProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
