package solversMinx.solverKilominx.processors.firstCorners;

import java.util.HashMap;

public class WBRProcessor {
    private HashMap<String, String> data;

    public WBRProcessor(){
        this.data = new HashMap<>();
        // up cases
        this.data.put("up_front_left::white_blue_red", "F' F' DR'");
        this.data.put("up_front_right::white_red_blue", "F2 DL");
        this.data.put("up_backLeft_left::white_red_blue", "U' F' F' DR'");
        this.data.put("up_backRight_right::white_blue_red", "U F2 DL");
        this.data.put("up_backLeft_backRight::white_blue_red", "U2 F2 DL");

        // todo: add cases to processes

        //down cases
        this.data.put("down_downLeft_absLeft", "D ");
        this.data.put("down_downRight_absRight", "D' ");
        this.data.put("down_back_absLeft", "D2 ");
        this.data.put("down_back_absRight", "D' D'");
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
