
public class Ex5_1 {
  public static void main(String[] args) {
    Point p =new Point();
    p.set(1, 2);
    p.showPoint();

    ColorPoin cp= new ColorPoin();
    cp.set(3,4);
    cp.setColor("red");
    cp.showColorPoint();
    
}
}
class Point{
    private int x,y;
    public void set(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
       System.out.println("("+x+","+y+")");
}
}
class ColorPoin extends Point{
    private String color;
    public void setColor(String color) {
        this.color=color;
    }
    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }

}
