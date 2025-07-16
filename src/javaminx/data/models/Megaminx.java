package javaminx.data.models;

import javaminx.data.models.Minx;

public class Megaminx extends Minx {
    public String[][] up;
    public String[][] front;
    public String[][] left;
    public String[][] right;
    public String[][] downLeft;
    public String[][] downRight;
    public String[][] backLeft;
    public String[][] backRight;
    public String[][] absLeft;
    public String[][] absRight;
    public String[][] back;
    public String[][] down;

    public Megaminx(
            String[][] up, String[][] front, String[][] left, String[][] right,
            String[][] downLeft, String[][] downRight, String[][] backLeft, String[][] backRight,
            String[][] absLeft, String[][] absRight, String[][] back, String[][] down

    ){
        this.up = up;
        this.front = front;
        this.left = left;
        this.right = right;
        this.downLeft = downLeft;
        this.downRight = downRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
        this.absLeft = absLeft;
        this.absRight = absRight;
        this.back = back;
        this.down = down;
    }
}
