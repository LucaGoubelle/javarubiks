package solversCube.solver3x3CFOP.handlers.F2LHandlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;

public class F2LWBRHandler extends F2LHandler {

    private Cube handlePairLeft(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanPairLeft(cube);
        if(this.f2lPairLeftCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lPairLeftCases.cases.get(sequence));
        return cube;
    }

    private Cube handlePairRight(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanPairRight(cube);
        if(this.f2lPairRightCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lPairRightCases.cases.get(sequence));
        return cube;
    }

    private Cube handleIn(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanIn(cube);
        if(this.f2lInCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lInCases.cases.get(sequence));
        return cube;
    }

    private Cube handleHalfIn(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanHalfIn(cube);
        if(this.f2lHalfInCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lHalfInCases.cases.get(sequence));
        return cube;
    }

    private Cube handleSplitLeft(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanSplitLeft(cube);
        if(this.f2lSplitLeftCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lSplitLeftCases.cases.get(sequence));
        return cube;
    }

    private Cube handleSplitBack(Cube cube) throws CubeMoveException {
        String sequence = this.f2lScanner.scanSplitBack(cube);
        if(this.f2lSplitBackCases.cases.containsKey(sequence))
            return this.mover.multiMoves(cube, this.f2lSplitBackCases.cases.get(sequence));
        return cube;
    }

    public Cube handle(Cube cube) throws CubeMoveException {
        cube = this.handlePairLeft(cube);
        cube = this.handlePairRight(cube);
        cube = this.handleIn(cube);
        cube = this.handleHalfIn(cube);
        cube = this.handleSplitLeft(cube);
        cube = this.handleSplitBack(cube);
        return cube;
    }
}
