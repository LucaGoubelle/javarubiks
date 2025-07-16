package solverHelpers;

import java.util.List;

public class CrownCaster {

    /**
     * cast the crown to a String of bits based on yellow color or not
     * @author: LucaGoubelle
     * */
    public String cast(List<List<String>> crown){
        StringBuilder result = new StringBuilder();
        for(List<String> row : crown)
            for(String elem : row)
                result.append((elem.equals("yellow")) ? "1" : "0");
        return result.toString();
    }
}
