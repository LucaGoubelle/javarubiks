import javaminx.data.models.Minx;
import javaminx.data.MinxFactory;

import javaminx.exceptions.MinxBuilderException;
import javaminxIHM.components.MinxComponent;
import javaminxIHM.components.MinxComponentFactory;
import javaminxIHM.listeners.MinxKeyListener;
import javaminxIHM.listeners.MinxKeyListenerFactory;


import javax.swing.*;
import java.awt.*;

public class MinxMain {

    private static JFrame setFrame(String puzzleType, MinxComponent minxComponent){
        JFrame frame = new JFrame("JavaMinx");
        frame.setSize(1200,980);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(32,32,32));
        frame.add(minxComponent);
        MinxKeyListenerFactory keyListenerFactory = new MinxKeyListenerFactory();
        MinxKeyListener keyListener = keyListenerFactory.make(puzzleType, minxComponent);
        frame.addKeyListener(keyListener);
        return frame;
    }

    public static void main(String[] args) throws MinxBuilderException {
        String puzzleType = "kilominx";

        MinxFactory minxFactory = new MinxFactory();
        Minx minx = minxFactory.make(puzzleType);

        MinxComponentFactory minxCompFacto = new MinxComponentFactory(minx);
        MinxComponent minxComponent = minxCompFacto.make(puzzleType);

        JFrame frame = setFrame(puzzleType, minxComponent);

        minxComponent.paintComponent(frame.getGraphics());
    }
}
