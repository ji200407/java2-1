package Java3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MouseListener extends JFrame {
    private JLabel la= new JLabel("Hello");
    
    public MouseListener() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyHouseListener ());

        c.setLayout(null);
        la.setSize(150,120);
        la.setLocation(30,30);
        c.add(la);

        setSize(500,500);
        setVisible(true);

    }
class MyMouseListener implements MouseListener {
    public void mousepressed(MouseEvent e) {
        int x=e.getx();
        int y=e.getY();
        la.setLocation(x,y);

    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEnter(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
    public static void main(String [] args) {
        new MouseListener();
    }
}
