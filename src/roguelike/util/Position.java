package roguelike.util;

public class Position {

    public final int x;
    public final int y;
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Position scale(int scale) { return new Position(x*scale, y*scale); }
    public Position add(Position pos) { return new Position(x+pos.x, y+pos.y); }
    public Position subtract(Position pos) { return this.add(pos.invert()); }
    public Position invert() { return new Position(-x,-y); }
    public boolean isZero() { return x==0 && y==0; }
    public double magnitude() { return Math.sqrt(x*x + y*y); }

    @Override
    public String toString() {
        return "(" + x + " " + y + ")";
    }
}