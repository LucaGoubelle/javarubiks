package solverHelpers.casters.centers;

import javarubik.data.Cube;

public class CenterCaster {

    protected int size;

    public CenterCaster(){
        this.size = 0;
    }

    protected String[][] getActualFace(Cube cube, String face){
        return switch (face) {
            case "up" -> cube.up;
            case "front" -> cube.front;
            case "left" -> cube.left;
            case "right" -> cube.right;
            case "down" -> cube.down;
            case "back" -> cube.down;
            default -> cube.front;
        };
    }

    protected String getStringCenters(String colorToFilter, String[][] centers) {
        StringBuilder content = new StringBuilder();
        for(String[] row : centers)
            for(String elem : row)
                content.append((elem.equals(colorToFilter)) ? "1": "0");
        return content.toString();
    }

    public String cast(Cube cube, String face, String colorToFilter) throws Exception {
        if(cube.front.length != this.size)
            throw new Exception("Cube must be a "+this.size+"x"+this.size+" to use Center5x5Caster class");
        String[][] actualFace = this.getActualFace(cube, face);
        String[][] actualCenters = this.extractCenters(actualFace);
        return this.getStringCenters(colorToFilter, actualCenters);
    }

    protected String[][] extractCenters(String[][] actualFace) {
        return new String[][]{};
    }
}
