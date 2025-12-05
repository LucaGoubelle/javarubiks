package solverHelpers.casters.centers;

public class Centers4x4Caster extends CenterCaster {

    public Centers4x4Caster(){
        this.size = 4;
    }

    @Override
    protected String[][] extractCenters(String[][] actualFace){
        return new String[][]{
                {actualFace[1][1], actualFace[1][2]},
                {actualFace[2][1], actualFace[2][2]}
        };
    }
}
