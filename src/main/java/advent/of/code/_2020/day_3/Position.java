package advent.of.code._2020.day_3;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveDown(int moveY) {
        y += moveY;
    }

    public void moveRight(int moveX) {
        x += moveX;
    }
}
