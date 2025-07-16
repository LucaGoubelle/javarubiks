package solverMegaminx.handlers.firstFace;

import javaminx.data.models.Megaminx;
import javaminx.move.mega.MegaminxMover;
import minxSolverHelpers.megaminx.MegaminxScanner;
import solverMegaminx.processors.CenterProcessor;

public class StartHandler {
    private final MegaminxScanner scanner;
    private final MegaminxMover mover;
    private final CenterProcessor processor;

    public StartHandler(){
        this.scanner = new MegaminxScanner();
        this.mover = new MegaminxMover();
        this.processor = new CenterProcessor();
    }

    public Megaminx handle(Megaminx minx){
        String centerDown = this.scanner.scanCenter(minx, "down");
        String centerDownLeft = this.scanner.scanCenter(minx, "downLeft");
        String centerDownRight = this.scanner.scanCenter(minx, "downRight");
        String data = centerDown+"_"+centerDownLeft+"_"+centerDownRight;
        if(data.equals("white_blue_red"))
            return minx; // nothing to do
        return this.startOrienting(minx, data);
    }

    private Megaminx startOrienting(Megaminx minx, String data){
        String result = this.processor.process(data);
        minx = (Megaminx) this.mover.multiMoves(minx, result);
        return minx;
    }
}
