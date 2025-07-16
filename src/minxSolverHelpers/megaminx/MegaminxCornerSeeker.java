package minxSolverHelpers.megaminx;

import javaminx.data.models.Megaminx;

import java.util.*;

public class MegaminxCornerSeeker {

    private final MegaminxScanner scanner;

    public MegaminxCornerSeeker(){
        this.scanner = new MegaminxScanner();
    }

    public String seekCorner(Megaminx minx, List<String> possibilities){
        String targetedOrient = "";
        String targetedColors = "";
        HashMap<String, String> corners = this.scanner.scanCorners(minx);
        for(Map.Entry<String, String> entry : corners.entrySet())
            if(possibilities.contains(entry.getValue())){
                targetedOrient = entry.getKey();
                targetedColors = entry.getValue();
                break;
            }
        return targetedOrient+"::"+targetedColors;
    }

}
