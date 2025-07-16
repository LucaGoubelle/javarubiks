package javarubikIHM.components;

import javarubik.data.Cube;

public class CubeComponentFactory {

    /**
     * Make a CubeComponent instance if needed based on the 'size' param
     * return a Cube3x3Component by default
     * @author: LucaGoubelle
     * */
    public CubeComponent make(Cube cube, int size){
        return switch (size) {
            case 2 -> new Cube2x2Component(cube);
            case 3 -> new Cube3x3Component(cube);
            case 4 -> new Cube4x4Component(cube);
            case 5 -> new Cube5x5Component(cube);
            case 6 -> new Cube6x6Component(cube);
            case 7 -> new Cube7x7Component(cube);
            default -> new Cube3x3Component(cube);
        };
    }
}
