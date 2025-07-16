package solver2x2.handlers;

import javarubik.data.Cube;

public class LastLayerHandler {

    private Cube oll(Cube cube){
        // todo: implement this
        return cube;
    }

    private Cube pll(Cube cube){
        // todo: implement this
        return cube;
    }

    private Cube auf(Cube cube){
        // todo: implement this
        return cube;
    }

    public Cube handle(Cube cube){
        cube = this.oll(cube);
        cube = this.pll(cube);
        cube = this.auf(cube);
        return cube;
    }
}
