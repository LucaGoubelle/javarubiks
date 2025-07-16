package solverHelpers.scanners;

import javarubik.data.Cube;

import java.util.HashMap;

public class Cube3x3Scanner extends Cube2x2Scanner {

    /**
     * scan a center based on orient param
     * @author: LucaGoubelle
     * */
    public String scanCenter(Cube cube, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("back", cube.back[1][1]);
        hmap.put("up", cube.up[1][1]);
        hmap.put("front", cube.front[1][1]);
        hmap.put("left", cube.left[1][1]);
        hmap.put("right", cube.right[1][1]);
        hmap.put("down", cube.down[1][1]);

        return hmap.getOrDefault(orient, "???");
    }

    /**
     * scan an edge based on orient param
     * @author: LucaGoubelle
     * */
    public String scanEdge(Cube cube, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        // not used // int size = cube.front.length;
        hmap.put("up_front", cube.up[2][1]+"_"+cube.front[0][1]);
        hmap.put("up_right", cube.up[1][2]+"_"+cube.right[0][1]);
        hmap.put("up_left", cube.up[1][0]+"_"+cube.left[0][1]);
        hmap.put("up_back", cube.up[0][1]+"_"+cube.back[0][1]);

        hmap.put("front_left",  cube.front[1][0]+"_"+cube.left[1][2]);
        hmap.put("front_right", cube.front[1][2]+"_"+cube.right[1][0]);
        hmap.put("back_left",   cube.back[1][2]+"_"+cube.left[1][0]);
        hmap.put("back_right",  cube.back[1][0]+"_"+cube.right[1][2]);

        hmap.put("down_front", cube.down[0][1]+"_"+cube.front[2][1]);
        hmap.put("down_right", cube.down[1][2]+"_"+cube.right[2][1]);
        hmap.put("down_left", cube.down[1][0]+"_"+cube.left[2][1]);
        hmap.put("down_back", cube.down[2][1]+"_"+cube.back[2][1]);

        return hmap.getOrDefault(orient, "???");
    }

    /**
     * return full information about all the edges
     * @author: LucaGoubelle
     * */
    public HashMap<String, String> scanEdges(Cube cube){
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("up_front", scanEdge(cube, "up_front"));
        hmap.put("up_left", scanEdge(cube, "up_left"));
        hmap.put("up_right", scanEdge(cube, "up_right"));
        hmap.put("up_back", scanEdge(cube, "up_back"));

        hmap.put("front_left",scanEdge(cube, "front_left"));
        hmap.put("front_right",scanEdge(cube, "front_right"));
        hmap.put("back_left",scanEdge(cube, "back_left"));
        hmap.put("back_right",scanEdge(cube, "back_right"));

        hmap.put("down_front", scanEdge(cube, "down_front"));
        hmap.put("down_left", scanEdge(cube, "down_left"));
        hmap.put("down_right", scanEdge(cube, "down_right"));
        hmap.put("down_back", scanEdge(cube, "down_back"));

        return hmap;
    }
}
