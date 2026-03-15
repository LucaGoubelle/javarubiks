package solversCube.solver3x3.processors.firstEdges;

import solversCube.solver3x3.processors.Processor;

public class WBProcessor extends Processor {

    public WBProcessor(){
        super();
        this.data.put("up_front::white_blue", "F2");
        this.data.put("up_front::blue_white", "U Rw U' Rw'");
        this.data.put("up_right::white_blue", "U F2");
        this.data.put("up_right::blue_white", "U2 Rw U' Rw'");
        this.data.put("up_left::white_blue", "U' F2");
        this.data.put("up_left::blue_white", "Rw U' Rw'");
        this.data.put("up_back::white_blue", "U2 F2");
        this.data.put("up_back::blue_white", "U' Rw U' Rw'");

        this.data.put("front_right::white_blue", "R' D'");
        this.data.put("front_right::blue_white", "F");
        this.data.put("front_left::white_blue", "L D");
        this.data.put("front_left::blue_white", "F'");

        this.data.put("back_right::white_blue", "R D'");
        this.data.put("back_right::blue_white", "R2 F");
        this.data.put("back_left::white_blue", "L' D");
        this.data.put("back_left::blue_white", "L2 F'");

        this.data.put("down_right::white_blue", "D'");
        this.data.put("down_right::blue_white", "R F");
        this.data.put("down_left::white_blue", "D");
        this.data.put("down_left::blue_white", "L' F'");
        this.data.put("down_back::white_blue", "D2");
        this.data.put("down_back::blue_white", "D L' F'");
        this.data.put("down_front::blue_white", "F2 U Rw U' Rw'");
    }

}
