package solversMinx.solverMegaminx.processors.firstEdges;

import java.util.HashMap;

public class WYProcessor {
    private final HashMap<String, String> data;

    public WYProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
