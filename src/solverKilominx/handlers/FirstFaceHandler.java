package solverKilominx.handlers;

import javaminx.data.models.Kilominx;
import javaminx.exceptions.MinxMoverException;
import javaminx.move.kilo.KilominxMover;

import minxSolverHelpers.kilominx.KilominxCornerSeeker;

import solverKilominx.processors.firstCorners.WBYProcessor;
import solverKilominx.processors.firstCorners.WGPProcessor;
import solverKilominx.processors.firstCorners.WGRProcessor;
import solverKilominx.processors.firstCorners.WPYProcessor;

import java.util.List;

public class FirstFaceHandler {

    private final KilominxCornerSeeker seeker;
    private final KilominxMover mover;

    //processors
    private final WGRProcessor wgrProcessor;
    private final WBYProcessor wbyProcessor;
    private final WGPProcessor wgpProcessor;
    private final WPYProcessor wpyProcessor;

    public FirstFaceHandler(){
        this.seeker = new KilominxCornerSeeker();
        this.mover = new KilominxMover();
        this.wgrProcessor = new WGRProcessor();
        this.wbyProcessor = new WBYProcessor();
        this.wgpProcessor = new WGPProcessor();
        this.wpyProcessor = new WPYProcessor();
    }

    public Kilominx handle(Kilominx minx) throws MinxMoverException {
        minx = this.handleWGRCorner(minx);
        minx = this.handleWBYCorner(minx);
        minx = this.handleWGPCorner(minx);
        minx = this.handleWPYCorner(minx);
        return minx;
    }

    private Kilominx handleWGRCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "white_green_red", "white_red_green",
                        "green_white_red", "green_red_white",
                        "red_white_green", "red_green_white"
                }));
        String sequence = this.wgrProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleWBYCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "white_blue_yellow", "white_yellow_blue",
                        "blue_white_yellow", "blue_yellow_white",
                        "yellow_white_blue", "yellow_blue_white"
                }));
        String sequence = this.wbyProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleWGPCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "white_green_purple", "white_purple_green",
                        "green_white_purple", "green_purple_white",
                        "purple_white_green", "purple_green_white"
                }));
        String sequence = this.wgpProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleWPYCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "white_purple_yellow", "white_yellow_purple",
                        "purple_white_yellow", "purple_yellow_white",
                        "yellow_white_purple", "yellow_purple_white"
                }));
        String sequence = this.wpyProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }
}
