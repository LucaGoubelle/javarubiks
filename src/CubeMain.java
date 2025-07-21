import javarubik.data.Cube;
import javarubik.data.CubeBuilder;

import javarubikIHM.components.CubeComponent;
import javarubikIHM.components.CubeComponentFactory;
import javarubikIHM.listeners.CubeKeyListener;

import javax.swing.*;
import java.awt.*;

public class CubeMain {

    public static void main(String[] args) throws Exception {
        int cubeSize = 7;

        CubeBuilder builder = new CubeBuilder();
        CubeComponentFactory factory = new CubeComponentFactory();

        Cube cube = builder.build(cubeSize);
        CubeComponent cubeComponent = factory.make(cube, cubeSize);

        JFrame frame = setFrame(cubeComponent);
        cubeComponent.paintComponent(frame.getGraphics());
    }

    private static JFrame setFrame(CubeComponent cubeComponent){
        JFrame frame = new JFrame("JavaRubik");
        frame.setSize(1200,980);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(32,32,32));
        frame.add(cubeComponent);
        CubeKeyListener keyListener = new CubeKeyListener(cubeComponent);
        frame.addKeyListener(keyListener);
        return frame;
    }
}
