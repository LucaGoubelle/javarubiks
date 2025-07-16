package minxSolverHelpers.megaminx;

import javaminx.data.models.Megaminx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MegaminxEdgeSeeker {

    private final MegaminxScanner scanner;

    public MegaminxEdgeSeeker(){
        this.scanner = new MegaminxScanner();
    }
    public String seekEdge(Megaminx minx, List<String> possibilities){
        String targetedOrient = "";
        String targetedColors = "";
        HashMap<String, String> edges = this.scanner.scanEdges(minx);
        for(Map.Entry<String, String> entry : edges.entrySet())
            if(possibilities.contains(entry.getValue())){
                targetedOrient = entry.getKey();
                targetedColors = entry.getValue();
                break;
            }
        return targetedOrient+"::"+targetedColors;

    }
}
