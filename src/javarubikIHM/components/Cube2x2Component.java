package javarubikIHM.components;

import javarubik.data.Cube;

import java.awt.*;

public class Cube2x2Component extends CubeComponent {

    public Cube2x2Component(Cube cube){
        super(cube);
    }

    @Override
    protected void drawUp(Graphics2D g2, int x,int y, int size, int offset){
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[0][0], x+50+(offset*2), y-50-(offset*2), size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[0][1], x+50+size+(offset*3), y-50-(offset*2), size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[1][0], x+25+offset,y-25-offset, size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[1][1], x+25+size+(offset*2), y-25-offset, size);
    }

    @Override
    protected void drawRight(Graphics2D g2, int x,int y, int size, int offset){
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[0][0], x+100+(offset*3),y, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[0][1], x+125+(offset*4), y-25-offset, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[1][0], x+100+(offset*3), y+size+offset, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[1][1], x+125+(offset*4), y+size+offset-25-offset, size);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = 150, y=150, size=50, offset=2;

        this.faceDrawer.drawFrontFace(g2, this.cube.front, x,y, size);
        this.drawUp(g2, x,y,size,offset);
        this.drawRight(g2, x,y,size,offset);

        //clean all
        g2.dispose();
    }
}
