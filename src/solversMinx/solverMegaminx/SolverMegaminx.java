package solversMinx.solverMegaminx;

import javaminx.data.models.Megaminx;

import javaminx.exceptions.MinxMoverException;
import solversMinx.solverMegaminx.handlers.*;
import solversMinx.solverMegaminx.handlers.firstFace.*;
import solversMinx.solverMegaminx.handlers.lastFace.*;

public class SolverMegaminx {

    private final StartHandler startHandler;
    private final WhiteStarHandler whiteStarHandler;
    private final FirstCornersHandler firstCornersHandler;
    private final SecondLayerHandler secondLayerHandler;
    private final PrismsHandler prismsHandler;
    private final MiddleCornersHandler middleCornersHandler;
    private final FirstLastLayerHandler firstLastLayerHandler;
    private final GreyStarHandler greyStarHandler;
    private final LastCornersHandler lastCornersHandler;

    public SolverMegaminx(){
        this.startHandler = new StartHandler();
        this.whiteStarHandler = new WhiteStarHandler();
        this.firstCornersHandler = new FirstCornersHandler();
        this.secondLayerHandler = new SecondLayerHandler();
        this.prismsHandler = new PrismsHandler();
        this.middleCornersHandler = new MiddleCornersHandler();
        this.firstLastLayerHandler = new FirstLastLayerHandler();
        this.greyStarHandler = new GreyStarHandler();
        this.lastCornersHandler = new LastCornersHandler();
    }

    private Megaminx solveFirstFace(Megaminx minx) throws MinxMoverException {
        minx = this.startHandler.handle(minx);
        minx = this.whiteStarHandler.handle(minx);
        minx = this.firstCornersHandler.handle(minx);
        return minx;
    }

    private Megaminx solveSecondPart(Megaminx minx){
        minx = this.secondLayerHandler.handle(minx);
        minx = this.prismsHandler.handle(minx);
        return minx;
    }

    private Megaminx solveThirdPart(Megaminx minx){
        minx = this.middleCornersHandler.handle(minx);
        minx = this.firstLastLayerHandler.handle(minx);
        return minx;
    }

    private Megaminx solveLastFace(Megaminx minx){
        minx = this.greyStarHandler.handle(minx);
        minx = this.lastCornersHandler.handle(minx);
        return minx;
    }

    public Megaminx solve(Megaminx minx) throws MinxMoverException {
        minx = this.solveFirstFace(minx);
        minx = this.solveSecondPart(minx);
        minx = this.solveThirdPart(minx);
        minx = this.solveLastFace(minx);
        return minx;
    }
}
