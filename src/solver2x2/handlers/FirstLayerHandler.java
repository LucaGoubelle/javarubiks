package solver2x2.handlers;

import javarubik.data.Cube;

public class FirstLayerHandler {

    private Cube insertWGR(Cube cube){
        // todo: implement this
        return cube;
    }

    private Cube insertWGO(Cube cube){
        // todo: implement this
        return cube;
    }

    private Cube insertWBO(Cube cube){
        // todo: implement this
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.insertWGR(cube);
        cube = this.insertWGO(cube);
        cube = this.insertWBO(cube);
        return cube;
    }

}
