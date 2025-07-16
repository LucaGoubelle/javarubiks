package solver5x5;

import javarubik.data.Cube;

import solver5x5.handlers.centers.*;
import solver5x5.handlers.edges.*;

public class Solver5x5 {
    private final WhiteCenterHandler whiteCenterHandler;
    private final YellowCenterHandler yellowCenterHandler;
    private final BlueCenterHandler blueCenterHandler;
    private final RedCenterHandler redCenterHandler;
    private final LastCentersHandler lastCenterHandler;
    private final WhiteEdgesHandler whiteEdgesHandler;
    private final YellowEdgesHandler yellowEdgesHandler;
    private final LastEdgesHandler lastEdgesHandler;

    public Solver5x5(){
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
        // implement remaining lines
        return cube;
    }
}
