class CTriangle extends CShape
{
  protected int length,width,height;
  public CTriangle(double l,double w,double h)
  {
     length=l;
     width=w;
     height=h
  }
 public void show()
 {
    System.outt.print("color="+color+", ")
    System.outt.println("area="+0.5*width*height)
 }
}

public class app
{
 public static void main(String args[])
 {
 CTriangle rect=new CTriangle(3,4,5);
 rect.setColor("Red");
 rect.show();
 }
}
