package solver6x6;

import javarubik.data.Cube;

import solver6x6.handlers.centers.*;
import solver6x6.handlers.edges.*;

public class Solver6x6 {
    private final WhiteCenterHandler whiteCenterHandler;
    private final YellowCenterHandler yellowCenterHandler;
    private final BlueCenterHandler blueCenterHandler;
    private final RedCenterHandler redCenterHandler;
    private final LastCentersHandler lastCentersHandler;
    private final WhiteEdgesHandler whiteEdgesHandler;
    private final YellowEdgesHandler yellowEdgesHandler;
    private final LastEdgesHandler lastEdgesHandler;

    public Solver6x6(){
        //centers handlers
        this.whiteCenterHandler = new WhiteCenterHandler();
        this.yellowCenterHandler = new YellowCenterHandler();
        this.blueCenterHandler = new BlueCenterHandler();
        this.redCenterHandler = new RedCenterHandler();
        this.lastCentersHandler = new LastCentersHandler();

        // edges handlers
        this.whiteEdgesHandler = new WhiteEdgesHandler();
        this.yellowEdgesHandler = new YellowEdgesHandler();
        this.lastEdgesHandler = new LastEdgesHandler();
    }

    private Cube solveCenter(Cube cube){
        cube = this.whiteCenterHandler.handle(cube);
        cube = this.yellowCenterHandler.handle(cube);
        cube = this.blueCenterHandler.handle(cube);
        cube = this.redCenterHandler.handle(cube);
        cube = this.lastCentersHandler.handle(cube);
        return cube;
    }

    private Cube solveEdges(Cube cube){
        cube = this.whiteEdgesHandler.handle(cube);
        cube = this.yellowEdgesHandler.handle(cube);
        cube = this.lastEdgesHandler.handle(cube);
        return cube;
    }

    public Cube solve(Cube cube){
        cube = this.solveCenter(cube);
        cube = this.solveEdges(cube);
        // todo: implement remaining code
        return cube;
    }
}
