package solverMegaminx.processors;

import java.util.HashMap;

public class CenterProcessor {
    private HashMap<String, String> data;

    public CenterProcessor(){
        this.data = new HashMap<>();
        // add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
