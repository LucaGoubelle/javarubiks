package solversCube.solver3x3.processors;

public class StartProcessor extends Processor {

    public StartProcessor(){
        super();

        this.data.put("yellow_green","y2");
        this.data.put("yellow_red","y'");
        this.data.put("yellow_orange","y");

        this.data.put("white_blue","z2");
        this.data.put("white_green","x2");
        this.data.put("white_red","y Z2");
        this.data.put("white_orange","y x2");

        this.data.put("blue_white","x'");
        this.data.put("blue_orange","z y");
        this.data.put("blue_red","z' y'");
        this.data.put("blue_yellow","x y2");

        this.data.put("green_white","x z2");
        this.data.put("green_yellow","x");
        this.data.put("green_red","x z");
        this.data.put("green_orange","y x");

        this.data.put("red_white","z x'");
        this.data.put("red_yellow","x y");
        this.data.put("red_blue","z");
        this.data.put("red_green","z x2");

        this.data.put("orange_white","z' x'");
        this.data.put("orange_yellow","x y'");
        this.data.put("orange_blue","z'");
        this.data.put("orange_green","z y2");
    }

}
