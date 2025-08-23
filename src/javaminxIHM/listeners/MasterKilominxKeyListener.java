package javaminxIHM.listeners;

import javaminx.move.mk.MasterKilominxMover;
import javaminxIHM.components.MinxComponent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MasterKilominxKeyListener extends MinxKeyListener implements KeyListener {

    private final MinxComponent minxComponent;
    private final MasterKilominxMover mkMover;

    public MasterKilominxKeyListener(MinxComponent minxComponent){
        this.minxComponent = minxComponent;
        this.mkMover = new MasterKilominxMover();
    }
    
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
