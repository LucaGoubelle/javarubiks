package solver3x3.handlers;

import javarubik.data.Cube;

public class WhiteCrossHandler {
    public Cube insertWB(Cube cube){
        //todo: implement this method
        return cube;
    }

    public Cube insertWR(Cube cube){
        //todo: implement this method
        return cube;
    }

    public Cube insertWG(Cube cube){
        //todo: implement this method
        return cube;
    }

    public Cube insertWO(Cube cube){
        //todo: implement this method
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
