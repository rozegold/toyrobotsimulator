package main.java.com.robotsimulator.model;

public class Position {

    private int posX;
    private int posY;
    private Face facing;


    public Position(int posX, int posY, Face facing) {
        this.posX = posX;
        this.posY = posY;
        this.facing = facing;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Face getFacing() {
        return facing;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setFacing(Face facing) {
        this.facing = facing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (posX != position.posX) return false;
        if (posY != position.posY) return false;
        return facing == position.facing;
    }

    @Override
    public int hashCode() {
        int result = posX;
        result = 31 * result + posY;
        result = 31 * result + facing.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", facing=" + facing +
                '}';
    }
}
