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
        return cube.front[1][2]+"_"+cube.right[1][0]+"::"+cube.front[2][2]+"_"+cube.right[2][0]+"_"+cube.down[0][2];
    }

    public String scanHalfIn(Cube cube){
        return cube.front[1][2]+"_"+cube.right[1][0]+"::"+cube.front[0][2]+"_"+cube.right[0][0]+"_"+cube.up[2][2];
    }

    public String scanSplitBack(Cube cube){
        return cube.up[0][1]+"_"+cube.back[0][1]+"::"+cube.front[0][2]+"_"+cube.right[2][0]+"_"+cube.up[2][2];
    }

    public String scanSplitLeft(Cube cube){
        return cube.up[1][0]+"_"+cube.left[0][1]+"::"+cube.front[0][2]+"_"+cube.right[2][0]+"_"+cube.up[2][2];
    }

}
