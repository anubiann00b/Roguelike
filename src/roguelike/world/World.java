package roguelike.world;

import roguelike.util.Position;

public class World {
    
    private final Tile[][] map;
    
    public World(int w, int h) {
        map = new Tile[w][h];
        
        for (int i=0;i<w;i++)
            for (int j=0;j<h;j++)
                map[i][j] = Tile.createTile(Math.random() > 0.1 ? Tile.Type.WALL : Tile.Type.FLOOR);
    }
    
    public Tile getTile(Position p) {
        return getTile(p.x, p.y);
    }

    public Tile getTile(int x, int y) {
        return map[x][y];
    }

    public int getHeight() {
        return map[0].length;
    }

    public int getWidth() {
        return map.length;
    }
}
