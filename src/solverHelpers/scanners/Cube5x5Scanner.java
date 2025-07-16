package solverHelpers.scanners;

import javarubik.data.Cube;

import java.util.HashMap;

public class Cube5x5Scanner extends Cube4x4Scanner {

    /**
     * scan an edge on 5x5 cube based on orient param
     * @author: LucaGoubelle
     * */
    public String scanEdge(Cube cube, String orient){
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("up_front:left","");
        hmap.put("up_front:right","");
        hmap.put("up_front","");
        hmap.put("up_back:left","");
        hmap.put("up_back:right","");
        hmap.put("up_back","");
        hmap.put("up_left:front","");
        hmap.put("up_left:back","");
        hmap.put("up_left","");
        hmap.put("up_right:front","");
        hmap.put("up_right:back","");
        hmap.put("up_right","");

        hmap.put("front_left:up","");
        hmap.put("front_left:down","");
        hmap.put("front_left","");
        hmap.put("front_right:up","");
        hmap.put("front_right:down","");
        hmap.put("front_right","");
        hmap.put("back_left:up","");
        hmap.put("back_left:down","");
        hmap.put("back_left","");
        hmap.put("back_right:up","");
        hmap.put("back_right:down","");
        hmap.put("back_right","");

        hmap.put("down_front:left","");
        hmap.put("down_front:right","");
        hmap.put("down_front","");
        hmap.put("down_back:left","");
        hmap.put("down_back:right","");
        hmap.put("down_back","");
        hmap.put("down_left:front","");
        hmap.put("down_left:back","");
        hmap.put("down_left","");
        hmap.put("down_right:front","");
        hmap.put("down_right:back","");
        hmap.put("down_right","");

        return hmap.getOrDefault(orient, "???");
    }
}
