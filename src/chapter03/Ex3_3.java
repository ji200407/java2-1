package chapter03;
public class Ex3_3 {
     public static void main(String args[]){
        char foo='a';
        char bar='A';

        do{
            System.out.print(foo);
            foo=(char)(foo+1);
        }while(foo <= 'z');

        while(bar <= 'Z'){
            System.out.print(bar);
            bar=(char)(bar+1);
        }
     }
    
}
