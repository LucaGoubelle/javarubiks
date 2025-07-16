package solver2x2.processors.lastFace;

import java.util.HashMap;

public class PLLProcessor {
    private HashMap<String, String> data;

    public PLLProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
