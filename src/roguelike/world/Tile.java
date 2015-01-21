package roguelike.world;

public class Tile {
    
    public enum Type {
        FLOOR('.', true, true),
        TRANSPARENT_WALL('#', true, false),
        WALL('#', false, false);
        
        public final char icon;
        public final boolean transparent;
        public final boolean walkable;
        
        Type(char icon, boolean transparent, boolean walkable) {
            this.icon = icon;
            this.transparent = transparent;
            this.walkable = walkable;
        }
    }
    
    public static Tile createTile(Type type) {
        return new Tile(type);
    }
    
    public final Type type;
    
    private Tile(Type type) {
        this.type = type;
    }
}
