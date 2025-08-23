package javaminxIHM.listeners;

import javaminx.data.models.Kilominx;
import javaminx.move.kilo.KilominxMover;
import javaminxIHM.components.MinxComponent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KilominxKeyListener extends MinxKeyListener implements KeyListener {

    private final KilominxMover kilominxMover;
    private MinxComponent minxComponent;

    public KilominxKeyListener(MinxComponent minxComponent) {
        this.minxComponent = minxComponent;
        this.kilominxMover = new KilominxMover();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println(keyEvent.getKeyCode());
        switch(keyEvent.getKeyCode()){
            case 75:
                this.minxComponent.setMinx(this.kilominxMover.simpleMove((Kilominx) this.minxComponent.getMinx(), "U"));
                this.minxComponent.repaint();
                break;
            case 77:
                this.minxComponent.setMinx(this.kilominxMover.simpleMove((Kilominx) this.minxComponent.getMinx(), "U'"));
                this.minxComponent.repaint();
                break;
            case 37:
                this.minxComponent.setMinx(this.kilominxMover.simpleMove((Kilominx) this.minxComponent.getMinx(), "y"));
                this.minxComponent.repaint();
                break;
            case 39:
                this.minxComponent.setMinx(this.kilominxMover.simpleMove((Kilominx) this.minxComponent.getMinx(), "y'"));
                this.minxComponent.repaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
