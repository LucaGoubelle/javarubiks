package solversCube.solver3x3.handlers;

import javarubik.data.Cube;

public class YellowCrossHandler {

    private Cube create(Cube cube){
        // todo: implement this method
        return cube;
    }

    private Cube correct(Cube cube){
        // todo: implement this method
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.create(cube);
        cube = this.correct(cube);
        return cube;
    }

}
