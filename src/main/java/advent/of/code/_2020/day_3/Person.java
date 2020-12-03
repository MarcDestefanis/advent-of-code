package advent.of.code._2020.day_3;

public class Person {
    private Position position;
    private int vx;
    private int vy;

    public Person(int vx, int vy) {
        this.position = new Position(0, 0);
        this.vx = vx;
        this.vy = vy;
    }

    public void makeMove() {
        position.moveRight(vx);
        position.moveDown(vy);
    }

    public int getPosX() {
        return position.getX();
    }

    public int getPosY() {
        return position.getY();
    }
}
