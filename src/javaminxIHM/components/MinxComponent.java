package javaminxIHM.components;

import javaminx.data.models.Minx;

import javax.swing.*;
import java.awt.*;

public abstract class MinxComponent extends JComponent {
    protected Minx minx;

    public MinxComponent(Minx minx){
        this.minx = minx;
    }

    public void setMinx(Minx newMinx){this.minx = newMinx;}
    public Minx getMinx(){return this.minx;}

    public void paintComponent(Graphics g){

    }

    protected abstract void drawUp(Graphics2D g2);
    protected abstract void drawFront(Graphics2D g2);
    protected abstract void drawLeft(Graphics2D g2);
    protected abstract void drawRight(Graphics2D g2);
    protected abstract void drawDownLeft(Graphics2D g2);
    protected abstract void drawDownRight(Graphics2D g2);
}
