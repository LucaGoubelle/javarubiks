package solver2x2.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import javarubik.move.Mover;
import solver2x2.processors.lastFace.OLLProcessor;
import solver2x2.processors.lastFace.PLLProcessor;
import solverHelpers.advanced.OLLScanner;
import solverHelpers.advanced.PLLScanner;
import solverHelpers.scanners.Cube2x2Scanner;

import java.util.HashMap;

public class LastLayerHandler {

    private final Mover mover;
    private final OLLScanner ollScanner;
    private final OLLProcessor ollProc;
    private final PLLScanner pllScanner;
    private final PLLProcessor pllProc;
    private final Cube2x2Scanner scanner;

    public LastLayerHandler(){
        this.mover = new Mover();
        this.ollScanner = new OLLScanner();
        this.ollProc = new OLLProcessor();
        this.pllScanner = new PLLScanner();
        this.pllProc = new PLLProcessor();
        this.scanner = new Cube2x2Scanner();
    }

    public Cube handle(Cube cube) throws CubeMoveException {
        cube = this.oll(cube);
        cube = this.pll(cube);
        cube = this.auf(cube);
        return cube;
    }

    private Cube oll(Cube cube) throws CubeMoveException {
        String inputData = this.ollScanner.scanOLL(cube);
        String sequence = this.ollProc.process(inputData);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube pll(Cube cube) throws CubeMoveException {
        String inputData = this.pllScanner.scanPLL(cube);
        String sequence = this.pllProc.process(inputData);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube auf(Cube cube) throws CubeMoveException {
        String color = cube.front[0][0];
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("green", "U2");
        hmap.put("orange","U");
        hmap.put("red", "U'");
        cube = this.mover.multiMoves(cube, hmap.getOrDefault(color, "???"));
        return cube;
    }
}
