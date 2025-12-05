package solverHelpers.casters.centers;

public class Centers6x6Caster extends CenterCaster {

    public Centers6x6Caster(){
        this.size = 6;
    }

    @Override
    protected String[][] extractCenters(String[][] actualFace){
        return new String[][]{
                {actualFace[1][1], actualFace[1][2], actualFace[1][3], actualFace[1][4]},
                {actualFace[2][1], actualFace[2][2], actualFace[2][3], actualFace[2][4]},
                {actualFace[3][1], actualFace[3][2], actualFace[3][3], actualFace[3][4]},
                {actualFace[4][1], actualFace[4][2], actualFace[4][3], actualFace[4][4]}
        };
    }
}
