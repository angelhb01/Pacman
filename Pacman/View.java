import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class View extends JFrame implements KeyListener {
    //class properties
    Color bgColor = new Color(0, 0, 0);
    int WIDTH = 1100;
    int HEIGHT = 1500;

    //constructor
    public View(){
        super("Pac v.001");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(bgColor);
        setSize(WIDTH, HEIGHT);
        //addKeyListener(this);
        setVisible(true);
    }

    public Graphics getGraphicsContext(){
        return getContentPane().getGraphics();
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