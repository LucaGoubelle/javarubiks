package solverKilominx.processors.middleCorners;

import java.util.HashMap;

public class CyanGreenPurpleProcessor {
    private HashMap<String, String> data;

    public CyanGreenPurpleProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
