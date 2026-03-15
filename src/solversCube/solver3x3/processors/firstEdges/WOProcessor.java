package solversCube.solver3x3.processors.firstEdges;

import solversCube.solver3x3.processors.Processor;

public class WOProcessor extends Processor {

    public WOProcessor(){
        super();
        this.data.put("up_front::white_orange", "U L2");
        this.data.put("up_front::orange_white", "F' L F");
        this.data.put("up_left::white_orange", "L2");
        this.data.put("up_left::orange_white", "y' U Rw U' Rw' y");
        this.data.put("up_right::white_orange", "U2 L2");
        this.data.put("up_right::orange_white", "U' y' Rw U' Rw' y");
        this.data.put("up_back::white_orange", "U' L2");
        this.data.put("up_back::orange_white", "y' Rw U' Rw' y");

        this.data.put("down_left::orange_white", "y' F2 U Rw U' Rw' y");
    }

}
