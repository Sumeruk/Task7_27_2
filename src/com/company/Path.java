package com.company;

import java.util.LinkedList;

public class Path {
    private LinkedList<String> vertexes;
    private int distance;

    public Path(LinkedList<String> vertexes, int distance) {
        this.vertexes = vertexes;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void display() {
        for (String vertex : vertexes) {
            System.out.print(vertex);
            System.out.print(" ");
        }
        System.out.println(distance);
    }
}
