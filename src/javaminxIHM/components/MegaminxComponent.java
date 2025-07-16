package javaminxIHM.components;

import javaminx.data.models.Megaminx;
import javaminxIHM.helpers.MegaminxDrawer;

import java.awt.*;

public class MegaminxComponent extends MinxComponent{
    private final MegaminxDrawer megaDrawer;

    public MegaminxComponent(Megaminx minx){
        super(minx);
        this.megaDrawer = new MegaminxDrawer();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        this.drawBody(g2);

        this.drawUp(g2);
        this.drawFront(g2);
        this.drawLeft(g2);
        this.drawRight(g2);
        this.drawDownLeft(g2);
        this.drawDownRight(g2);

        // clean all
        g2.dispose();
    }

    protected void drawBody(Graphics2D g2){
        this.megaDrawer.drawBody(g2);
    }

    @Override
    protected void drawUp(Graphics2D g2) {
        this.megaDrawer.drawUp(g2, (Megaminx) this.minx);
    }

    @Override
    protected void drawFront(Graphics2D g2) {
        this.megaDrawer.drawFront(g2, (Megaminx) this.minx);
    }

    @Override
    protected void drawLeft(Graphics2D g2){this.megaDrawer.drawLeft(g2, (Megaminx) this.minx);}

    @Override
    protected void drawRight(Graphics2D g2){this.megaDrawer.drawRight(g2, (Megaminx) this.minx);}

    @Override
    protected void drawDownLeft(Graphics2D g2){this.megaDrawer.drawDownLeft(g2, (Megaminx) minx);}

    @Override
    protected void drawDownRight(Graphics2D g2){this.megaDrawer.drawDownRight(g2, (Megaminx) minx);}
}
