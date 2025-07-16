package solverHelpers;

import java.util.Arrays;

public class CubeColorDetector {

    public int[][] detectColorOnFace(String[][] face, String color){
        int size = face.length;
        int[][] resultDetector = new int[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                resultDetector[i][j] = (face[i][j].equals(color)) ? 1 : 0 ;
        return resultDetector;
    }

    public boolean detectColorOnEdge(String edge, String[] colors){
        String[] results = edge.split("_");
        boolean cond1 = Arrays.asList(results).contains(colors[0]);
        boolean cond2 = Arrays.asList(results).contains(colors[1]);
        return cond1 && cond2;
    }

    public boolean detectColorOnCorner(String corner, String[] colors){
        String[] results = corner.split("_");
        boolean cond1 = Arrays.asList(results).contains(colors[0]);
        boolean cond2 = Arrays.asList(results).contains(colors[1]);
        boolean cond3 = Arrays.asList(results).contains(colors[2]);
        return cond1 && cond2 && cond3;
    }

}
