package solverHelpers;

import javarubik.data.Cube;

import java.util.ArrayList;
import java.util.List;

public class CrownScanner {


    /**
     * scan the up crown of the cube
     * @author: LucaGoubelle
     * */
    public List<List<String>> scanCrown(Cube cube){
        List<List<String>> crown = new ArrayList<>();
        crown.add(this.scanBackOfCrown(cube));
        for(int i=0;i<cube.up.length;i++)
            crown.add(this.scanUpOfCrown(cube, i));
        crown.add(this.scanFrontOfCrown(cube));
        return crown;
    }



    private List<String> scanBackOfCrown(Cube cube){
        int size = cube.up.length;
        List<String> row = new ArrayList<>();
        for(int i=size-1; i>=0; i--)
            row.add(cube.back[0][i]);
        return row;
    }

    private List<String> scanFrontOfCrown(Cube cube){
        int size = cube.up.length;
        List<String> row = new ArrayList<>();
        for(int i=0; i<size; i++)
            row.add(cube.front[0][i]);
        return row;
    }

    private List<String> scanUpOfCrown(Cube cube, int index){
        int last = cube.up.length - 1;
        List<String> row = new ArrayList<>();
        row.add(cube.left[0][index]);
        for(int i=0;i<last+1;i++)
            row.add(cube.up[index][i]);
        row.add(cube.right[0][last-index]);
        return row;
    }

}
