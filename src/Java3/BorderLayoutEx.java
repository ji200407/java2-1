package Java3;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;

import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx () {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); //컨텐트팬 알아내기

        //왼쪽 정렬로 수평간격을 30 수직 간격을 40 픽셀로 배치하는
        //FlowLayout 생성
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JButton("Calaulate"),BorderLayout.CENTER);
        contentPane.add(new JButton("add"),BorderLayout.NORTH);
        contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"),BorderLayout.EAST);
        contentPane.add(new JButton("div"),BorderLayout.WEST);


        setSize(300,200);//프레임 크기 300x200 설정
        setVisible(true);//화면에 프레임 출력

    }
    public static void main(String[] args) {
        new BorderLayoutEx();    
    }
    
}
