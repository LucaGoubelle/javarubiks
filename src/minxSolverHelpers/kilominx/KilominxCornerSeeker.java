package minxSolverHelpers.kilominx;

import javaminx.data.models.Kilominx;

import java.util.*;

public class KilominxCornerSeeker {
    private final KilominxScanner scanner;

    public KilominxCornerSeeker(){
        this.scanner = new KilominxScanner();
    }

    public String seekCorner(Kilominx minx, List<String> possibilities){
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
