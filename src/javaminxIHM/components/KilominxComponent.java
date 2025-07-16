package javaminxIHM.components;


import javaminx.data.models.Kilominx;
import javaminxIHM.helpers.KilominxDrawer;

import java.awt.*;

public class KilominxComponent extends MinxComponent {
    private final KilominxDrawer kiloDrawer;

    public KilominxComponent(Kilominx minx){
        super(minx);
        this.kiloDrawer = new KilominxDrawer();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        this.drawUp(g2);
        this.drawFront(g2);
        this.drawLeft(g2);
        this.drawRight(g2);
        this.drawDownLeft(g2);
        this.drawDownRight(g2);

        // clean all
        g2.dispose();
    }

    @Override
    protected void drawUp(Graphics2D g2) {
        this.kiloDrawer.drawUp(g2, (Kilominx) this.minx);
    }

    @Override
    protected void drawFront(Graphics2D g2) {
        this.kiloDrawer.drawFront(g2, (Kilominx) this.minx);
    }

    @Override
    protected void drawLeft(Graphics2D g2){this.kiloDrawer.drawLeft(g2, (Kilominx) this.minx);}

    @Override
    protected void drawRight(Graphics2D g2){this.kiloDrawer.drawRight(g2, (Kilominx) this.minx);}

    @Override
    protected void drawDownLeft(Graphics2D g2){this.kiloDrawer.drawDownLeft(g2, (Kilominx) minx);}

    @Override
    protected void drawDownRight(Graphics2D g2){this.kiloDrawer.drawDownRight(g2, (Kilominx) minx);}
}
