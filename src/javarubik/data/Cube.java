package javarubik.data;

public class Cube {
    public String[][] back;
    public String[][] up;
    public String[][] front;
    public String[][] left;
    public String[][] right;
    public String[][] down;

    /**
     * Implementing Rubiks cube data model, each attribute is a face of the puzzle,
     * a face is a String[][] representing color of sticker
     * @author: LucaGoubelle
     * */
    public Cube(String[][] back, String[][] up, String[][] front, String[][] left, String[][] right, String[][] down){
        this.back = back;
        this.up = up;
        this.front = front;
        this.left = left;
        this.right = right;
        this.down = down;
    }

}
