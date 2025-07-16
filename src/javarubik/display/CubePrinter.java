package javarubik.display;

import javarubik.data.Cube;
import javarubik.exceptions.CubePrinterException;

import java.util.HashMap;

public class CubePrinter {
    public HashMap<String, String> hmapColor;

    public CubePrinter(){
        this.hmapColor = new HashMap<>();
        this.hmapColor.put("white", ANSIColors.BACKGROUND_WHITE+" "+ANSIColors.ANSI_RESET);
        this.hmapColor.put("yellow", ANSIColors.BACKGROUND_YELLOW+" "+ANSIColors.ANSI_RESET);
        this.hmapColor.put("blue", ANSIColors.BACKGROUND_BLUE+" "+ANSIColors.ANSI_RESET);
        this.hmapColor.put("red", ANSIColors.BACKGROUND_RED+" "+ANSIColors.ANSI_RESET);
        this.hmapColor.put("green", ANSIColors.BACKGROUND_GREEN+" "+ANSIColors.ANSI_RESET);
        this.hmapColor.put("orange", ANSIColors.BACKGROUND_MAGENTA+" "+ANSIColors.ANSI_RESET);
    }


    /**
     * Print a cube object in the console,
     * throw a CubePrinterException if param cube is not a cube object
     * @author: LucaGoubelle
     * */
    public void print(Cube cube) throws CubePrinterException {
        try{
            String content = "";
            for(String[] row : cube.up) content += this.printRowUpDown(row);
            for(int i=0;i<cube.front.length;i++) content += this.printRowLFRB(
                    cube.left[i], cube.front[i], cube.right[i], cube.back[i]);
            for(String[] row : cube.down) content += this.printRowUpDown(row);
            System.out.println(content);
        } catch(Exception exc){
            throw new CubePrinterException();
        }
    }

    private String printRowUpDown(String[] row){
        String content = "";
        for(int i=0;i<row.length;i++) content += " ";
        for(String elem : row) content += this.hmapColor.get(elem);
        content += "\n";
        return content;
    }


    private String printRowLFRB(String[] rowL, String[] rowF, String[] rowR, String[] rowB){
        String content = "";
        for(String elem : rowL) content += this.hmapColor.get(elem);
        for(String elem : rowF) content += this.hmapColor.get(elem);
        for(String elem : rowR) content += this.hmapColor.get(elem);
        for(String elem : rowB) content += this.hmapColor.get(elem);
        content += "\n";
        return content;
    }
}
