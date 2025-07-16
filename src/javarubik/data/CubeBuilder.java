package javarubik.data;

import javarubik.exceptions.CubeBuilderException;

public class CubeBuilder {

    /**
     * Build a face on the Rubik's cube, take the size of the face and the element to fill
     * @author: LucaGoubelle
     * */
    private String[][] buildFace(int size, String elem){
        String[][] face = new String[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                face[i][j] = elem;
        return face;
    }

    /**
     * Build a virgin Rubik's cube (full cube) of size NxNxN
     * @author: LucaGoubelle
     * */
    public Cube build(int size) throws CubeBuilderException {
        try{
            String[][] back = this.buildFace(size, "green");
            String[][] up = this.buildFace(size, "yellow");
            String[][] front = this.buildFace(size, "blue");
            String[][] left = this.buildFace(size, "orange");
            String[][] right = this.buildFace(size, "red");
            String[][] down = this.buildFace(size, "white");
            return new Cube(back, up, front, left, right, down);
        } catch(Exception exc) {
            throw new CubeBuilderException();
        }
    }
}
