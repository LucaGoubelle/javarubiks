package solversMinx.solverKilominx.processors.middleCorners;

import java.util.HashMap;

public class MagentaBlueRedProcessor {
    private HashMap<String, String> data;
    public MagentaBlueRedProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
