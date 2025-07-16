package javaminxIHM.helpers;

import javaminx.data.models.Megaminx;

import java.awt.*;

public class MegaminxDrawer {
    private StickerDrawer stickerDrawer;
    public MegaminxDrawer(){
        this.stickerDrawer = new StickerDrawer();
    }
    public void drawBody(Graphics2D g2){
        Polygon body = new Polygon(
                new int[]{123,193,230,237,192,129,61,17,19,57},
                new int[]{20,35,94,164,219,246,222,169,97,37},
                10
        );
        g2.setColor(Color.BLACK);
        g2.fill(body);
    }

    public void drawUp(Graphics2D g2, Megaminx minx){
        Polygon p1 = new Polygon(new int[]{123,146,125,102}, new int[]{21,26,31,26}, 4);
        Polygon p2 = new Polygon(new int[]{151,159,152,130}, new int[]{26,29,38,32}, 4);
        Polygon p3 = new Polygon(new int[]{166,190,183,158}, new int[]{29,35,45,39}, 4);
        Polygon p4 = new Polygon(new int[]{157,182,180,150}, new int[]{41,47,50,50}, 4);
        Polygon p5 = new Polygon(new int[]{148,178,172,141}, new int[]{53,53,63,63}, 4);
        Polygon p6 = new Polygon(new int[]{113,141,133,123}, new int[]{53,53,64,64}, 4);
        Polygon p7 = new Polygon(new int[]{76,106,116,85}, new int[]{54,54,64,65}, 4);
        Polygon p8 = new Polygon(new int[]{94,103,74,71}, new int[]{42,51,52,48}, 4);
        Polygon p9 = new Polygon(new int[]{83,92,69,60}, new int[]{31,40,46,37}, 4);
        Polygon p10 = new Polygon(new int[]{97,119,98,89}, new int[]{27,33,38,29}, 4);
        Polygon p11 = new Polygon(new int[]{125,151,143,110,100}, new int[]{33,39,51,51,40},5);

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

        this.stickerDrawer.drawSticker(g2, p11, minx.up[1][0]);
    }

    public void drawFront(Graphics2D g2, Megaminx minx){
        Polygon p1 = new Polygon(new int[]{85,117,107,76}, new int[]{69,69,99,99}, 4);
        Polygon p2 = new Polygon(new int[]{124,133,144,114}, new int[]{68,68,98,98}, 4);
        Polygon p3 = new Polygon(new int[]{140,172,182,150}, new int[]{68,68,98,98}, 4);
        Polygon p4 = new Polygon(new int[]{153,185,188,163}, new int[]{104,104,113,132}, 4);
        Polygon p5 = new Polygon(new int[]{190,201,175,165}, new int[]{120,150,169,139}, 4);
        Polygon p6 = new Polygon(new int[]{159,170,162,136}, new int[]{143,173,179,161}, 4);
        Polygon p7 = new Polygon(new int[]{131,157,131,105}, new int[]{165,184,203,185}, 4);
        Polygon p8 = new Polygon(new int[]{125,100,91,101}, new int[]{161,181,175,144}, 4);
        Polygon p9 = new Polygon(new int[]{95,85,59,69}, new int[]{141,171,152,122}, 4);
        Polygon p10 = new Polygon(new int[]{74,106,97,71}, new int[]{106,105,134,115}, 4);

        Polygon p11 = new Polygon(new int[]{112,146,158,130,102}, new int[]{105,104,136,157,137}, 5);

        this.stickerDrawer.drawSticker(g2, p1, minx.front[0][0]);
        this.stickerDrawer.drawSticker(g2, p2, minx.front[0][1]);
        this.stickerDrawer.drawSticker(g2, p3, minx.front[0][2]);
        this.stickerDrawer.drawSticker(g2, p4, minx.front[0][3]);
        this.stickerDrawer.drawSticker(g2, p5, minx.front[0][4]);
        this.stickerDrawer.drawSticker(g2, p6, minx.front[0][5]);
        this.stickerDrawer.drawSticker(g2, p7, minx.front[0][6]);
        this.stickerDrawer.drawSticker(g2, p8, minx.front[0][7]);
        this.stickerDrawer.drawSticker(g2, p9, minx.front[0][8]);
        this.stickerDrawer.drawSticker(g2, p10, minx.front[0][9]);

        this.stickerDrawer.drawSticker(g2, p11, minx.front[1][0]);
    }

    public void drawLeft(Graphics2D g2, Megaminx minx){
        //Polygon pn = new Polygon(new int[]{}, new int[]{}, 4);
        //this.stickerDrawer.drawSticker(g2, pn, minx.front[0][0]);
    }

    public void drawRight(Graphics2D g2, Megaminx minx){
        //Polygon pn = new Polygon(new int[]{}, new int[]{}, 4);
        //this.stickerDrawer.drawSticker(g2, pn, minx.front[0][0]);
    }

    public void drawDownLeft(Graphics2D g2, Megaminx minx) {
        //Polygon pn = new Polygon(new int[]{}, new int[]{}, 4);
        //this.stickerDrawer.drawSticker(g2, pn, minx.front[0][0]);
    }

    public void drawDownRight(Graphics2D g2, Megaminx minx) {
        //Polygon pn = new Polygon(new int[]{}, new int[]{}, 4);
        //this.stickerDrawer.drawSticker(g2, pn, minx.front[0][0]);
    }
}
