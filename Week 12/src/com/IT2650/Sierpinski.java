package com.IT2650;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Sierpinski extends JFrame {

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    public static final int COORD_Xx = 100;
    public static final int COORD_Xy = 700;
    public static final int COORD_Yx = 400;
    public static final int COORD_Yy = 200;
    public static final int COORD_Zx = 700;
    public static final int COORD_Zy = 700;

    Point X = new Point(COORD_Xx, COORD_Xy);
    Point Y = new Point(COORD_Yx, COORD_Yy);
    Point Z = new Point(COORD_Zx, COORD_Zy);

    public static void main(String[] args)
    {
        Sierpinski drawing = new Sierpinski();
        drawing.setVisible(true);
    }

    public Sierpinski() {
        super("Sierpinski Triangles");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
    }

    //picks one point at random
    public Point randomCoordinates() {
        Random rand = new Random();
        List<Point> pointList = Arrays.asList(X,Y,Z);
        return pointList.get(rand.nextInt(pointList.size()));
    }

    //takes in current point and target point and finds midpoint
    public Point findHalfway(Point current, Point target) {
        //set new point to equal current x + target x /2, current y + target y /2
        double halfX = (current.getX() + target.getX()) / 2;
        double halfY = (current.getY() + target.getY()) /2;
        return new Point((int)halfX, (int)halfY);
    }

    //sets target to random, finds the halfway point, sets current to halfway and
    // paints a pixel there
    public void paint(Graphics g) {
        super.paint(g);
        Point current = X;

        for (int i = 0; i < 100000; i++) {
            Point target = randomCoordinates();
            current = findHalfway(current, target);
            g.drawLine((int) current.getX(), (int) current.getY(),
                    (int) current.getX(), (int) current.getY());

            //to watch points painted



            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


