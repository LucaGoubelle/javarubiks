package javaminxIHM.listeners;

import javaminx.move.mega.MegaminxMover;
import javaminxIHM.components.MinxComponent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MegaminxKeyListener extends MinxKeyListener implements KeyListener {

    private final MinxComponent minxComponent;
    private final MegaminxMover megaminxMover;

    public MegaminxKeyListener(MinxComponent minxComponent){
        this.minxComponent = minxComponent;
        this.megaminxMover = new MegaminxMover();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
