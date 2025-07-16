package solver2x2.processors.firstFace;

import java.util.HashMap;

public class WBRProcessor {
    private final HashMap<String, String> data;

    public WBRProcessor(){
        this.data = new HashMap<>();

        this.data.put("up_front_right::white_red_blue", "U' R2");
        this.data.put("up_front_right::blue_white_red", "R'");
        this.data.put("up_front_right::red_blue_white", "F");

        this.data.put("up_front_left::white_blue_red", "F2");
        this.data.put("up_front_left::red_white_blue", "U' F");
        this.data.put("up_front_left::blue_red_white", "U' R'");

        this.data.put("up_back_right::white_blue_red", "R2");
        this.data.put("up_back_right::red_white_blue", "U F");
        this.data.put("up_back_right::blue_red_white", "U R'");

        this.data.put("up_back_left::white_red_blue", "U R2");
        this.data.put("up_back_left::blue_white_red", "U2 R'");
        this.data.put("up_back_left::red_blue_white", "U2 F");


        this.data.put("down_front_left::white_red_blue", "D");
        this.data.put("down_front_left::blue_white_red", "L D2");
        this.data.put("down_front_left::red_blue_white", "F'");

        this.data.put("down_back_left::white_blue_red", "D2");
        this.data.put("down_back_left::red_white_blue", "L' D");
        this.data.put("down_back_left::blue_red_white", "L' F'");

        this.data.put("down_back_right::white_red_blue", "D'");
        this.data.put("down_back_right::blue_white_red", "R");
        this.data.put("down_back_right::red_blue_white", "R2 F");

        this.data.put("down_front_right::red_white_blue", "R' D'");
        this.data.put("down_front_right::blue_red_white", "F D");
    }

    public String process(String inputData){
        return this.data.getOrDefault(inputData, "???");
    }
}
