package solverKilominx.handlers;

import javaminx.data.models.Kilominx;
import javaminx.exceptions.MinxMoverException;
import javaminx.move.kilo.KilominxMover;

import minxSolverHelpers.kilominx.KilominxCornerSeeker;

import solverKilominx.processors.middleCorners.*;

import java.util.List;

public class MiddleCornersHandler {

    private final KilominxMover mover;
    private final KilominxCornerSeeker seeker;

    // processors
    private final MagentaBlueRedProcessor mbrProcessor;
    private final LimeYellowBlueProcessor lybProcessor;
    private final OrangePurpleYellowProcessor opyProcessor;
    private final CyanGreenPurpleProcessor cgpProcessor;
    private final BeigeRedGreenProcessor brgProcessor;

    public MiddleCornersHandler(){
        this.mover = new KilominxMover();
        this.seeker = new KilominxCornerSeeker();
        this.mbrProcessor = new MagentaBlueRedProcessor();
        this.lybProcessor = new LimeYellowBlueProcessor();
        this.opyProcessor = new OrangePurpleYellowProcessor();
        this.cgpProcessor = new CyanGreenPurpleProcessor();
        this.brgProcessor = new BeigeRedGreenProcessor();
    }
    
    public Kilominx handle(Kilominx minx) throws MinxMoverException {
        minx = this.handleMagentaBlueRedCorner(minx);
        minx = this.handleLimeYellowBlueCorner(minx);
        minx = this.handleOrangePurpleYellowCorner(minx);
        minx = this.handleCyanGreenPurpleCorner(minx);
        minx = this.handleBeigeRedGreenCorner(minx);
        return minx;
    }

    private Kilominx handleMagentaBlueRedCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "magenta_blue_red", "magenta_red_blue",
                        "blue_magenta_red", "blue_red_magenta",
                        "red_magenta_blue", "red_blue_magenta"
                }));
        String sequence = this.mbrProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleLimeYellowBlueCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "lime_yellow_blue", "lime_blue_yellow",
                        "yellow_lime_blue", "yellow_blue_lime",
                        "blue_lime_yellow", "blue_yellow_lime"
                }));
        String sequence = this.lybProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleOrangePurpleYellowCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "orange_purple_yellow", "orange_yellow_purple",
                        "purple_orange_yellow", "purple_yellow_orange",
                        "yellow_orange_purple", "yellow_purple_orange"
                }));
        String sequence = this.opyProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleCyanGreenPurpleCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "cyan_green_purple", "cyan_purple_green",
                        "green_cyan_purple", "green_purple_cyan",
                        "purple_cyan_green", "purple_green_cyan"
                }));
        String sequence = this.cgpProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }

    private Kilominx handleBeigeRedGreenCorner(Kilominx minx) throws MinxMoverException {
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "beige_red_green", "beige_green_red",
                        "red_beige_green", "red_green_beige",
                        "green_beige_red", "green_red_beige"
                }));
        String sequence = this.brgProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }
}
