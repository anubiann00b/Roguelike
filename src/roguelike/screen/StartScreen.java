package roguelike.screen;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public class StartScreen implements Screen {

    @Override
    public void display(AsciiPanel panel) {
        panel.writeCenter("Welcome!", 6);
    }

    @Override
    public Screen update(KeyEvent key) {
        return this;
    }
}
