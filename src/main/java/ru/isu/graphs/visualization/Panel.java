package ru.isu.graphs.visualization;

import ru.isu.graphs.object.Graph;
import ru.isu.graphs.object.Vertex;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Graph graph;

    public Panel(Graph graph) {
        this.graph = graph;

    }

    public void paint(Graphics graphics) {
          graphics = (Graphics2D) graphics;
        graphics.setColor(Color.BLUE);
        int s = 20;
        for (Vertex vertex : graph.getVertexes()) {
            graphics.fillOval(vertex.getx() - s / 2, vertex.gety() - s / 2, s, s);
            for (Vertex vertex1 : graph.getVertexes()) {
                int[] vertId = vertex.getNeighbours();
                for (int o = 0; o < vertId.length; o++) {
                    if (vertId[o] == vertex1.getId()) {
                        System.out.println(vertex + "     " + vertex1);

                        graphics.drawLine(vertex.getx(), vertex.gety(), vertex1.getx(), vertex1.gety());
                    }
                }
            }

        }

    }


}


