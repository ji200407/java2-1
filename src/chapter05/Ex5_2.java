package chapter05;
public class Ex5_2 {
    public static void main(String[] args) {
        ColorPoin cp = new ColorPoin(5,6,"bule");
        cp.showColorPoint();
    }
    
}

class Point{
    private int x,y;
    public Point(){
        this.x=this.y=0;
    }
    public Point(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoin extends Point{
    private String color;

    public ColorPoin(int x, int y, String color){
        super(x,y);
        this.color=color;
    }
    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }

}
