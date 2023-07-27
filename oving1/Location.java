package oving1;

public class Location {
    private int x;
    private int y;

    public void up() {
        this.y -= 1;
    }

    public void down() {
        this.y += 1;

    }

    public void left() {
        this.x -= 1;

    }

    public void right() {
        this.x += 1;

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Location [x=" + x + ", y=" + y + "]";
    }

    public static void main(String[] args) {
        Location location = new Location();
        location.up();
        location.right();
        System.out.println(location);
    }

}
