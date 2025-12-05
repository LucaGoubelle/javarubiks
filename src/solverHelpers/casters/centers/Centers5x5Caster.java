package solverHelpers.casters.centers;

public class Centers5x5Caster extends CenterCaster {

    public Centers5x5Caster(){
        this.size = 5;
    }

    @Override
    protected String[][] extractCenters(String[][] actualFace){
        return new String[][]{
                {actualFace[1][1], actualFace[1][2], actualFace[1][3]},
                {actualFace[2][1], actualFace[2][2], actualFace[2][3]},
                {actualFace[3][1], actualFace[3][2], actualFace[3][3]}
        };
    }
}
