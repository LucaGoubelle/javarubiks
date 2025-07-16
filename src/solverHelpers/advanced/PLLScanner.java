package solverHelpers.advanced;

import javarubik.data.Cube;

import java.util.HashMap;

public class PLLScanner {
    private HashMap<String, String> hmap;

    public PLLScanner(){
        this.hmap = new HashMap<>();
        this.hmap.put("blue","B");
        this.hmap.put("red","R");
        this.hmap.put("orange","O");
        this.hmap.put("green","G");
    }

    /**
     * scan PLL (Permutation Last Layer) config,
     * return a string of char colors
     * @author: LucaGoubelle
     * */
    public String scanPLL(Cube cube){
        StringBuilder result = new StringBuilder();
        for(String elem : cube.front[0])
            result.append(this.hmap.get(elem));
        result.append("_");
        for(String elem : cube.right[0])
            result.append(this.hmap.get(elem));
        result.append("_");
        for(String elem : cube.back[0])
            result.append(this.hmap.get(elem));
        result.append("_");
        for(String elem : cube.left[0])
            result.append(this.hmap.get(elem));
        return result.toString();
    }
}
