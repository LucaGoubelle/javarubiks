package solver2x2;

import javarubik.data.Cube;

import solver2x2.handlers.*;

public class Solver2x2 {
    private final StartHandler startHandler;
    private final FirstLayerHandler firstLayerHandler;
    private final LastLayerHandler lastLayerHandler;

    public Solver2x2(){
        this.startHandler = new StartHandler();
        this.firstLayerHandler = new FirstLayerHandler();
        this.lastLayerHandler = new LastLayerHandler();
    }

    public Cube solve(Cube cube){
        cube = this.startHandler.start(cube);
        cube = this.firstLayerHandler.handle(cube);
        cube = this.lastLayerHandler.handle(cube);
        return cube;
    }
}
