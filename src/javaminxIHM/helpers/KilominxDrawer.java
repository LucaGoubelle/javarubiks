package javaminxIHM.helpers;

import javaminx.data.models.Kilominx;

import java.awt.*;

public class KilominxDrawer {
    private StickerDrawer stickerDrawer;
    public KilominxDrawer(){
        this.stickerDrawer = new StickerDrawer();
    }


    public void drawUp(Graphics2D g2, Kilominx minx){
        Polygon p1 = new Polygon(new int[]{250,320,250,179}, new int[]{7,30,73,30}, 4);
        this.stickerDrawer.drawSticker(g2, p1, minx.up[0]);

        Polygon p2 = new Polygon(new int[]{320, 392, 365, 250}, new int[]{30,53,91,73}, 4);
        this.stickerDrawer.drawSticker(g2, p2, minx.up[1]);

        Polygon p3 = new Polygon(new int[]{365, 338, 250,250}, new int[]{91,128,128,73}, 4);
        this.stickerDrawer.drawSticker(g2, p3, minx.up[2]);

        Polygon p4 = new Polygon(new int[]{250, 161, 135, 250}, new int[]{128,128,91,73}, 4);
        this.stickerDrawer.drawSticker(g2, p4, minx.up[3]);

        Polygon p5 = new Polygon(new int[]{135,107, 179,250}, new int[]{91,53,30,73}, 4);
        this.stickerDrawer.drawSticker(g2, p5, minx.up[4]);
    }

    public void drawFront(Graphics2D g2, Kilominx minx) {
        Polygon p1 = new Polygon(new int[]{161,250,250,134}, new int[]{128,128,250,212}, 4);
        this.stickerDrawer.drawSticker(g2, p1, minx.front[0]);

        Polygon p2 = new Polygon(new int[]{250, 338, 365, 250 }, new int[]{128,128,212,250}, 4);
        this.stickerDrawer.drawSticker(g2, p2, minx.front[1]);

        Polygon p3 = new Polygon(new int[]{ 365,392,321,250}, new int[]{ 212,296,348,250}, 4);
        this.stickerDrawer.drawSticker(g2, p3, minx.front[2]);

        Polygon p4 = new Polygon(new int[]{ 321,250, 178,250}, new int[]{348,399,348,250 }, 4);
        this.stickerDrawer.drawSticker(g2, p4, minx.front[3]);

        Polygon p5 = new Polygon(new int[]{178,107,134,250}, new int[]{348,296,212,250 }, 4);
        this.stickerDrawer.drawSticker(g2, p5, minx.front[4]);
    }

    public void drawLeft(Graphics2D g2, Kilominx minx) {
        Polygon p1 = new Polygon(new int[]{ 107,135,83,63}, new int[]{53,91,194,114 }, 4);
        this.stickerDrawer.drawSticker(g2, p1, minx.left[0]);

        Polygon p2 = new Polygon(new int[]{135,161, 134,83 }, new int[]{91,128,212,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p2, minx.left[1]);

        Polygon p3 = new Polygon(new int[]{ 134,107,63,83}, new int[]{212,296,310,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p3, minx.left[2]);

        Polygon p4 = new Polygon(new int[]{63,19,19,83 }, new int[]{310,325,249,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p4, minx.left[3]);

        Polygon p5 = new Polygon(new int[]{19,19,63,83 }, new int[]{249,174,114,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p5, minx.left[4]);
    }

    public void drawRight(Graphics2D g2, Kilominx minx){
        Polygon p1 = new Polygon(new int[]{338,365,417,365 }, new int[]{128,91,194,212 }, 4);
        this.stickerDrawer.drawSticker(g2, p1, minx.right[0]);

        Polygon p2 = new Polygon(new int[]{365,392,437,417 }, new int[]{91,53, 114,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p2, minx.right[1]);

        Polygon p3 = new Polygon(new int[]{ 437,480,480,417 }, new int[]{ 114,174,250,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p3, minx.right[2]);

        Polygon p4 = new Polygon(new int[]{ 480,480,436,417 }, new int[]{ 250,325,310,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p4, minx.right[3]);

        Polygon p5 = new Polygon(new int[]{ 436,392,365,417 }, new int[]{ 310,296,212,194 }, 4);
        this.stickerDrawer.drawSticker(g2, p5, minx.right[4]);
    }

    public void drawDownLeft(Graphics2D g2, Kilominx minx){
        Polygon p1 = new Polygon(new int[]{ 107,178,146,63 }, new int[]{ 296,348,392,310 }, 4);
        this.stickerDrawer.drawSticker(g2, p1, minx.downLeft[0]);

        Polygon p2 = new Polygon(new int[]{ 178,250,250,146 }, new int[]{ 348,399,446,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p2, minx.downLeft[1]);

        Polygon p3 = new Polygon(new int[]{ 250,250,177,146 }, new int[]{ 446,492,469,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p3, minx.downLeft[2]);

        Polygon p4 = new Polygon(new int[]{ 177,107,63,146 }, new int[]{ 469,446,386,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p4, minx.downLeft[3]);

        Polygon p5 = new Polygon(new int[]{ 63,19,63,146 }, new int[]{ 386,325,310,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p5, minx.downLeft[4]);

    }

    public void drawDownRight(Graphics2D g2, Kilominx minx){
        Polygon p1 = new Polygon(new int[]{ 392,436,353,321 }, new int[]{ 296,310,392,348 }, 4);
        this.stickerDrawer.drawSticker(g2, p1, minx.downRight[0]);

        Polygon p2 = new Polygon(new int[]{ 436,480,436,353 }, new int[]{ 310,325,386,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p2, minx.downRight[1]);

        Polygon p3 = new Polygon(new int[]{ 436,392,321,353 }, new int[]{ 386,446,469,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p3, minx.downRight[2]);

        Polygon p4 = new Polygon(new int[]{ 321,250,250,353 }, new int[]{ 469,492,446,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p4, minx.downRight[3]);

        Polygon p5 = new Polygon(new int[]{ 250,250,321,353 }, new int[]{ 446,399,348,392 }, 4);
        this.stickerDrawer.drawSticker(g2, p5, minx.downRight[4]);
    }
}
