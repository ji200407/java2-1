package Java3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Java3.MouseListener.MyMouseListener;


public class MouseEventAllEx extends JFrame {
    private JLabel la= new JLabel(" Move Me");

    public MouseEventAllEx() {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        MyMouseListener listener = 
                            new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.setLayout(null);

        la.setSize(80,20);
        la.setLocation(100,80);
        c.add(la);

        setSize(300,200);
        setVisible(true);
    }
    class MyHouseListener implements MouseListener{
       public void mousePressed(MouseEvent e) {
        la.setLocation(e.getY());
        setTitle("mousePressed("+e.getX()+","+e.getY()+")");
       }
       public void mouseReleased(MouseEvent e) {
        la.setLocation(e.getX(),e.getY());
       }
       public void mouseClicked(MouseEvent e) {}
       public void mouseEntered(MouseEvent e) {
        Component comp = (Component)e.getSource();
        comp.setBackground(Color.CYAN);
       }
       public void mouseDragged(MouseEvent e) {
        la.setLocation(e.getX(),e.getY());
        setTitle("mouseDragged("+e.getX()+","+e.getY()+")");
       }
    }
    public static void main(String [] args) {
        new MouseEventAllEx();
    } 
}
