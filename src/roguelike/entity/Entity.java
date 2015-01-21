package roguelike.entity;

import roguelike.util.Position;

public abstract class Entity {
    
    public Position pos;
    public final char icon;
    
    public Entity(Position pos, char icon) {
        this.pos = pos;
        this.icon = icon;
    }
}