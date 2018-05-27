package ru.isu.graphs;

import ru.isu.graphs.object.Graph;
import ru.isu.graphs.object.Player;
import ru.isu.graphs.object.Vertex;
import ru.isu.graphs.visualization.Panel;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int n = (int) (Math.random() * 3) + 2;
        ArrayList<Vertex> Vertexes = VertexArrayFromFile(n);
        Graph graph = new Graph(Vertexes);
        Player Player1 = new Player(Vertexes.get(0));
        Player Player2 = new Player(Vertexes.get(2));
        //first vertex - random?|determine by clicking?

        //System.out.println(graph);

        JFrame graphFrame = new JFrame("Game");
        drawGraph(graphFrame, graph);

    }

    public static ArrayList<Vertex> VertexArrayFromFile(int n) throws FileNotFoundException {
        ArrayList<Vertex> Vertexes = new ArrayList<>();
        Scanner in = new Scanner(new FileReader("src/main/resources/graphs/graph" + n + ".txt"));
        while (in.hasNextLine()) {
            Vertexes.add(new Vertex(in.nextLine()));
        }
        in.close();
        return Vertexes;
    }

    public static void drawGraph(JFrame graphFrame, Graph graph) {
        Panel graphPanel = new Panel(graph);
        graphFrame.setSize(1200, 800);
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setContentPane(graphPanel);
        graphFrame.setVisible(true);
        graphFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}

