package solversCube.solver3x3CFOP.cases;

import java.util.HashMap;

public class F2LPairRightCases {

    public HashMap<String, String> cases;

    public F2LPairRightCases(){
        this.cases = new HashMap<>();

        this.cases.put("blue_red::blue_red_white", "U R U' R'");
        this.cases.put("blue_red::red_white_blue", "U' R U' R' U R U R'");
        this.cases.put("blue_red::white_blue_red", "R U2 R'U' R U R'");

        this.cases.put("red_blue::blue_red_white", "U' R U2 R' U F' U' F");
        this.cases.put("red_blue::red_white_blue", "R U' R' U2 F' U' F");
        this.cases.put("red_blue::white_blue_red", "F U R U' R' F' R U' R'");
    }
}
