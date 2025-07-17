package solversCube.solver3x3.handlers;

import javarubik.data.Cube;

public class FirstLayerHandler {

    private Cube insertWBR(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertWGR(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertWGO(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertWBO(Cube cube){
        // implement this method
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.insertWBR(cube);
        cube = this.insertWGR(cube);
        cube = this.insertWGO(cube);
        cube = this.insertWBO(cube);
        return cube;
    }
}
