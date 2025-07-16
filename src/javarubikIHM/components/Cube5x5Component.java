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
        int sizeDepth = (int) size / 2;
        for(int i=0;i<this.cube.up.length;i++){

            // x = x + size * (i+cnt) + offset * (i+i) + ...
            //=> ... ((i%2==0) ? sizeDepth : 0)
            int x0 = x+size*(i+0)+offset*(i+0)+sizeDepth;
            int x1 = x+size*(i+1)+offset*(i+1);
            int x2 = x+size*(i+1)+offset*(i+2)+sizeDepth;
            int x3 = x+size*(i+2)+offset*(i+3);
            int x4 = x+size*(i+2)+offset*(i+4)+sizeDepth;

            // y = y - sizeDepth * (i+1) - offset * (i+1)
            int y0 = y-sizeDepth*1-offset*1;
            int y1 = y-sizeDepth*2-offset*2;
            int y2 = y-sizeDepth*3-offset*3;
            int y3 = y-sizeDepth*4-offset*4;
            int y4 = y-sizeDepth*5-offset*5;

            this.stickerDrawer.drawUpSticker(g2, this.cube.up[4][i], x0, y0, size);
            this.stickerDrawer.drawUpSticker(g2, this.cube.up[3][i], x1, y1, size);
            this.stickerDrawer.drawUpSticker(g2, this.cube.up[2][i], x2, y2, size);
            this.stickerDrawer.drawUpSticker(g2, this.cube.up[1][i], x3, y3, size);
            this.stickerDrawer.drawUpSticker(g2, this.cube.up[0][i], x4, y4, size);
        }
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = 200, y=200, size=40, offset=2;

        this.faceDrawer.drawFrontFace(g2, this.cube.front, x,y, size);
        this.drawUp(g2, x,y,size,offset);
        this.drawRight(g2, x,y,size,offset);

        //clean all
        g2.dispose();
    }
}
