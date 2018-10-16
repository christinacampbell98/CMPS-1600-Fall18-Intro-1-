/** @Author: Christina Campbell and Sam Eigen
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class Calculator extends JFrame {

    private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtEqual;
    private JButton jbtClear;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtParantheses1;
    private JButton jbtParantheses2;
    private JButton jbtSolve;
    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;



    public String display = "";

    public Calculator() {

        JPanel NumberPanel = new JPanel();
        NumberPanel.setLayout(new GridLayout(4, 3));
        NumberPanel.add(jbtNum1 = new JButton("1"));
        NumberPanel.add(jbtNum2 = new JButton("2"));
        NumberPanel.add(jbtNum3 = new JButton("3"));
        NumberPanel.add(jbtNum4 = new JButton("4"));
        NumberPanel.add(jbtNum5 = new JButton("5"));
        NumberPanel.add(jbtNum6 = new JButton("6"));
        NumberPanel.add(jbtNum7 = new JButton("7"));
        NumberPanel.add(jbtNum8 = new JButton("8"));
        NumberPanel.add(jbtNum9 = new JButton("9"));
        NumberPanel.add(jbtNum0 = new JButton("0"));

        JPanel TextPanel = new JPanel();
        TextPanel.setLayout(new FlowLayout());
        TextPanel.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel OperationPanel = new JPanel();
        OperationPanel.setLayout(new GridLayout(7, 1));
        OperationPanel.add(jbtAdd = new JButton("+"));
        OperationPanel.add(jbtSubtract = new JButton("-"));
        OperationPanel.add(jbtMultiply = new JButton("*"));
        OperationPanel.add(jbtParantheses1 = new JButton("("));
        OperationPanel.add(jbtParantheses2 = new JButton(")"));
        OperationPanel.add(jbtSolve = new JButton("="));
        OperationPanel.add(jbtClear= new JButton("C"));

        JPanel FullPanel = new JPanel();
        FullPanel.setLayout(new GridLayout());
        FullPanel.add(TextPanel, BorderLayout.NORTH);
        FullPanel.add(NumberPanel, BorderLayout.SOUTH);
        FullPanel.add(OperationPanel, BorderLayout.EAST);

        add(FullPanel);

        jbtNum1.addActionListener(new ListenToOne());
        jbtNum2.addActionListener(new ListenToTwo());
        jbtNum3.addActionListener(new ListenToThree());
        jbtNum4.addActionListener(new ListenToFour());
        jbtNum5.addActionListener(new ListenToFive());
        jbtNum6.addActionListener(new ListenToSix());
        jbtNum7.addActionListener(new ListenToSeven());
        jbtNum8.addActionListener(new ListenToEight());
        jbtNum9.addActionListener(new ListenToNine());
        jbtNum0.addActionListener(new ListenToZero());

        jbtAdd.addActionListener(new ListenToAdd());
        jbtSubtract.addActionListener(new ListenToSubtract());
        jbtMultiply.addActionListener(new ListenToMultiply());
        jbtParantheses1.addActionListener(new ListenToPar1());
        jbtParantheses2.addActionListener(new ListenToPar2());
        jbtSolve.addActionListener(new ListenToSolve());
        jbtClear.addActionListener(new ListenToClear());

    } 



    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "+");

        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "-");
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "*");
        }
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText("");
        }
    }


    class ListenToPar1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "(");
        }
    }

    class ListenToPar2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + ")");
        }
    }
    //
    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try{
                display = jtfResult.getText();
                isValidInput(display);
            }
            catch(Exception g){
                jtfResult.setText("Invalid Input (Press C to clear)");
            }
        }




    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

    public void isValidInput(String display) {

        ArrayList<Character> displayArray = new ArrayList<>();
        int par1Counter = 0;
        int par2Counter = 0;
        int valid = 0;

        for (int i = 0; i < display.length(); i++) {
            displayArray.add(display.charAt(i));
        }

        for (int i = 0; i < displayArray.size(); i++) {
            if ((displayArray.get(i) == '*') && (displayArray.get(i + 1) == '*')) {
                jtfResult.setText("Invalid Input (Press C to clear)");; // multiply and multiply
                valid = 1;
            }
            if ((displayArray.get(i) == '+') && (displayArray.get(i + 1) == '+')) {
                jtfResult.setText("Invalid Input (Press C to clear)");//add and add
                valid = 1;
            }
            if ((displayArray.get(i) == '-') && (displayArray.get(i + 1) == '-')) {
                jtfResult.setText("Invalid Input (Press C to clear)");  //sub and sub
                valid = 1;
            }
            if ((displayArray.get(i) == '*') && (displayArray.get(i + 1) == '+')) {
                jtfResult.setText("Invalid Input (Press C to clear)");  //multiply and add
                valid = 1;
            }
            if ((displayArray.get(i) == '+') && (displayArray.get(i + 1) == '-')) {
                jtfResult.setText("Invalid Input (Press C to clear)"); //multiply and subtract
                valid = 1;
            }
            if ((displayArray.get(i) == '+') && (displayArray.get(i + 1) == '-')) {
                jtfResult.setText("Invalid Input (Press C to clear)");  //add and subtract
                valid = 1;
            }
            if ((displayArray.get(i) == '+') && (displayArray.get(i + 1) == '*')) {
                jtfResult.setText("Invalid InpuT (Press C to clear)");  //add and multiply
                valid = 1;
            }
            if ((displayArray.get(i) == '-') && (displayArray.get(i + 1) == '*')) {
                jtfResult.setText("Invalid Input (Press C to clear)");  //subtract and multiply
                valid = 1;
            }
            if ((displayArray.get(i) == '-') && (displayArray.get(i + 1) == '+')) {
                jtfResult.setText("Invalid Input (Press C to clear)"); //subtract and add
                valid = 1;
            }

            if (displayArray.get(i) == '(') {
                par1Counter++;
            }
            if (displayArray.get(i) == ')') {
                par2Counter++;
            }
            if ((displayArray.get(i)== '(') && (displayArray.get(i+1)==')')) {
                jtfResult.setText("Invalid Input (Press C to clear)");
                valid=1;
            }
        }

        if (par1Counter != par2Counter) {
            jtfResult.setText("Invalid Input (Press C to clear)");
            valid = 1;
        }

        if(valid == 0){
            jtfResult.setText("Valid Input (Press C to clear)");
        }

    }
}

