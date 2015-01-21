package roguelike;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import roguelike.screen.Screen;
import roguelike.screen.StartScreen;

public class Window extends JFrame implements KeyListener {
    
    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Roguelike");
    }
    
    AsciiPanel panel;
    Screen screen;
    
    public Window() {
        super();
        panel = new AsciiPanel(80, 24);
        screen = new StartScreen();
        add(panel);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        repaint();
    }
    
    @Override
    public void repaint() {
        panel.clear();
        screen.display(panel);
        super.repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        screen = screen.update(e);
        repaint();
    }

    @Override public void keyTyped(KeyEvent e) { }
    @Override public void keyReleased(KeyEvent e) { }
}