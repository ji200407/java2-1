package Java3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn =new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
          //무명 클래스로 메인 이벤트 리스너를 작성한다
        btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JButton b=(JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
               b.setText("Action");
            setTitle(b.getText());
               
        }
    });
        setSize(250, 120);
        setVisible(true);

     }

    //독립된 클래스로 메인 이벤트 리스너를 작성한다
      class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton b=(JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
               b.setText("Action");
        IndepClassListener.this.setTitle(b.getText());
       // InnerClassListener.this.setTitle(b.getText());
               
        }
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }

}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b= (JButton)e.getSource();
        if(b.getText().equals("Action"))
           b.setText("액션");
        else
            b.setText("Action");
    }
}