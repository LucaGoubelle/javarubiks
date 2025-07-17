package solversCube.solver2x2.processors.firstFace;

import java.util.HashMap;

public class WGOProcessor {
    private HashMap<String, String> data;

    public WGOProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
