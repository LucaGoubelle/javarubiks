package solversCube.solver3x3.processors.firstEdges;

import solversCube.solver3x3.processors.Processor;

public class WGProcessor extends Processor {

    public WGProcessor(){
        super();
        this.data.put("up_front::white_green", "y U2 R2 y'");
        this.data.put("up_front::green_white", "U' y F R' F' y'");
        this.data.put("up_left::white_green", "y U R2 y'");
        this.data.put("up_left::green_white", "y2 Lw' U Lw y2");
        this.data.put("up_right::white_green", "y U' R2 y'");
        this.data.put("up_right::green_white", "y2 Rw U' Rw' y2");
        this.data.put("up_back::white_green", "y R2 y'");
        this.data.put("up_back::green_white", "y2 U Rw U' Rw' y2");

        this.data.put("front_left::white_green" , "D L D'");
        this.data.put("front_left::green_white" , "y' F2 L y");
        this.data.put("front_right::white_green" , "D' R' D");
        this.data.put("front_right::green_white" , "y F2 R' F2 y'");

        this.data.put("back_left::white_green", "D L' D'");
        this.data.put("back_left::green_white", "y' L y");
        this.data.put("back_right::white_green", "D' R D");
        this.data.put("back_right::green_white", "y R' y'");

        this.data.put("down_left::white_green", "L' D L D'");
        this.data.put("down_left::green_white", "y' F L y");
        this.data.put("down_back::green_white", "y2 F2 U Rw U' Rw' y2");
    }

}
