package javarubikIHM.components;

import javarubik.data.Cube;

import java.awt.*;

public class Cube3x3Component extends CubeComponent {
    public Cube3x3Component(Cube cube){
        super(cube);
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

    @Override
    protected void drawRight(Graphics2D g2, int x, int y, int size, int offset) {
        int size_depth = (int) size / 2;
        int len = this.cube.front.length;
        int delta = (len * size) + (len * offset);

        this.stickerDrawer.drawRightSticker(g2, this.cube.right[0][0], x+delta, y, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[0][1], x+delta+size_depth+offset, y-size_depth-offset, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[0][2], x+delta+(size_depth*2)+(offset*2), y-(size_depth*2)-(offset*2), size);

        this.stickerDrawer.drawRightSticker(g2, this.cube.right[1][0], x+delta, y+size+offset, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[1][1], x+delta+size_depth+offset, y+size-size_depth, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[1][2], x+delta+(size_depth*2)+(offset*2), y-offset, size);

        this.stickerDrawer.drawRightSticker(g2, this.cube.right[2][0], x+delta, y+(size*2)+(offset*2), size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[2][1], x+delta+size_depth+offset, y+(size*2)+(offset*2)-size_depth-offset, size);
        this.stickerDrawer.drawRightSticker(g2, this.cube.right[2][2], x+delta+(size_depth*2)+(offset*2), y+(size*2)+(offset*2)-size-(offset*2), size);
    }

    @Override
    protected void drawUp(Graphics2D g2, int x, int y, int size, int offset) {
        int size_depth = (int) size / 2;
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[2][0], x+size_depth+offset, y-size_depth-offset, size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[2][1], x+size_depth+size+(offset*2), y-size_depth-offset, size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[2][2], x+size_depth+(size*2)+(offset*3), y-size_depth-offset, size);

        this.stickerDrawer.drawUpSticker(g2, this.cube.up[1][0], x+(size_depth*2)+(offset*2), y-(size_depth*2)-(offset*2), size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[1][1], x+(size*2)+(offset*3), y-(size_depth*2)-(offset*2), size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[1][2], x+(size*3)+(offset*4), y-(size_depth*2)-(offset*2), size);

        this.stickerDrawer.drawUpSticker(g2, this.cube.up[0][0], x+(size_depth*3)+(offset*3), y-(size_depth*3)-(offset*3), size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[0][1], x+(size*2)+size_depth+(offset*4), y-(size_depth*3)-(offset*3), size);
        this.stickerDrawer.drawUpSticker(g2, this.cube.up[0][2], x+(size*3)+size_depth+(offset*5), y-(size_depth*3)-(offset*3), size);
    }
}
