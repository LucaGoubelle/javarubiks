package javaminxIHM.helpers;

import javaminx.data.models.MasterKilominx;

import java.awt.*;

public class MasterKilominxDrawer {
    private StickerDrawer stickerDrawer;

    public MasterKilominxDrawer(){
        this.stickerDrawer = new StickerDrawer();
    }

    public void drawUp(Graphics2D g2, MasterKilominx minx){
        Polygon p1 = new Polygon(new int[]{250,296,250,203}, new int[]{7,22,38,22}, 4);
        Polygon p2 = new Polygon(new int[]{296,321,288,250}, new int[]{22,30,51,38}, 4);
        Polygon p3 = new Polygon(new int[]{321,345,326,289}, new int[]{30,38,63,50}, 4);
        Polygon p4 = new Polygon(new int[]{344,392,374,327}, new int[]{38,54,79,62}, 4);
        Polygon p5 = new Polygon(new int[]{327,374,365,312}, new int[]{62,78,91,83}, 4);

        this.stickerDrawer.drawSticker(g2, p1, minx.up[0][0]);
        this.stickerDrawer.drawSticker(g2, p2, minx.up[0][1]);
        this.stickerDrawer.drawSticker(g2, p3, minx.up[0][2]);
        this.stickerDrawer.drawSticker(g2, p4, minx.up[0][3]);
        this.stickerDrawer.drawSticker(g2, p5, minx.up[0][4]);
    }

    public void drawFront(Graphics2D g2, MasterKilominx minx){

    }

    public void drawLeft(Graphics2D g2, MasterKilominx minx){

    }

    public void drawRight(Graphics2D g2, MasterKilominx minx){

    }

    public void drawDownLeft(Graphics2D g2, MasterKilominx minx){

    }

    public void drawDownRight(Graphics2D g2, MasterKilominx minx){

    }
}
