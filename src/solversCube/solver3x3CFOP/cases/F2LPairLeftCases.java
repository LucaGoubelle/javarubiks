package solversCube.solver3x3CFOP.cases;

import java.util.HashMap;

public class F2LPairLeftCases {

    public HashMap<String, String> cases;

    public F2LPairLeftCases(){
        this.cases = new HashMap<>();

        this.cases.put("red_blue::red_blue_white", "U' F' U F");
        this.cases.put("red_blue::blue_white_red", "U F' U F U' F' U' F");
        this.cases.put("red_blue::white_red_blue", "F' U2 F U F' U' F");

        this.cases.put("blue_red::red_blue_white", "R U' R' U R U' R' U2 R U' R'");
        this.cases.put("blue_red::blue_white_red", "U R' F R F' U R U R'");
        this.cases.put("blue_red::white_red_blue", "U R U' R' U' R U' R' U R U' R'");
    }
}
