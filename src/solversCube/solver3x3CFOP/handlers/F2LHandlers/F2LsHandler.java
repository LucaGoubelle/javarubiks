package solversCube.solver3x3CFOP.handlers.F2LHandlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;

public class F2LsHandler {

    private final F2LWBRHandler f2lWBRHandler;

    public F2LsHandler(){
        this.f2lWBRHandler = new F2LWBRHandler();
    }

    public Cube handle(Cube cube) throws CubeMoveException {
        cube = this.f2lWBRHandler.handle(cube);
        //todo: implement remaining lines
        return cube;
    }
}
