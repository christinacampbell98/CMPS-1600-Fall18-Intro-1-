/**@Author: Christina Campbell
 *
 */

import javax.swing.*;
import java.awt.*;

/** create a class that extends JFrame
 *
 */
public class IDCardFrame extends JFrame {
    /**define the parameter of the constructor
     *
     */
    String title;
    public IDCardFrame(String title) {
        /**create an instance of the parameter; and set it as the title of the Jframe
         * initiate all of the JLabels that will be used, and the GridBagConstraint
         */
        this.title=title;
        setTitle(title);
        JLabel name= null;
        JLabel jProgrammer= null;
        JLabel height= null;
        JLabel eyes= null;
        JLabel weight= null;
        JFrame id= null;
        JLabel address1= null;
        JLabel address2= null;
        GridBagConstraints layout=null;
/**fill the JLabels with the desired content
 *
 */
        name= new JLabel("Christina Campbell");
        jProgrammer= new JLabel("Java Programmer");
        jProgrammer.setFont( new Font("Times New Roman", Font.BOLD, 15));
        jProgrammer.setForeground(Color.RED);
        eyes= new JLabel("Eyes: BRO");
        height= new JLabel("Height: 5-06");
        weight= new JLabel("Weight: 135");
        id= new JFrame("ID card");
        address1= new JLabel("123 A street");
        address2= new JLabel("Hill, Tx 77077");
/**use the ImageIcon tool to upload photos saved
 *
 */
        ImageIcon image= new ImageIcon("/Users/christinacampbell/desktop/idpic.jpg");
        JLabel JImage= new JLabel(image);

        ImageIcon heart= new ImageIcon("/Users/christinacampbell/desktop/heart.png");
        JLabel JHeart= new JLabel((heart));
/** use GridBagLayout to set the location of the donor heart
 *
 */
        setLayout(new GridBagLayout());
        layout= new GridBagConstraints();
        layout.gridx=10;
        layout.gridy=10;
        layout.anchor= GridBagConstraints.BASELINE_TRAILING;
        layout.insets= new Insets(10,10,10,10);
        add(JHeart,layout);

/**use GridBagLayout to set the position of the photo ID
 *
 */
        layout= new GridBagConstraints();
        layout.gridx=5;
        layout.gridy=5;
        layout.weightx=3.0;
        layout.weighty=3.0;
        layout.insets= new Insets(20,20,20,20);
        add(JImage, layout );
/** use GridBagLayout to set the position of the name JLabel
 *
 */

        layout= new GridBagConstraints();
        layout.gridy=0;
        layout.gridx=5;
        layout.anchor= GridBagConstraints.NORTH;
        layout.insets= new Insets(0,10,10,10);
        add(name, layout);
/** use GridBagLayout to set the position of the jProgrammer JLabel
 *
 */
        layout= new GridBagConstraints();
        layout.gridx=5;
        layout.gridy=10;
        layout.anchor= GridBagConstraints.SOUTH;
        layout.insets= new Insets(10,10,0,10);
        add(jProgrammer, layout);
/** use GridBagLayout to set the position of the height JLabel
 *
 */
        layout= new GridBagConstraints();
        layout.gridx= 0;
        layout.gridy= 8;
        layout.insets= new Insets(10,10,10,10);
        add(height, layout);
/** use GridBagLayout to set the position of the weight JLabel
 *
 */
        layout= new GridBagConstraints();
        layout.gridx=0;
        layout.gridy=9;
        layout.insets= new Insets(10,10,10,10);
        add(weight,layout);
/** use GridBagLayout to set the position of the address1 JLabel
 *
 */
        layout= new GridBagConstraints();
        layout.gridx=10;
        layout.gridy=7;
        layout.anchor= GridBagConstraints.WEST;
        layout.insets= new Insets(10,10,0,10);
        add(address1,layout);
/** use GridBagLayout to set the position of the address2 JLabel
 *
 */
        layout= new GridBagConstraints();
        layout.gridx=10;
        layout.gridy=8;
        layout.anchor= GridBagConstraints.WEST;
        layout.insets= new Insets(0,10,10,10);
        add(address2,layout);
/** use GridBagLayout to set the position of the eyes JLabel
 *
 */
        layout= new GridBagConstraints();
        layout.gridx=10;
        layout.gridy=9;
        layout.insets= new Insets(10,10,10,10);
        add(eyes,layout);


        /** Terminate program when window closes
         *
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**assign a color to the background
         * Make the JFrame appear in the center of the screen
         * set the size of the JFrame and restrict it so that it cannot be resized
         */
        getContentPane().setBackground(Color.cyan);
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);


        /** enable it to  Display the window
         *
         */
        setVisible(true);



    }

    /** create the main() class that calls the JFrame constructed in the IDCardFrame Class
     *
     * @param args
     */
    public static void main(String [] args) {
       IDCardFrame id= new IDCardFrame("Driver's License");


    }
}

