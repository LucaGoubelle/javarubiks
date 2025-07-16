package solverHelpers.seekers;

import javarubik.data.Cube;
import solverHelpers.scanners.Cube3x3Scanner;

import java.util.*;

public class Corner3Seeker {

    private final Cube3x3Scanner scanner;

    public Corner3Seeker(){
        this.scanner = new Cube3x3Scanner();
    }

    /**
     * seek a corner based on color posibilities
     * @author: LucaGoubelle
     * */
    public String seekCorner(Cube cube, List<String> possibilities){
        String targetedOrient = "";
        String targetedColors = "";
        HashMap<String, String> corners = this.scanner.scanCorners(cube);
        for(Map.Entry<String, String> entry : corners.entrySet())
            if(possibilities.contains(entry.getValue())){
                targetedOrient = entry.getKey();
                targetedColors = entry.getValue();
                break;
            }
        return targetedOrient+"::"+targetedColors;
    }
}
