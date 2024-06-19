package Java3;

package Java3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx2 extends JFrame {
    private JLabel la = new JLabel(" Move Me");

    public MouseEventAllEx2() {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.setLayout(null);

        la.setSize(80, 20);
        la.setLocation(100, 80);
        c.add(la);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        @Override
        public void mousePressed(MouseEvent e) {
            la.setLocation(e.getX(), e.getY());
            setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // 마우스 놓았을 때의 동작 정의
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // 마우스 클릭했을 때의 동작 정의
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Component comp = (Component) e.getSource();
            comp.setBackground(Color.CYAN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // 마우스가 컴포넌트를 빠져나갔을 때의 동작 정의
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setLocation(e.getX(), e.getY());
            setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // 마우스를 움직였을 때의 동작 정의
        }
    }

    public static void main(String[] args) {
        new MouseEventAllEx();
    }
}
