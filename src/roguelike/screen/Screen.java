package roguelike.screen;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public interface Screen {
    
    void display(AsciiPanel panel);
    Screen update(KeyEvent key);
}
