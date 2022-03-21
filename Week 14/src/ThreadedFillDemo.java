import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadedFillDemo extends JFrame implements ActionListener {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final int FILL_WIDTH = 300;
    public static final int FILL_HEIGHT = 100;
    public static final int CIRCLE_SIZE = 10;
    public static final int PAUSE = 100;


    private JPanel box;

    public static void main(String[] args){
        ThreadedFillDemo gui = new ThreadedFillDemo();
        gui.setVisible(true);
    }
    public ThreadedFillDemo() {
        setSize(WIDTH, HEIGHT);
        setTitle("Fill Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        box = new JPanel();
        add(box, "Center");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);
        add(buttonPanel, "South");
    }

    public void actionPerformed(ActionEvent e) {
        PaintRed red = new PaintRed();
        red.start();
        PaintWhite white = new PaintWhite();
        white.start();
        PaintBlue blue = new PaintBlue();
        blue.start();
    }

    class PaintRed extends Thread {
        public void paintRed() {
            Graphics g = box.getGraphics();
            for (int x = 0; x < FILL_WIDTH; x = x + CIRCLE_SIZE)
                for (int y = FILL_HEIGHT; y > 0; y = y - 3 * CIRCLE_SIZE) {
                    g.setColor(Color.RED);
                    g.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
                    doNothing(PAUSE);
                }
        }
        public synchronized void run() { paintRed(); }
    }

    class PaintWhite extends Thread {
        public void paintWhite() {
            Graphics g = box.getGraphics();
            for (int x = 0; x < FILL_WIDTH; x = x + CIRCLE_SIZE)
                for (int y = FILL_HEIGHT - 10; y > CIRCLE_SIZE; y = y - 3 * CIRCLE_SIZE) {
                    g.setColor(Color.BLACK);
                    g.drawOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
                    doNothing(133);
                }
        }
        public synchronized void run() {
            paintWhite();
        }
    }

    class PaintBlue extends Thread {
        public void paintBlue() {
            Graphics g = box.getGraphics();
            for (int x = 0; x < FILL_WIDTH; x = x + CIRCLE_SIZE)
                for (int y = FILL_HEIGHT - 20; y > CIRCLE_SIZE; y = y - 3 * CIRCLE_SIZE) {
                    g.setColor(Color.BLUE);
                    g.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
                    doNothing(133);
                }
        }
        public synchronized void run() {
            paintBlue();
        }
    }

        public void doNothing(int milliseconds) {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                System.out.println("Unexpected Interrupt. Exiting.");
                System.exit(0);
            }
        }
    }

