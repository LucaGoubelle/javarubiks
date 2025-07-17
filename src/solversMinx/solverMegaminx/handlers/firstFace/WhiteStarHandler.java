package solversMinx.solverMegaminx.handlers.firstFace;

import javaminx.data.models.Megaminx;
import javaminx.exceptions.MinxMoverException;
import javaminx.move.mega.MegaminxMover;
import minxSolverHelpers.megaminx.MegaminxEdgeSeeker;
import solversMinx.solverMegaminx.processors.firstEdges.WBProcessor;
import solversMinx.solverMegaminx.processors.firstEdges.WRProcessor;
import solversMinx.solverMegaminx.processors.firstEdges.WYProcessor;

import java.util.HashMap;
import java.util.List;

public class WhiteStarHandler {

    private final MegaminxEdgeSeeker seeker;
    private final MegaminxMover mover;
    private final WBProcessor wbProcessor;
    private final WRProcessor wrProcessor;
    private final WYProcessor wyProcessor;

    public WhiteStarHandler(){
        this.seeker = new MegaminxEdgeSeeker();
        this.mover = new MegaminxMover();
        this.wbProcessor = new WBProcessor();
        this.wrProcessor = new WRProcessor();
        this.wyProcessor = new WYProcessor();
    }

    public Megaminx handle(Megaminx minx) throws MinxMoverException {
        minx = this._handleWBEdge(minx);
        minx = this._handleWREdge(minx);
        minx = this._handleWYEdge(minx);
        minx = this._handleWGEdge(minx);
        minx = this._handleWPEdge(minx);
        return minx;
    }

    private Megaminx _handleWBEdge(Megaminx minx) throws MinxMoverException {
        String edge = this.seeker.seekEdge(minx, List.of(new String[]{"white_blue", "blue_white"}));
        String result = this.wbProcessor.process(edge);
        return (Megaminx) this.mover.multiMoves(minx, result);
    }

    private Megaminx _handleWREdge(Megaminx minx) throws MinxMoverException {
        String edge = this.seeker.seekEdge(minx, List.of(new String[]{"white_red", "red_white"}));
        String result = this.wrProcessor.process(edge);
        return (Megaminx) this.mover.multiMoves(minx, result);
    }

    private Megaminx _handleWYEdge(Megaminx minx) throws MinxMoverException {
        String edge = this.seeker.seekEdge(minx, List.of(new String[]{"white_yellow", "yellow_white"}));
        String result = this.wyProcessor.process(edge);
        return (Megaminx) this.mover.multiMoves(minx, result);
    }

    private Megaminx _handleWGEdge(Megaminx minx) throws MinxMoverException {
        String result = this.seeker.seekEdge(minx, List.of(new String[]{"white_green", "green_white"}));
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("down_absRight::white_green", "");
        // implement remaining cases
        return (Megaminx) this.mover.multiMoves(minx, hmap.getOrDefault(result, ""));
    }

    private Megaminx _handleWPEdge(Megaminx minx) throws MinxMoverException {
        String result = this.seeker.seekEdge(minx, List.of(new String[]{"white_purple", "green_purple"}));
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("down_back::white_purple", "");
        // implement remaining cases
        return (Megaminx) this.mover.multiMoves(minx, hmap.getOrDefault(result, ""));
    }
}
