package solver2x2.handlers;

import javarubik.data.Cube;
import javarubik.move.Mover;

import solverHelpers.scanners.Cube2x2Scanner;

import java.util.HashMap;

public class StartHandler {

    private final Mover mover;
    private final Cube2x2Scanner scanner;

    public StartHandler(){
        this.mover = new Mover();
        this.scanner = new Cube2x2Scanner();
    }

    private Cube analyseUpFrontRight(Cube cube){
        String result = this.scanner.scanCorner(cube, "up_front_right");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_red_blue","U' R2");
        hmap.put("red_blue_white","F");
        hmap.put("blue_white_red","R'");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

    private Cube analyseUpFrontLeft(Cube cube){
        String result = this.scanner.scanCorner(cube, "up_front_left");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_blue_red","U2 R2");
        hmap.put("red_white_blue","U' F");
        hmap.put("blue_red_white","U' R'");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

    private Cube analyseUpBackRight(Cube cube){
        String result = this.scanner.scanCorner(cube, "up_back_right");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_blue_red","R2");
        hmap.put("blue_red_white","U R'");
        hmap.put("red_white_blue","U F");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

    private Cube analyseUpBackLeft(Cube cube){
        String result = this.scanner.scanCorner(cube, "up_back_left");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_red_blue","U R2");
        hmap.put("red_blue_white","U2 F");
        hmap.put("blue_white_red","U2 R'");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

    private Cube analyseDonwBackLeft(Cube cube){
        String result = this.scanner.scanCorner(cube, "down_back_left");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_blue_red","D2");
        hmap.put("red_white_blue","L' D");
        hmap.put("blue_red_white","L'F'");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

    private Cube analyseDownBackRight(Cube cube){
        String result = this.scanner.scanCorner(cube, "down_back_right");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_red_blue","D'");
        hmap.put("blue_white_red","R");
        hmap.put("red_blue_white","R2 F");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }

    private Cube analyseDownFrontLeft(Cube cube){
        String result = this.scanner.scanCorner(cube, "down_front_left");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_red_blue","D");
        hmap.put("blue_white_red","L D2");
        hmap.put("red_blue_white","F'");
        return (hmap.containsKey(result)) ? this.mover.multiMoves(cube, hmap.get(result)) : cube;
    }
    private Cube analyseUp(Cube cube){
        cube = this.analyseUpFrontRight(cube);
        cube = this.analyseUpFrontLeft(cube);
        cube = this.analyseUpBackRight(cube);
        cube = this.analyseUpBackLeft(cube);
        return cube;
    }

    private Cube analyseDown(Cube cube){
        cube = this.analyseDownFrontLeft(cube);
        cube = this.analyseDonwBackLeft(cube);
        cube = this.analyseDownBackRight(cube);
        return cube;
    }

    public Cube start(Cube cube){
        String preResult = this.scanner.scanCorner(cube, "down_front_right");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("white_blue_red","");
        hmap.put("red_white_blue","R' D'");
        hmap.put("blue_red_white","F D");
        if(hmap.containsKey(preResult)){
            cube = this.mover.multiMoves(cube, hmap.get(preResult));
        } else {
            cube = this.analyseUp(cube);
            cube = this.analyseDown(cube);
        }
        return cube;
    }
}
