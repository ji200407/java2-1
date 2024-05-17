package Java3;
import javax.swing.*;

import java.awt.*;

public class GridLayoutEx  extends JFrame {
    public GridLayoutEx () {
        setTitle("GridLayoutEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); //컨텐트팬 알아내기

        //왼쪽 정렬로 수평간격을 30 수직 간격을 40 픽셀로 배치하는
        //FlowLayout 생성
        contentPane.setLayout(new GridLayout( 1,10));

        for(int i=0; i<10; i++){
            String text =Integer.toString(i);
            JButton button =new JButton(text);
            contentPane.add(button);
        }
        setSize(500,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx ();    
    }
    
}
