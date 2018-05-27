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
        int s = 30;
        for (Vertex vertex : graph.getVertexes())
            for (Vertex vertex1 : graph.getVertexes()) {
                if (vertex.isNeighbour(vertex1)) {
                    graphics.drawLine(vertex.getx(), vertex.gety(), vertex1.getx(), vertex1.gety());
                    if (vertex1.getStatus() == 0)
                        graphics.setColor(Color.BLUE);
                    if (vertex1.getStatus() == 1)
                        graphics.setColor(Color.red);
                    if (vertex1.getStatus() == 2)
                        graphics.setColor(Color.green);
                    graphics.fillOval(vertex1.getx() - s / 2, vertex1.gety() - s / 2, s, s);
                    graphics.setColor(Color.BLUE);
                }
            }

    }

}





