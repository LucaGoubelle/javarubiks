package solversCube.solver3x3.handlers;

import javarubik.data.Cube;

public class SecondLayerHandler {

    private Cube insertBR(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertGR(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertGO(Cube cube){
        // implement this method
        return cube;
    }

    private Cube insertBO(Cube cube){
        // implement this method
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.insertBR(cube);
        cube = this.insertGR(cube);
        cube = this.insertGO(cube);
        cube = this.insertBO(cube);
        return cube;
    }
}
