package solversMinx.solverMegaminx.handlers.firstFace;

import javaminx.data.models.Megaminx;
import javaminx.exceptions.MinxMoverException;

import minxSolverHelpers.megaminx.MegaminxScanner;
import solversMinx.solverMegaminx.handlers.Handler;
import solversMinx.solverMegaminx.processors.CenterProcessor;

public class StartHandler extends Handler {
    private final MegaminxScanner scanner;
    private final CenterProcessor processor;

    public StartHandler(){
        super();
        this.scanner = new MegaminxScanner();
        this.processor = new CenterProcessor();
    }

    public Megaminx handle(Megaminx minx) throws MinxMoverException {
        String centerDown = this.scanner.scanCenter(minx, "down");
        String centerDownLeft = this.scanner.scanCenter(minx, "downLeft");
        String centerDownRight = this.scanner.scanCenter(minx, "downRight");
        String data = centerDown+"_"+centerDownLeft+"_"+centerDownRight;
        if(data.equals("white_blue_red"))
            return minx; // nothing to do
        return this.startOrienting(minx, data);
    }

    private Megaminx startOrienting(Megaminx minx, String data) throws MinxMoverException {
        String result = this.processor.process(data);
        minx = (Megaminx) this.mover.multiMoves(minx, result);
        return minx;
    }
}
