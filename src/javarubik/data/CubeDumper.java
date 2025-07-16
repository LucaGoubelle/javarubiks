package javarubik.data;

public class CubeDumper {
    private String genRow(String[] row){
        String content = "[";
        for(String elem : row)
            content += "\""+elem+"\"" + ", ";
        content = content.replaceAll(".$","");
        content = content.replaceAll(".$","");
        content += "],\n";
        return content;
    }

    private String genFace(String[][] face){
        String content = "[\n";
        for(String[] row : face)
            content += this.genRow(row);
        content = content.replaceAll(".$","");
        content += "],\n";
        return content;
    }

    /**
     * Generate a JSON String from a cube object
     * @author: LucaGoubelle
     * */
    public String dump(Cube cube){
        String content = "{\n";
        content += "back:"+this.genFace(cube.back);
        content += "up:"+this.genFace(cube.up);
        content += "front:"+this.genFace(cube.front);
        content += "left:"+this.genFace(cube.left);
        content += "right:"+this.genFace(cube.right);
        content += "down:"+this.genFace(cube.down);
        content = content.replaceAll(".$","");
        content += "\n}\n";
        return content;
    }
}
