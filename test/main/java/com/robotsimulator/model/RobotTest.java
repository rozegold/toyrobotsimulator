package main.java.com.robotsimulator.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {


    private Robot subject;


    @Before
    public void setUp() throws Exception {

        subject = new Robot("roby", new Position(1, 1, Face.NORTH));
    }


    @Test
    public void shouldReportRobotsPosition() {
        Position expectedPosition = new Position(1, 1, Face.NORTH);
        assertEquals(expectedPosition, subject.report());
    }

    @Test
    public void shouldMove(){
        Position expectedPosition = new Position(2, 1, Face.NORTH);
        subject.move();

        assertEquals(expectedPosition, subject.report());
    }

    @Test
    public void shouldTurn(){
        subject.turn(Direction.LEFT);
        Position expectedPosition = new Position(1, 1, Face.WEST);

        assertEquals(expectedPosition,subject.report());


        subject.turn(Direction.RIGHT);
         expectedPosition = new Position(1, 1, Face.NORTH);

        assertEquals(expectedPosition,subject.report());
    }

    @Test
    public void shouldExecuteCommand(){
        subject.executeCommand("move");
        Position expectedPosition = new Position(2, 1, Face.NORTH);

        assertEquals(expectedPosition,subject.report());

    }


    @Test
    public void shouldPlaceRobotOnBoard(){
        subject.place(new Position(2,5,Face.EAST));
        Position expectedPosition = new Position(2, 5, Face.EAST);

        assertEquals(expectedPosition,subject.report());

    }

}