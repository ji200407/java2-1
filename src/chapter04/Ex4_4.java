public class Ex4_4 {
    String title;
    String author;

    public Ex4_4(String t){
        title= t; author="착자미상";

    }
    public Ex4_4(String t,String a){
        title= t; author= a ;
    }

     public static void main(String [] args){
        Ex4_4 littlePrince= new Ex4_4("어린왕자","생택쥐패리");
        Ex4_4 loveStory=new Ex4_4("춘향전");
        System.out.println(littlePrince.title+""+littlePrince.author);
        System.out.println(loveStory.title+""+loveStory.author);
     }
}
