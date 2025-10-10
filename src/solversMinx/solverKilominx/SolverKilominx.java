package solversMinx.solverKilominx;

import javaminx.data.models.Kilominx;
import javaminx.exceptions.MinxMoverException;

import solversMinx.solverKilominx.handlers.*;

public class SolverKilominx {

    private final StartHandler startHandler;
    private final FirstFaceHandler firstFaceHandler;
    private final MiddleCornersHandler middleCornersHandler;
    private final LastFirstLayerHandler lastFirstLayerHandler;
    private final LastFaceHandler lastFaceHandler;

    public SolverKilominx(){
        this.startHandler = new StartHandler();
        this.firstFaceHandler = new FirstFaceHandler();
        this.middleCornersHandler = new MiddleCornersHandler();
        this.lastFirstLayerHandler = new LastFirstLayerHandler();
        this.lastFaceHandler = new LastFaceHandler();
    }

    public Kilominx solve(Kilominx minx) throws MinxMoverException {
        minx = this.startHandler.handle(minx);
        minx = this.firstFaceHandler.handle(minx);
        minx = this.middleCornersHandler.handle(minx);
        minx = this.lastFirstLayerHandler.handle(minx);
        minx = this.lastFaceHandler.handle(minx);
        return minx;
    }
}
