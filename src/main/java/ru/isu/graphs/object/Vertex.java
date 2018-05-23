package ru.isu.graphs.object;

import java.util.Arrays;

public class Vertex {
    private int id;
    private double x;
    private double y;
    private int status;
    private int[] neighbours;

    public Vertex(String vert) {
        vert = vert.substring(1);
        String[] v = vert.split(",");
        this.id = Integer.parseInt(v[0]);
        this.x = Integer.parseInt(v[1]);
        this.y = Integer.parseInt(v[2]);
        this.status = Integer.parseInt(v[3]);
        v[4] = v[4].substring(v[4].indexOf("[") + 1, v[4].lastIndexOf("]"));
        this.neighbours = Arrays.stream(v[4].split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public Vertex(int id, double x, double y, int status, int[] neighbours) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.status = status;
        this.neighbours = neighbours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getx() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int[] getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(int[] neighbours) {
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", status=" + status +
                ", neighbours=" + Arrays.toString(neighbours) +
                '}';
    }
}