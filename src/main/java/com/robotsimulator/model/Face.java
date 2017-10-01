package main.java.com.robotsimulator.model;

import java.util.HashMap;
import java.util.Map;

public enum Face {

    NORTH("north","west","east"),
    SOUTH("south","east","west"),
    EAST("east","north","south"),
    WEST("west","south","north");

    private String value;
    private String left;
    private String right;

    private static Map<String,Face> faceMap = new HashMap<String,Face>(){
        {
            put(Face.NORTH.getValue(),Face.NORTH);
            put(Face.SOUTH.getValue(),Face.SOUTH);
            put(Face.WEST.getValue(),Face.WEST);
            put(Face.EAST.getValue(),Face.EAST);
        }
    };


    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    Face(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    Face(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Map<String, Face> getFaceMap() {
        return faceMap;
    }



}
