package solversCube.solver2x2.processors.lastFace;

import java.util.HashMap;

public class OLLProcessor {
    private HashMap<String, String> data;

    public OLLProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
