package java4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class ServerEx {
    public static void main(String[] args) {
        BufferedReader in=null;
        BufferedReader out =null;
        ServerSocket listener=null;
        Socket socket =null;
        Scanner scanner= new Scanner(System.in);
        try{
            listener=new ServerSocket(9999);
            System.out.println("연결을 기다리고 있습니다....");
            socket =listener.accept();
            System.out.println("연결되었습니다.");
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new BufferedReader(new OutputStreamWriter(socket.getOutputStream()));
            while (true){
                String inputMessage=in.readLine();
                if(inputMessage.equalsIgnoreCase("bye")){
                    System.out.println("클라이언트에서 bye로 연결종료하였음");
                    break; 

                }
                System.out.println("클라이언트:"+inputMessage);
                System.out.print("보내기>>");
                String outputMessage =scanner.nextLine();
                out.write(outputMessage+"\n");
                out.flush();

            }
        }catch(IOException e) {System.out.println(e.getMessage());
        }finally {
            try{
                scanner.close();
                socket.close();
                listener.close();
            }
            catch(IOException e){ System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");}
        }
    }
}
