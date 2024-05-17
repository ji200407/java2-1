import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
    public ContentPaneEx()  {
        setTitle("ContentPane과 JFame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenPane=getContentPane();
        contentPane.setBachgriund(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("lgnore"));

        setSize(300,150);
        setVisible(true);
        
    }
    public static void min(String[] args){
        new ContentPaneEx();
    }
    
}
