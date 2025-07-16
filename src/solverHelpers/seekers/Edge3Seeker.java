package solverHelpers.seekers;

import javarubik.data.Cube;

import solverHelpers.scanners.Cube3x3Scanner;

import java.util.*;

public class Edge3Seeker {

    private final Cube3x3Scanner scanner;

    public Edge3Seeker(){
        this.scanner = new Cube3x3Scanner();
    }

    /**
     * seek an edge based on color posibilities
     * @author: LucaGoubelle
     * */
    public String seekEdge(Cube cube, List<String> posibilities){
        String targetedOrient = "";
        String targetedColors = "";
        HashMap<String, String> edges = this.scanner.scanEdges(cube);
        for(Map.Entry<String, String> entry : edges.entrySet()){
            if(posibilities.contains(entry.getValue())){
                targetedOrient = entry.getKey();
                targetedColors = entry.getValue();
                break;
            }
        }
        return targetedOrient+"::"+targetedColors;
    }
}
