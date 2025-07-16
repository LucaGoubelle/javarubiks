package solverHelpers.scanners;

import javarubik.data.Cube;

import java.util.HashMap;

public class Cube4x4Scanner extends Cube3x3Scanner {

    /**
     * scan a centerpiece based on orient and coord params
     * @author: LucaGoubelle
     * */
    public String scanCenter(Cube cube, String orient, int[] coord){
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("back",cube.back[coord[0]][coord[1]]);
        hmap.put("up",cube.up[coord[0]][coord[1]]);
        hmap.put("front",cube.front[coord[0]][coord[1]]);
        hmap.put("left",cube.left[coord[0]][coord[1]]);
        hmap.put("right",cube.right[coord[0]][coord[1]]);
        hmap.put("down",cube.down[coord[0]][coord[1]]);

        return hmap.getOrDefault(orient, "???");
    }

    /**
     * scan an edge on 4x4 cube based on orient param
     * @author: LucaGoubelle
     * */
    public String scanEdge(Cube cube, String orient){
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("up_front:left","");
        hmap.put("up_front:right","");
        hmap.put("up_back:left","");
        hmap.put("up_back:right","");
        hmap.put("up_left:front","");
        hmap.put("up_left:back","");
        hmap.put("up_right:front","");
        hmap.put("up_right:back","");

        hmap.put("front_left:up","");
        hmap.put("front_left:down","");
        hmap.put("front_right:up","");
        hmap.put("front_right:down","");
        hmap.put("back_left:up","");
        hmap.put("back_left:down","");
        hmap.put("back_right:up","");
        hmap.put("back_right:down","");

        hmap.put("down_front:left","");
        hmap.put("down_front:right","");
        hmap.put("down_back:left","");
        hmap.put("down_back:right","");
        hmap.put("down_left:front","");
        hmap.put("down_left:back","");
        hmap.put("down_right:front","");
        hmap.put("down_right:back","");

        return hmap.getOrDefault(orient, "???");
    }
}
