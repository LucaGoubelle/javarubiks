package solversCube.solver2x2.processors;

import java.util.HashMap;

public class Processor {

    protected HashMap<String, String> data;

    public Processor(){
        this.data = new HashMap<>();
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }

}
