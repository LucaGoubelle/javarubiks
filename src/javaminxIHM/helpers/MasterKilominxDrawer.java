package javaminxIHM.helpers;

import javaminx.data.models.MasterKilominx;

import java.awt.*;

public class MasterKilominxDrawer {
    private final StickerDrawer stickerDrawer;

    public MasterKilominxDrawer(){
        this.stickerDrawer = new StickerDrawer();
    }

    public void drawUp(Graphics2D g2, MasterKilominx minx){
        Polygon p1 = new Polygon(new int[]{250,296,250,203}, new int[]{7,22,38,22}, 4);
        Polygon p2 = new Polygon(new int[]{296,321,288,250}, new int[]{22,30,51,38}, 4);
        Polygon p3 = new Polygon(new int[]{321,345,326,289}, new int[]{30,38,63,50}, 4);
        Polygon p4 = new Polygon(new int[]{344,392,374,327}, new int[]{38,54,79,62}, 4);
        Polygon p5 = new Polygon(new int[]{327,374,365,312}, new int[]{62,78,91,83}, 4);

        Polygon p6 = new Polygon(new int[]{312,365,355,297}, new int[]{83,91,104,103}, 4);
        Polygon p7 = new Polygon(new int[]{297,356,338,279}, new int[]{103,103,128,128}, 4);
        Polygon p8 = new Polygon(new int[]{250,298,279,250}, new int[]{103,103,128,128}, 4);
        Polygon p9 = new Polygon(new int[]{250,250,220,202}, new int[]{103,128,128,103}, 4);
        Polygon p10 = new Polygon(new int[]{143,202,220,161}, new int[]{103,103,128,128}, 4);

        Polygon p11 = new Polygon(new int[]{135,187,202,143}, new int[]{91,83,103,103}, 4);
        Polygon p12 = new Polygon(new int[]{125,172,187,134}, new int[]{78,62,83,91}, 4);
        Polygon p13 = new Polygon(new int[]{107,155,173,125}, new int[]{53,37,62,78}, 4);
        Polygon p14 = new Polygon(new int[]{155,179,212,172}, new int[]{38,30,50,62}, 4);
        Polygon p15 = new Polygon(new int[]{179,203,249,212}, new int[]{30,22,37,50}, 4);

        Polygon p16 = new Polygon(new int[]{250,288,250,212}, new int[]{38,50,74,50}, 4);
        Polygon p17 = new Polygon(new int[]{288,327,312,250}, new int[]{50,62,83,74}, 4);
        Polygon p18 = new Polygon(new int[]{250,312,297,250}, new int[]{74,83,103,103}, 4);
        Polygon p19 = new Polygon(new int[]{250,250,202,187}, new int[]{74,103,103,83}, 4);
        Polygon p20 = new Polygon(new int[]{211,250,188,172}, new int[]{50,74,83,62}, 4);

        this.stickerDrawer.drawSticker(g2, p1, minx.up[0][0]);
        this.stickerDrawer.drawSticker(g2, p2, minx.up[0][1]);
        this.stickerDrawer.drawSticker(g2, p3, minx.up[0][2]);
        this.stickerDrawer.drawSticker(g2, p4, minx.up[0][3]);
        this.stickerDrawer.drawSticker(g2, p5, minx.up[0][4]);

        this.stickerDrawer.drawSticker(g2, p6, minx.up[0][5]);
        this.stickerDrawer.drawSticker(g2, p7, minx.up[0][6]);
        this.stickerDrawer.drawSticker(g2, p8, minx.up[0][7]);
        this.stickerDrawer.drawSticker(g2, p9, minx.up[0][8]);
        this.stickerDrawer.drawSticker(g2, p10, minx.up[0][9]);

        this.stickerDrawer.drawSticker(g2, p11, minx.up[0][10]);
        this.stickerDrawer.drawSticker(g2, p12, minx.up[0][11]);
        this.stickerDrawer.drawSticker(g2, p13, minx.up[0][12]);
        this.stickerDrawer.drawSticker(g2, p14, minx.up[0][13]);
        this.stickerDrawer.drawSticker(g2, p15, minx.up[0][14]);

        this.stickerDrawer.drawSticker(g2, p16, minx.up[1][0]);
        this.stickerDrawer.drawSticker(g2, p17, minx.up[1][1]);
        this.stickerDrawer.drawSticker(g2, p18, minx.up[1][2]);
        this.stickerDrawer.drawSticker(g2, p19, minx.up[1][3]);
        this.stickerDrawer.drawSticker(g2, p20, minx.up[1][4]);
    }

    public void drawFront(Graphics2D g2, MasterKilominx minx){
        Polygon p1 = new Polygon(new int[]{161,220,202,143}, new int[]{128,128,184,184},4);
        Polygon p2 = new Polygon(new int[]{220,250,250,202}, new int[]{128,128,184,184},4);
        Polygon p3 = new Polygon(new int[]{250,279,297,250}, new int[]{128,128,184,184},4);
        Polygon p4 = new Polygon(new int[]{279,338,355,297}, new int[]{128,128,184,184},4);
        Polygon p5 = new Polygon(new int[]{297,355,364,312}, new int[]{184,184,212,229},4);

        this.stickerDrawer.drawSticker(g2, p1, minx.front[0][0]);
        this.stickerDrawer.drawSticker(g2, p2, minx.front[0][1]);
        this.stickerDrawer.drawSticker(g2, p3, minx.front[0][2]);
        this.stickerDrawer.drawSticker(g2, p4, minx.front[0][3]);
        this.stickerDrawer.drawSticker(g2, p5, minx.front[0][4]);

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
