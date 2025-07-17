package solversMinx.solverKilominx.handlers;

import javaminx.data.models.Kilominx;
import javaminx.exceptions.MinxMoverException;
import javaminx.move.kilo.KilominxMover;
import minxSolverHelpers.kilominx.KilominxCornerSeeker;
import minxSolverHelpers.kilominx.KilominxScanner;
import solversMinx.solverKilominx.processors.firstCorners.WBRProcessor;

import java.util.List;

public class StartHandler {

    private final KilominxScanner scanner;
    private final WBRProcessor wbrProcessor;
    private final KilominxCornerSeeker seeker;
    private final KilominxMover mover;

    public StartHandler(){
        this.scanner = new KilominxScanner();
        this.wbrProcessor = new WBRProcessor();
        this.seeker = new KilominxCornerSeeker();
        this.mover = new KilominxMover();
    }

    public Kilominx handle(Kilominx minx) throws MinxMoverException {
        String data = this.scanner.scanCorner(minx, "down_downLeft_downRight");
        if(data.equals("white_blue_red"))
            return minx; // nothing to do
        return this.startFirstPiece(minx);
    }

    private Kilominx startFirstPiece(Kilominx minx) throws MinxMoverException {
        //todo: implement this
        String corner = this.seeker.seekCorner(minx,
                List.of(new String[]{
                        "white_blue_red","white_red_blue",
                        "blue_white_red", "blue_red_white",
                        "red_white_blue", "red_blue_white"
                }));
        String sequence = this.wbrProcessor.process(corner);
        minx = (Kilominx) this.mover.multiMoves(minx, sequence);
        return minx;
    }
}
