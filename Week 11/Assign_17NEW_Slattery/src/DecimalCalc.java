import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DecimalCalc extends JFrame
{
    public static final int WIDTH = 350;
    public static final int HEIGHT = 300;
    public int attempt;

    private JPanel panel1, panel2, panel3, panel4, panel5, panel6;

    public static void main(String[] args){
        DecimalCalc decimalCalc = new DecimalCalc();
        decimalCalc.setVisible(true);
    }
    public class EndingListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public DecimalCalc(){
        super("Decimal Converter");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(6,1));

        //text components
        JLabel instructions = new JLabel("Please enter a number from 0 - 255");
        JTextField decimalTextField = new JTextField(15);
        decimalTextField.setToolTipText("Enter your decimal value here...");
        JTextField binaryTextField = new JTextField(15);
        binaryTextField.setToolTipText("Your base2 number appears here...");
        JLabel decTag = new JLabel("Enter decimal here:");
        JLabel binTag = new JLabel("Binary results here:");
        JLabel attemptCounter = new JLabel("Attempt " + attempt);

        //buttons and actions
        JButton convertButton = new JButton("Convert");
        convertButton.setToolTipText("Click me to convert to base2...");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attempt += 1;
                binaryTextField.setText(binaryReturn(decimalTextField));
                attemptCounter.setText("Attempt " + attempt);

            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setToolTipText("Click me to clear and reset the form...");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attempt = 0;
                decimalTextField.setText("");
                binaryTextField.setText("");
                attemptCounter.setText("Attempt " + attempt);
            }
        });
        JButton closeButton = new JButton("Close");
        closeButton.setToolTipText("Click me to close the window...");
        closeButton.addActionListener(new EndingListener());


        //layout
        panel1 = new JPanel();
        panel1.add(instructions);
        biggerPanel.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(decTag);
        panel2.add(decimalTextField);
        biggerPanel.add(panel2);

        panel3 = new JPanel();
        panel3.add(convertButton);
        biggerPanel.add(panel3);

        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        panel4.add(binTag);
        panel4.add(binaryTextField);
        biggerPanel.add(panel4);

        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout());
        panel5.add(clearButton);
        panel5.add(closeButton);
        biggerPanel.add(panel5);

        panel6 = new JPanel();
        panel6.add(attemptCounter);
        biggerPanel.add(panel6);

        add(biggerPanel, BorderLayout.CENTER);
    }



    private static String binaryReturn(JTextField decimal) {

        try {
            String dec = decimal.getText();
            int i = Integer.parseInt(dec);
            if (i < 0 || i > 255) {
                return "0 - 255 only.";
            }
            return Integer.toBinaryString(i);
        } catch (Exception e) {
            return "Whole numbers only.";
        }
    }
}




