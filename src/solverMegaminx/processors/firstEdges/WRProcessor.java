package solverMegaminx.processors.firstEdges;

import java.util.HashMap;

public class WRProcessor {
    private HashMap<String, String> data;

    public WRProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }

}
