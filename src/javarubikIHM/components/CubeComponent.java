package javarubikIHM.components;

import javarubik.data.Cube;
import javarubikIHM.helpers.FaceDrawer;
import javarubikIHM.helpers.StickerDrawer;

import javax.swing.*;
import java.awt.*;

public abstract class CubeComponent extends JComponent {
    protected Cube cube;
    protected FaceDrawer faceDrawer;
    protected StickerDrawer stickerDrawer;

    public CubeComponent(Cube cube){
        this.cube = cube;
        this.faceDrawer = new FaceDrawer();
        this.stickerDrawer = new StickerDrawer();
    }

    public void setCube(Cube newCube){
        this.cube = newCube;
    }
    public Cube getCube(){ return this.cube;}
    public void paintComponent(Graphics g){

    }

    protected abstract void drawRight(Graphics2D g2, int x, int y, int size, int offset);
    protected abstract void drawUp(Graphics2D g2, int x, int y, int size, int offset);
}
