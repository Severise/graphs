package ru.isu.graphs;

import ru.isu.graphs.object.Graph;
import ru.isu.graphs.object.Player;
import ru.isu.graphs.object.Vertex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
   import javax.swing.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Vertex> Vertexes = new ArrayList<>();
        Scanner in = new Scanner(new FileReader("src/main/resources/graphs/graph1.txt"));

        //  StringBuilder sb = new StringBuilder();
        while (in.hasNextLine()) {
            Vertexes.add( new Vertex(in.nextLine()));
        }
        in.close();

        Graph Graph = new Graph(Vertexes);

        Player Player1 = new Player(Vertexes.get(0));

        JFrame GraphFrame= new JFrame("Game");
        GraphFrame.setVisible(true);
        GraphFrame.setContentPane(new JPanel());
        GraphFrame.setSize(1200, 800);



    }
}

