package solversCube.solver3x3.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import solverHelpers.seekers.Corner3Seeker;
import solversCube.solver3x3.processors.firstCorners.*;

import java.util.List;

public class FirstLayerHandler extends Handler {

    private final Corner3Seeker seeker;
    private final WBRProcessor procWBR;
    private final WGRProcessor procWGR;
    private final WGOProcessor procWGO;
    private final WBOProcessor procWBO;


    private Cube insertWBR(Cube cube) throws CubeMoveException {
        String corner = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_blue_red", "white_red_blue",
                "blue_white_red", "blue_red_white",
                "red_white_blue", "red_blue_white"}
        ));
        String sequence = this.procWBR.process(corner);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWGR(Cube cube) throws CubeMoveException {
        String corner = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_green_red", "white_red_green",
                "green_white_red", "green_red_white",
                "red_white_green", "red_green_white"
        }));
        String sequence = this.procWGR.process(corner);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWGO(Cube cube) throws CubeMoveException {
        String corner = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_green_orange", "white_orange_green",
                "green_white_orange", "green_orange_white",
                "orange_white_green", "orange_green_white"
        }));
        String sequence = this.procWGO.process(corner);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    private Cube insertWBO(Cube cube) throws CubeMoveException {
        String corner = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_blue_orange", "white_orange_blue",
                "blue_white_orange", "blue_orange_white",
                "orange_white_blue", "orange_blue_white"
        }));
        String sequence = this.procWBO.process(corner);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }

    public FirstLayerHandler(){
        this.seeker = new Corner3Seeker();
        this.procWBR = new WBRProcessor();
        this.procWGR = new WGRProcessor();
        this.procWGO = new WGOProcessor();
        this.procWBO = new WBOProcessor();
    }

    public Cube handle(Cube cube) throws CubeMoveException {
        cube = this.insertWBR(cube);
        cube = this.insertWGR(cube);
        cube = this.insertWGO(cube);
        cube = this.insertWBO(cube);
        return cube;
    }
}
