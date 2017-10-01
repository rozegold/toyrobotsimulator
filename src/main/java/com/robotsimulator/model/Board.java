package main.java.com.robotsimulator.model;

public class Board {

    private int size;
    private Robot[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Robot[size][size];
    }

    public int getSize() {
        return size;
    }

    public Robot[][] getBoard() {
        return board;
    }
}
