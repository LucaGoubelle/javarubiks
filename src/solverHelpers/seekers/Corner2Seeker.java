package solverHelpers.seekers;

import javarubik.data.Cube;

import solverHelpers.scanners.Cube2x2Scanner;

import java.util.*;

public class Corner2Seeker {
    private final Cube2x2Scanner scanner;

    public Corner2Seeker(){
        this.scanner = new Cube2x2Scanner();
    }

    /**
     * seek a corner based on color posibilities
     * @author: LucaGoubelle
     * */
    public String seekCorner(Cube cube, List<String> posibilities){
        String targetedOrient = "";
        String targetedColors = "";
        HashMap<String, String> corners = this.scanner.scanCorners(cube);
        for(Map.Entry<String, String> entry : corners.entrySet())
            if(posibilities.contains(entry.getValue())){
                targetedOrient = entry.getKey();
                targetedColors = entry.getValue();
                break;
            }
        return targetedOrient+"::"+targetedColors;
    }
}
