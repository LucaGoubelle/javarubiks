package javarubik.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CubeLoader {

    private String getRawData(String filepath) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(filepath));
        StringBuilder sb = new StringBuilder();
        while(in.hasNext()){
            sb.append(in.next());
        }
        in.close();
        return sb.toString();
    }

    private List<List<String>> getMatrixData(String data){
        String[] lines = data.split("\n");
        List<List<String>> mtx = new ArrayList<>();
        for(String line : lines){
            String[] cols = line.split(",");
            mtx.add(Arrays.asList(cols));
        }
        return mtx;
    }


}
