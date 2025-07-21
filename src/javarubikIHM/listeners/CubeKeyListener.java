package javarubikIHM.listeners;

import javarubik.data.CubeBuilder;

import javarubik.exceptions.CubeBuilderException;
import javarubik.exceptions.CubeMoveException;
import javarubik.move.Mover;
import javarubik.move.Scrambler;

import javarubikIHM.components.CubeComponent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CubeKeyListener implements KeyListener {
    private final Scrambler scrambler;
    private final Mover mover;
    private final CubeBuilder builder;
    CubeComponent component;

    public CubeKeyListener(CubeComponent component){
        this.component = component;
        this.scrambler = new Scrambler();
        this.mover = new Mover();
        this.builder = new CubeBuilder();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int kcode = keyEvent.getKeyCode();
        System.out.println(kcode);
        switch(kcode){
            case 75:
                if (keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Uw"));
                else if(keyEvent.isControlDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Uww"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "U"));
                this.component.repaint();
                break;
            case 77:
                if (keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Uw'"));
                else if(keyEvent.isControlDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Uww'"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "U'"));
                this.component.repaint();
                break;
            case 79:
                if(keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Rw"));
                else if(keyEvent.isControlDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Rww"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "R"));
                this.component.repaint();
                break;
            case 76:
                if(keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Rw'"));
                else if(keyEvent.isControlDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Rww'"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "R'"));
                this.component.repaint();
                break;
            case 83:
                if(keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Lw"));
                else if(keyEvent.isControlDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Lww"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "L"));
                this.component.repaint();
                break;
            case 90:
                if(keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Lw'"));
                else if(keyEvent.isControlDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Lww'"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "L'"));
                this.component.repaint();
                break;
            case 74:
                this.component.setCube(this.mover.simpleMove(this.component.getCube(), "F"));
                this.component.repaint();
                break;
            case 70:
                this.component.setCube(this.mover.simpleMove(this.component.getCube(), "F'"));
                this.component.repaint();
                break;
            case 37:
                this.component.setCube(this.mover.simpleMove(this.component.getCube(), "y"));
                this.component.repaint();
                break;
            case 39:
                this.component.setCube(this.mover.simpleMove(this.component.getCube(), "y'"));
                this.component.repaint();
                break;
            case 38:
                this.component.setCube(this.mover.simpleMove(this.component.getCube(), "x"));
                this.component.repaint();
                break;
            case 40:
                this.component.setCube(this.mover.simpleMove(this.component.getCube(), "x'"));
                this.component.repaint();
                break;
            case 68:
                if(keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Dw"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "D"));
                this.component.repaint();
                break;
            case 81:
                if(keyEvent.isShiftDown())
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "Dw'"));
                else
                    this.component.setCube(this.mover.simpleMove(this.component.getCube(), "D'"));
                this.component.repaint();
                break;
            case 32:
                try {
                    this.component.setCube(this.scrambler.scramble(this.component.getCube()));
                } catch (CubeMoveException e) {
                    throw new RuntimeException(e);
                }
                this.component.repaint();
                break;
            case 27:
                try {
                    this.component.setCube(this.builder.build(this.component.getCube().front.length));
                } catch (CubeBuilderException e) {
                    throw new RuntimeException(e);
                }
                this.component.repaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
