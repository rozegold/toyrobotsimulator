package main.java.com.robotsimulator.model;

import main.java.com.robotsimulator.observer.CommandObserver;

public class Robot implements CommandObserver {

    private String name;
    private Position position;

    public Robot(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Position report() {

        return this.position;


    }

    public void move() {

        switch (position.getFacing()) {
            case NORTH:
                position.setPosX(position.getPosX() + 1);
                break;
            case EAST:
                position.setPosY(position.getPosY() + 1);
                break;
            case WEST:
                position.setPosY(position.getPosY() - 1);
                break;
            case SOUTH:
                position.setPosX(position.getPosX() - 1);
                break;
        }

    }

    public void turn(Direction direction) {

        switch (direction) {
            case LEFT:
                position.setFacing(Face.getFaceMap().get(position.getFacing().getLeft()));
                break;
            case RIGHT:
                position.setFacing(Face.getFaceMap().get(position.getFacing().getRight()));
                break;
        }


    }

    @Override
    public void executeCommand(String command) {

        if (null == command || command.isEmpty())
            return;

        switch (command.toLowerCase()) {
            case "move":
                move();
                break;
            case "right":
                turn(Direction.RIGHT);
                break;
            case "left":
                turn(Direction.LEFT);
                break;
            case "report":
                report();
                break;
            case "place":
                report();
                break;

        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void place(Position position) {
        setPosition(position);
    }
}
