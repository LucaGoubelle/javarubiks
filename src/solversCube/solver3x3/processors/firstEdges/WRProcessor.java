package solversCube.solver3x3.processors.firstEdges;

import solversCube.solver3x3.processors.Processor;

public class WRProcessor extends Processor {

    public WRProcessor(){
        super();
        this.data.put("up_front::white_red", "U' R2");
        this.data.put("up_front::red_white", "F R' F'");
        this.data.put("up_left::white_red", "U2 R2");
        this.data.put("up_left::red_white", "U' F R' F'");
        this.data.put("up_right::white_red", "R2");
        this.data.put("up_right::red_white", "U F R' F'");
        this.data.put("up_back::white_red", "U R2");
        this.data.put("up_back::red_white", "U2 F R' F'");

        this.data.put("down_left::white_red", "L' D2 L D2");
        this.data.put("down_left::red_white", "L2 U' F R' F'");
        this.data.put("down_back::white_red", "F D' F'");
        this.data.put("down_back::red_white", "y R F y'");
        this.data.put("down_right::red_white", "y F2 U Rw U' Rw' y'");
    }

}
