package solversCube.solver3x3CFOP.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import solverHelpers.advanced.F2LScanner;
import solversCube.solver3x3CFOP.cases.F2LPairLeftCases;
import solversCube.solver3x3CFOP.cases.F2LPairRightCases;

public class F2LHandler extends Handler {

    private final F2LScanner f2lScanner;
    private final F2LPairLeftCases f2lPairLeftCases;
    private final F2LPairRightCases f2lPairRightCases;

    public F2LHandler(){
        this.f2lScanner = new F2LScanner();
        this.f2lPairLeftCases = new F2LPairLeftCases();
        this.f2lPairRightCases = new F2LPairRightCases();
    }

    public Cube handleF2LWBR(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanPairLeft(cube);
        if(this.f2lPairLeftCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lPairLeftCases.cases.get(sequence));
        sequence = this.f2lScanner.scanPairRight(cube);
        if(this.f2lPairRightCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lPairRightCases.cases.get(sequence));
        sequence = this.f2lScanner.scanIn(cube);
        //todo: implement next steps
        // - In, HalfIn, split ...
        return cube;
    }
}
