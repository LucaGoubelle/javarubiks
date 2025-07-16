package minxSolverHelpers.kilominx;

import javaminx.data.models.Kilominx;

import java.util.HashMap;

public class KilominxScanner {

    public String scanCorner(Kilominx minx, String orient){
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("up_front_left", minx.up[3]+"_"+minx.front[0]+"_"+minx.left[1]);
        hmap.put("up_front_right", minx.up[2]+"_"+minx.front[1]+"_"+minx.right[0]);
        hmap.put("up_backLeft_left", minx.up[4]+"_"+minx.backLeft[1]+"_"+minx.left[0]);
        hmap.put("up_backRight_right", minx.up[1]+"_"+minx.backRight[0]+"_"+minx.right[1]);
        hmap.put("up_backLeft_backRight", minx.up[0]+"_"+minx.backLeft[0]+"_"+minx.backRight[1]);

        hmap.put("front_downLeft_downRight", minx.front[3]+"_"+minx.downLeft[1]+"_"+minx.downRight[4]);
        //todo: implement remaining cases

        hmap.put("down_downLeft_downRight", minx.down[0]+"_"+minx.downLeft[2]+"_"+minx.downRight[3]);
        hmap.put("down_downLeft_absLeft", minx.down[4]+"_"+minx.downLeft[3]+"_"+minx.absLeft[2]);
        hmap.put("down_downRight_absRight", minx.down[1]+"_"+minx.downRight[2]+"_"+minx.absRight[3]);
        hmap.put("down_back_absLeft", minx.down[3]+"_"+minx.back[2]+"_"+minx.absLeft[3]);
        hmap.put("down_back_absRight", minx.down[2]+"_"+minx.back[3]+"_"+minx.absRight[2]);
        return hmap.getOrDefault(orient, "???");
    }

    public HashMap<String, String> scanCorners(Kilominx minx){
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("up_front_left", this.scanCorner(minx, "up_front_left"));
        hmap.put("up_front_right", this.scanCorner(minx, "up_front_right"));
        hmap.put("up_backLeft_left", this.scanCorner(minx, "up_backLeft_left"));
        hmap.put("up_backRight_right", this.scanCorner(minx, "up_backRight_right"));
        hmap.put("up_backLeft_backRight", this.scanCorner(minx, "up_backLeft_backRight"));

        hmap.put("front_downLeft_downRight", this.scanCorner(minx, "front_downLeft_downRight"));

        hmap.put("down_downLeft_downRight", this.scanCorner(minx, "down_downLeft_downRight"));
        hmap.put("down_downLeft_absLeft", this.scanCorner(minx, "down_downLeft_absLeft"));
        hmap.put("down_downRight_absRight", this.scanCorner(minx, "down_downRight_absRight"));
        hmap.put("down_back_absLeft", this.scanCorner(minx, "down_back_absLeft"));
        hmap.put("down_back_absRight", this.scanCorner(minx, "down_back_absRight"));

        return hmap;
    }
}
