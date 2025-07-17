package solversCube.solver3x3.handlers;

import javarubik.data.Cube;

public class LastCornersHandler {

    private Cube permute(Cube cube){
        // implement this method
        return cube;
    }

    private Cube orient(Cube cube){
        // implement this method
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.permute(cube);
        cube = this.orient(cube);
        return cube;
    }
}
