package solver2x2.handlers;

import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;
import javarubik.move.Mover;

import solver2x2.processors.firstFace.WBRProcessor;
import solverHelpers.scanners.Cube2x2Scanner;
import solverHelpers.seekers.Corner2Seeker;

import java.util.List;

public class StartHandler {

    private final Mover mover;
    private final Cube2x2Scanner scanner;
    private final WBRProcessor proc;
    private final Corner2Seeker seeker;

    public StartHandler(){
        this.mover = new Mover();
        this.proc = new WBRProcessor();
        this.scanner = new Cube2x2Scanner();
        this.seeker = new Corner2Seeker();
        
    }

    public Cube start(Cube cube) throws CubeMoveException {
        String preResult = this.scanner.scanCorner(cube, "down_front_right");
        if(preResult.equals("white_blue_red"))
            return cube; // nothing to do
        return this.handleFirstCorner(cube);
    }

    private Cube handleFirstCorner(Cube cube) throws CubeMoveException {
        String inputData = this.seeker.seekCorner(cube, List.of(new String[]{
                "white_blue_red", "white_red_blue",
                "blue_white_red", "blue_red_white",
                "red_white_blue", "red_blue_white"
        }));
        String sequence = this.proc.process(inputData);
        cube = this.mover.multiMoves(cube, sequence);
        return cube;
    }
}
