package Java3;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;

public class paintJPaneLEx extends JFrame {
    public paintJPaneLEx() {
        setTitle("JPanel의 paintComponet() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(250,200);
        setVisible(true);

    }
    class MyPanel extends JPanel {
        public void paintComponet(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10,10, 50, 50);
            g.drawRect(50,50,50,50);

            g.setColor(Color.MAGENTA);
            g.drawRect(90, 90, 50, 50);
        }
    }

    public static void main(String[] args) {
        new paintJPanelEx();
    }
    
}집,.
