package solversCube.solver3x3CFOP;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import solversCube.solver3x3CFOP.handlers.F2LHandlers.F2LsHandler;

public class Solver3x3CFOP {
    private final F2LsHandler f2LsHandler;

    public Solver3x3CFOP(){
        this.f2LsHandler = new F2LsHandler();
    }

    public Cube solve(Cube cube) throws CubeMoveException {
        cube = this.f2LsHandler.handle(cube);
        return cube;
    }

}
