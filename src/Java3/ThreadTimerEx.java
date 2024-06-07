package Java3;
import java.awt.*;
import javax.swing.*;

class TimerThread implements Runnable{
  
    private JLabel timerLabel;
    public TimerThread(JLabel timerLabel){
        this.timerLabel=timerLabel;
    }

    @Override
    public void run(){
        int n=0;
        while(true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(millis:1000);
            }
            catch(InterruptedException e) {return;}
        }
    }
}

public class ThreadTimerEx extends JFrame{
    public ThreadTimerEx() {
        setTitle("Thread를 상속 받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        setSize(250, 150);
        setVisible(true);

        JLabel timerLabel = new JLable();
        timerLabel.setFont(new Font(name:"Gothic", Font.ITALIC));
        c.add(timerLabel);

        TimerThread runnable = new TimerThread(timerLabel);
        Thread th = new Thread(runnable);

        th.start();
}

public static void main(String[] args) {
    new ThreadTimerEx();
}
}