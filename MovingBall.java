import javax.swing.*;
import java.awt.*;

public class MovingBall {
    JFrame frame;
    MovingBall(){
        frame= new JFrame("Second Session");
        Panel panel= new Panel(900,700);
        panel.setBackground(Color.black);
        Container c=  frame.getContentPane();
        c.setBackground(Color.blue);
        c.add(panel);

        frame.setVisible(true);
        frame.setSize(900,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public  static void main(String arg[]){
        MovingBall object = new MovingBall();
    }
}
