package javarubikIHM.components;

import javarubik.data.Cube;

import java.awt.*;

public class Cube5x5Component extends CubeComponent {
    public Cube5x5Component(Cube cube){
        super(cube);
    }

    @Override
    protected void drawRight(Graphics2D g2, int x, int y, int size, int offset) {
        this.faceDrawer.drawRightFace(g2, this.cube.right, x, y, size);
    }

    @Override
    protected void drawUp(Graphics2D g2, int x, int y, int size, int offset) {
        this.faceDrawer.drawUpFace(g2, this.cube.up, x,y, size);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = 200, y=200, size=40, offset=2;
        int up_offset = 110;

        this.faceDrawer.drawFrontFace(g2, this.cube.front, x,y, size);
        this.drawUp(g2, x+up_offset,y-up_offset,size,offset);
        this.drawRight(g2, x,y,size,offset);

        //clean all
        g2.dispose();
    }
}
