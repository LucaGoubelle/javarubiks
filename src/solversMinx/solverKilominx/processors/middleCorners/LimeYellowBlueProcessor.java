package solversMinx.solverKilominx.processors.middleCorners;

import java.util.HashMap;

public class LimeYellowBlueProcessor {

    private HashMap<String, String> data;

    public LimeYellowBlueProcessor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
