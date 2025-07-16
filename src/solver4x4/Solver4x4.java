package solver4x4;

import javarubik.data.Cube;

import solver4x4.handlers.edges.*;
import solver4x4.handlers.centers.*;

public class Solver4x4 {
    private final WhiteCenterHandler whiteCenterHandler;
    private final YellowCenterHandler yellowCenterHandler;
    private final BlueCenterHandler blueCenterHandler;
    private final RedCenterHandler redCenterHandler;
    private final LastCentersHandler lastCenterHandler;
    private final WhiteEdgesHandler whiteEdgesHandler;
    private final YellowEdgesHandler yellowEdgesHandler;
    private final LastEdgesHandler lastEdgesHandler;

    public Solver4x4(){
        // centers handlers
        this.whiteCenterHandler = new WhiteCenterHandler();
        this.yellowCenterHandler = new YellowCenterHandler();
        this.blueCenterHandler = new BlueCenterHandler();
        this.redCenterHandler = new RedCenterHandler();
        this.lastCenterHandler = new LastCentersHandler();

        //edges handlers
        this.whiteEdgesHandler = new WhiteEdgesHandler();
        this.yellowEdgesHandler = new YellowEdgesHandler();
        this.lastEdgesHandler = new LastEdgesHandler();
    }

    private Cube solveCenters(Cube cube){
        cube = this.whiteCenterHandler.handle(cube);
        cube = this.yellowCenterHandler.handle(cube);
        cube = this.blueCenterHandler.handle(cube);
        cube = this.redCenterHandler.handle(cube);
        cube = this.lastCenterHandler.handle(cube);
        return cube;
    }

    private Cube solveEdges(Cube cube){
        cube = this.whiteEdgesHandler.handle(cube);
        cube = this.yellowEdgesHandler.handle(cube);
        cube = this.lastEdgesHandler.handle(cube);
        return cube;
    }

    public Cube solve(Cube cube){
        cube = this.solveCenters(cube);
        cube = this.solveEdges(cube);
        //todo: implement remaining lines
        return cube;
    }
}
