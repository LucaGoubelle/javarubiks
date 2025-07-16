package minxSolverHelpers.megaminx;

import javaminx.data.models.Megaminx;

import java.util.HashMap;

public class MegaminxScanner {

    public String scanCenter(Megaminx minx, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up", minx.up[1][0]);
        hmap.put("front", minx.front[1][0]);
        hmap.put("left", minx.left[1][0]);
        hmap.put("right", minx.right[1][0]);
        hmap.put("downLeft", minx.downLeft[1][0]);
        hmap.put("downRight", minx.downRight[1][0]);
        hmap.put("absLeft", minx.absLeft[1][0]);
        hmap.put("absRight", minx.absRight[1][0]);
        hmap.put("backLeft", minx.backLeft[1][0]);
        hmap.put("backRight", minx.backRight[1][0]);
        hmap.put("back", minx.back[1][0]);
        hmap.put("down", minx.down[1][0]);
        return hmap.getOrDefault(orient, "???");
    }

    public String scanEdge(Megaminx minx, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up_front", minx.up[0][5]+"_"+minx.front[0][1]);
        hmap.put("up_left", minx.up[0][7]+"_"+minx.left[0][1]);
        hmap.put("up_right", minx.up[0][3]+"_"+minx.right[0][1]);
        hmap.put("up_backLeft", minx.up[0][9]+"_"+minx.backLeft[0][1]);
        hmap.put("up_backRight", minx.up[0][1]+"_"+minx.backRight[0][1]);
        //todo: implement other cases
        return hmap.getOrDefault(orient, "???");
    }

    public String scanCorner(Megaminx minx, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up_front_left", minx.up[0][6]+"_"+minx.front[0][0]+"_"+minx.left[0][2]);
        hmap.put("up_front_right", minx.up[0][4]+"_"+minx.front[0][2]+"_"+minx.right[0][0]);
        hmap.put("up_backLeft_left", minx.up[0][8]+"_"+minx.backLeft[0][2]+"_"+minx.left[0][0]);
        hmap.put("up_backRight_right", minx.up[0][2]+"_"+minx.backRight[0][0]+"_"+minx.right[0][2]);
        hmap.put("up_backLeft_backRight", minx.up[0][0]+"_"+minx.backLeft[0][0]+"_"+minx.backRight[0][2]);
        //todo: implement other cases
        return hmap.getOrDefault(orient, "???");
    }

    public HashMap<String, String> scanEdges(Megaminx minx){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up_front", this.scanEdge(minx, "up_front"));
        hmap.put("up_left", this.scanEdge(minx, "up_left"));
        hmap.put("up_right", this.scanEdge(minx, "up_right"));
        hmap.put("up_backLeft", this.scanEdge(minx, "up_backLeft"));
        hmap.put("up_backRight", this.scanEdge(minx, "up_backRight"));
        return hmap;
    }

    public HashMap<String, String> scanCorners(Megaminx minx){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up_front_left", this.scanCorner(minx, "up_front_left"));
        hmap.put("up_front_right", this.scanCorner(minx, "up_front_right"));
        hmap.put("up_backLeft_left", this.scanCorner(minx, "up_backLeft_left"));
        hmap.put("up_backRight_right", this.scanCorner(minx, "up_backRight_right"));
        hmap.put("up_backLeft_backRight", this.scanCorner(minx, "up_backLeft_backRight"));
        return hmap;
    }

}
