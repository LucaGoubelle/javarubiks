package solversCube.solver2x2.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;

import solversCube.solver2x2.processors.firstFace.WBOProcessor;
import solversCube.solver2x2.processors.firstFace.WGOProcessor;
import solversCube.solver2x2.processors.firstFace.WGRProcessor;
import solverHelpers.seekers.Corner2Seeker;

import java.util.List;

public class FirstLayerHandler extends Handler {

    private final WGRProcessor procWGR;
    private final WGOProcessor procWGO;
    private final WBOProcessor procWBO;
    private final Corner2Seeker seeker;

    public FirstLayerHandler(){
        super();
        this.seeker = new Corner2Seeker();
        this.procWGR = new WGRProcessor();
        this.procWGO = new WGOProcessor();
        this.procWBO = new WBOProcessor();
    }

    public Cube handle(Cube cube) throws CubeMoveException {
        cube = this.insertWGR(cube);
        cube = this.insertWGO(cube);
        cube = this.insertWBO(cube);
        return cube;
    }

    private Cube insertWGR(Cube cube) throws CubeMoveException {
        String inputData = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_green_red", "white_red_green",
                "green_white_red", "green_red_white",
                "red_white_green", "red_green_white"
        }));
        String sequence = this.procWGR.process(inputData);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWGO(Cube cube) throws CubeMoveException {
        String inputData = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_green_orange", "white_orange_green",
                "green_white_orange", "green_orange_white",
                "orange_white_green", "orange_green_white"
        }));
        String sequence = this.procWGO.process(inputData);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWBO(Cube cube) throws CubeMoveException {
        String inputData = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_blue_orange", "white_orange_blue",
                "blue_white_orange", "blue_orange_white",
                "orange_white_blue", "orange_blue_white"
        }));
        String sequence = this.procWBO.process(inputData);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }
}
