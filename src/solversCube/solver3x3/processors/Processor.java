package solversCube.solver3x3.processors;

import java.util.HashMap;

public class Processor {
    protected HashMap<String, String> data;

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
