package solversCube.solver3x3.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;

import solverHelpers.scanners.Cube3x3Scanner;
import solversCube.solver3x3.processors.StartProcessor;

public class StartHandler extends Handler {

    private final Cube3x3Scanner scanner;
    private final StartProcessor startProc;

    public StartHandler(){
        super();
        this.scanner = new Cube3x3Scanner();
        this.startProc = new StartProcessor();
    }

    public Cube start(Cube cube) throws CubeMoveException {
        String result1 = this.scanner.scanCenter(cube, "up");
        String result2 = this.scanner.scanCenter(cube, "front");
        String result = result1 + "_" + result2;
        return this.mover.multiMoves(cube, this.startProc.process(result));
    }

}
