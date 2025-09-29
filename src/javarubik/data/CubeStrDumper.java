package javarubik.data;

import java.util.HashMap;

public class CubeStrDumper {

    private final HashMap<String, String> hmap;

    /**
     * Create a string object with sequence of char corresponding to color of sticker
     * @Author: LucaGoubelle
     * */
    public CubeStrDumper(){
        this.hmap = new HashMap<>();
        this.hmap.put("green", "G");
        this.hmap.put("blue", "B");
        this.hmap.put("red", "R");
        this.hmap.put("orange", "O");
        this.hmap.put("yellow", "Y");
        this.hmap.put("white", "W");
    }

    private String dumpFace(String[][] face){
        StringBuilder content = new StringBuilder();
        for(String[] row : face)
            for(String elem : row)
                content.append(this.hmap.getOrDefault(elem, "?"));
        return content.toString();
    }

    public String dump(Cube cube){
        String content = "";
        content += this.dumpFace(cube.back)+"_";
        content += this.dumpFace(cube.up)+"_";
        content += this.dumpFace(cube.front)+"_";
        content += this.dumpFace(cube.left)+"_";
        content += this.dumpFace(cube.right)+"_";
        content += this.dumpFace(cube.down);
        return content;
    }

}
