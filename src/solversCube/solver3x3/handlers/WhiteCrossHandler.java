package solversCube.solver3x3.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import solverHelpers.seekers.Edge3Seeker;
import solversCube.solver3x3.processors.firstEdges.*;

import java.util.List;

public class WhiteCrossHandler extends Handler {
    private final Edge3Seeker seeker;
    private final WBProcessor procWB;
    private final WRProcessor procWR;
    private final WGProcessor procWG;
    private final WOProcessor procWO;

    public WhiteCrossHandler(){
        this.seeker = new Edge3Seeker();
        this.procWB = new WBProcessor();
        this.procWR = new WRProcessor();
        this.procWG = new WGProcessor();
        this.procWO = new WOProcessor();
    }

    private Cube insertWB(Cube cube) throws CubeMoveException {
        String edge = this.seeker.seekEdge(cube, List.of(new String[]{"white_blue","blue_white"}));
        String sequence = this.procWB.process(edge);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWR(Cube cube) throws CubeMoveException {
        String edge = this.seeker.seekEdge(cube, List.of(new String[]{"white_red","red_white"}));
        String sequence = this.procWR.process(edge);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWG(Cube cube) throws CubeMoveException {
        String edge = this.seeker.seekEdge(cube, List.of(new String[]{"white_green","green_white"}));
        String sequence = this.procWG.process(edge);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWO(Cube cube) throws CubeMoveException {
        String edge = this.seeker.seekEdge(cube, List.of(new String[]{"white_orange","orange_white"}));
        String sequence = this.procWO.process(edge);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    public Cube handle(Cube cube) throws CubeMoveException {
        cube = this.insertWB(cube);
        cube = this.insertWR(cube);
        cube = this.insertWG(cube);
        cube = this.insertWO(cube);
        return cube;
    }

}
