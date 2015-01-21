package roguelike.screen;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import roguelike.world.World;

class PlayScreen implements Screen {
    
    final World world;
    
    public PlayScreen() {
        world = new World(80, 24);
    }

    @Override
    public void display(AsciiPanel panel) {
        for (int i=0;i<world.getWidth();i++)
            for (int j=0;j<world.getHeight();j++)
                panel.write(world.getTile(i,j).type.icon, i, j);
    }

    @Override
    public Screen update(KeyEvent key) {
        return this;
    }
}