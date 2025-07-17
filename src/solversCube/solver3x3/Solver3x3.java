package solversCube.solver3x3;

import javarubik.data.Cube;

import javarubik.exceptions.CubeMoveException;
import solversCube.solver3x3.handlers.*;

public class Solver3x3 {
    private final StartHandler startHandler;
    private final WhiteCrossHandler whiteCrossHandler;
    private final FirstLayerHandler firstLayerHandler;
    private final SecondLayerHandler secondLayerHandler;
    private final YellowCrossHandler yellowCrossHandler;
    private final LastCornersHandler lastCornersHandler;

    public Solver3x3(){
        this.startHandler = new StartHandler();
        this.whiteCrossHandler = new WhiteCrossHandler();
        this.firstLayerHandler = new FirstLayerHandler();
        this.secondLayerHandler = new SecondLayerHandler();
        this.yellowCrossHandler = new YellowCrossHandler();
        this.lastCornersHandler = new LastCornersHandler();
    }

    public Cube solve(Cube cube) throws CubeMoveException {
        cube = this.startHandler.start(cube);
        cube = this.whiteCrossHandler.handle(cube);
        cube = this.firstLayerHandler.handle(cube);
        cube = this.secondLayerHandler.handle(cube);
        cube = this.yellowCrossHandler.handle(cube);
        cube = this.lastCornersHandler.handle(cube);
        return cube;
    }
}
