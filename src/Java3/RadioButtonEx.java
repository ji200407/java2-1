package Java3;
import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
   public RadioButtonEx() {
      setTitle("라디오버튼 만들기  예제");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());

      ButtonGroup g = new ButtonGroup();

        ImageIcon img = new ImageIcon("images/체리.jpg");
      
      JRadioButton apple = new JRadioButton("사과");
      JRadioButton pear = new JRadioButton("배", true);
      JRadioButton cherry = new JRadioButton(img);
      
      g.add(apple);
      g.add(pear);
      g.add(cherry);

      c.add(apple); c.add(pear); c.add(cherry);

      setSize(250,150);
      setVisible(true);
   }
   
   public static void main(String [] args) {
      new RadioButtonEx();
   }
}