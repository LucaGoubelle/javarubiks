package solversCube.solver2x2.processors.firstFace;

import java.util.HashMap;

public class WGRProcessor {
    private HashMap<String, String> data;

    public WGRProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
