package solverHelpers.scanners;

import javarubik.data.Cube;

import java.util.HashMap;

public class Cube2x2Scanner {

    /**
     * scan a corner based on orient param
     * @author: LucaGoubelle
     * */
    public String scanCorner(Cube cube, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        int size = cube.front.length;

        hmap.put("up_front_right", cube.up[size-1][size-1]+"_"+cube.front[0][size-1]+"_"+cube.right[0][0]);
        hmap.put("up_front_left", cube.up[size-1][0]+"_"+cube.front[0][0]+"_"+cube.left[0][size-1]);
        hmap.put("up_back_left", cube.up[0][0]+"_"+cube.back[0][size-1]+"_"+cube.left[0][0]);
        hmap.put("up_back_right", cube.up[0][size-1]+"_"+cube.back[0][0]+"_"+cube.right[0][size-1]);

        hmap.put("down_front_left", cube.down[0][0]+"_"+cube.front[size-1][0]+"_"+cube.left[size-1][size-1]);
        hmap.put("down_front_right", cube.down[0][size-1]+"_"+cube.front[size-1][size-1]+"_"+cube.right[size-1][0]);
        hmap.put("down_back_left", cube.down[size-1][0]+"_"+cube.back[size-1][size-1]+"_"+cube.left[size-1][0]);
        hmap.put("down_back_right", cube.down[size-1][size-1]+"_"+cube.back[size-1][0]+"_"+cube.right[size-1][size-1]);

        return hmap.getOrDefault(orient, "???");
    }

    /**
     * return full information about all the corners
     * @author: LucaGoubelle
     * */
    public HashMap<String, String> scanCorners(Cube cube){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up_front_right", this.scanCorner(cube, "up_front_right"));
        hmap.put("up_front_left", this.scanCorner(cube, "up_front_left"));
        hmap.put("up_back_right", this.scanCorner(cube, "up_back_right"));
        hmap.put("up_back_left", this.scanCorner(cube, "up_back_left"));

        hmap.put("down_front_right", this.scanCorner(cube, "down_front_right"));
        hmap.put("down_front_left", this.scanCorner(cube, "down_front_left"));
        hmap.put("down_back_right", this.scanCorner(cube, "down_back_right"));
        hmap.put("down_back_left", this.scanCorner(cube, "down_back_left"));
        return hmap;
    }

}
