package ru.isu.graphs.object;

import java.util.ArrayList;

public class Player {
    private static int STATUSNUMBER = 1;
    private Vertex curVertex;
    private ArrayList<Vertex> occupiedVertexes;
    private int statusCode;

    public Player(Vertex curVertex) {
        this.curVertex = curVertex;
        this.statusCode = STATUSNUMBER++;
        curVertex.setStatus(this.statusCode);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Vertex getCurVertex() {
        return curVertex;
    }

    public void setCurVertex(Vertex curVertex) {
        this.curVertex = curVertex;
    }

    public ArrayList<Vertex> getOccupiedVertexes() {
        return occupiedVertexes;
    }

    public void setOccupiedVertexes(ArrayList<Vertex> occupiedVertexes) {
        this.occupiedVertexes = occupiedVertexes;
    }

    @Override
    public String toString() {
        return "Player{" +
                "curVertex=" + curVertex +
                ", occupiedVertexes=" + occupiedVertexes +
                '}';
    }

}
