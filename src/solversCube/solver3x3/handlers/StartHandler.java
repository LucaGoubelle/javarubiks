package solversCube.solver3x3.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import javarubik.move.Mover;

import solverHelpers.scanners.Cube3x3Scanner;

import java.util.HashMap;

public class StartHandler {

    private final Mover mover;
    private final Cube3x3Scanner scanner;

    public StartHandler(){
        this.mover = new Mover();
        this.scanner = new Cube3x3Scanner();
    }

    public Cube start(Cube cube) throws CubeMoveException {
        String result1 = this.scanner.scanCenter(cube, "up");
        String result2 = this.scanner.scanCenter(cube, "front");
        String result = result1 + "_" + result2;
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("yellow_blue","");
        hmap.put("yellow_green","y2");
        hmap.put("yellow_red","y'");
        hmap.put("yellow_orange","y");

        hmap.put("white_blue","z2");
        hmap.put("white_green","x2");
        hmap.put("white_red","y Z2");
        hmap.put("white_orange","y x2");

        hmap.put("blue_white","x'");
        hmap.put("blue_orange","z y");
        hmap.put("blue_red","z' y'");
        hmap.put("blue_yellow","x y2");

        hmap.put("green_white","x z2");
        hmap.put("green_yellow","x");
        hmap.put("green_red","x z");
        hmap.put("green_orange","y x");

        hmap.put("red_white","z x'");
        hmap.put("red_yellow","x y");
        hmap.put("red_blue","z");
        hmap.put("red_green","z x2");

        hmap.put("orange_white","z' x'");
        hmap.put("orange_yellow","x y'");
        hmap.put("orange_blue","z'");
        hmap.put("orange_green","z y2");

        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

}
