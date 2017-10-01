package main.java.com.robotsimulator.model;

public enum Direction {

    LEFT("left"),
    RIGHT("right");

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
