package javaminxIHM.components;

import javaminx.data.models.MasterKilominx;
import javaminxIHM.helpers.MasterKilominxDrawer;

import java.awt.*;

public class MasterKilominxComponent extends MinxComponent {

    private final MasterKilominxDrawer mkDrawer;

    public MasterKilominxComponent(MasterKilominx minx){
        super(minx);
        this.mkDrawer = new MasterKilominxDrawer();
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
        this.mkDrawer.drawUp(g2, (MasterKilominx) this.minx);
    }

    @Override
    protected void drawFront(Graphics2D g2) {
        this.mkDrawer.drawFront(g2, (MasterKilominx) this.minx);
    }

    @Override
    protected void drawLeft(Graphics2D g2) {
        this.mkDrawer.drawLeft(g2, (MasterKilominx) this.minx);
    }

    @Override
    protected void drawRight(Graphics2D g2) {
        this.mkDrawer.drawRight(g2, (MasterKilominx) this.minx);
    }

    @Override
    protected void drawDownLeft(Graphics2D g2) {
        this.mkDrawer.drawDownLeft(g2, (MasterKilominx) this.minx);
    }

    @Override
    protected void drawDownRight(Graphics2D g2) {
        this.mkDrawer.drawDownRight(g2, (MasterKilominx) this.minx);
    }
}
