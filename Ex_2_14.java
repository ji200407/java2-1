import java.util.Scanner;
public class Ex_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하시오:");
        int month = scanner.nextlnt();//정수로 월 입력
        switch(month){
            case 3:
            case 4:
            case 5:
              System.out.println("봄입니다");
              break;
            case 6: case 7: case 8:
              System.out.println("여름입니다");
            case 9: case 10: case 11:
              System.out.println("가을입니다");
            case 12: case 1: case 2:
              System.out.println("겨울입니다");
            default:
              System.out.println("잘못된 입력 입니다");
        }
      scanner.close();  
    }
    
}
