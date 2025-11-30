package solverHelpers.advanced;

import javarubik.data.Cube;

public class F2LScanner {

    public String scanPairLeft(Cube cube){
        return cube.up[2][1]+"_"+cube.front[0][1]+"::"+cube.up[2][2]+"_"+cube.front[0][2]+"_"+cube.right[0][0];
    }

    public String scanPairRight(Cube cube){
        return cube.up[1][2]+"_"+cube.right[0][1]+"::"+cube.up[2][2]+"_"+cube.right[0][0]+"_"+cube.front[0][2];
    }

    public String scanIn(Cube cube){
        //todo: implement this
        return "";
    }

    public String scanHalfIn(Cube cube){
        //todo: implement this
        return "";
    }
}
