package javarubikIHM.helpers;

import javarubik.data.Cube;

import java.awt.*;

public class CubePatternDrawer {
    private FaceDrawer faceDrawer;
    private int x;
    private int y;
    private int offset;
    private int size;

    public CubePatternDrawer(){
        this.x = 280;
        this.y = 280;
        this.size = 30;
        this.offset = 5;
        this.faceDrawer = new FaceDrawer();
    }

    public void draw(Graphics2D g2, Cube cube){
        int delta = (cube.front.length * this.size) + (cube.front.length * this.offset);
        this.faceDrawer.drawFrontFace(g2, cube.front, this.x, this.y, this.size);
        this.faceDrawer.drawFrontFace(g2, cube.up, this.x, this.y-delta, this.size);
        this.faceDrawer.drawFrontFace(g2, cube.down, this.x, this.y+delta, this.size);
        this.faceDrawer.drawFrontFace(g2, cube.left, this.x-delta, this.y, this.size);
        this.faceDrawer.drawFrontFace(g2, cube.right, this.x+delta, this.y, this.size);
        this.faceDrawer.drawFrontFace(g2, cube.back, this.x+(delta*2), this.y, this.size);
    }
}
