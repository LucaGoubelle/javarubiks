package solverKilominx.processors.middleCorners;

import java.util.HashMap;

public class BeigeRedGreenProcessor {
    private final HashMap<String, String> data;

    public BeigeRedGreenProcessor(){
        this.data = new HashMap<>();
        //todo: add cases to processes
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
