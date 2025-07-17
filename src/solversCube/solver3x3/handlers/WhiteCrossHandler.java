package solversCube.solver3x3.handlers;

import javarubik.data.Cube;

public class WhiteCrossHandler {
    private Cube insertWB(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertWR(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertWG(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertWO(Cube cube){
        // implement this method
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.insertWB(cube);
        cube = this.insertWR(cube);
        cube = this.insertWG(cube);
        cube = this.insertWO(cube);
        return cube;
    }
}
