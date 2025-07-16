package solver2x2.processors.firstFace;

import java.util.HashMap;

public class WBOProcessor {
    private HashMap<String, String> data;

    public WBOProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
