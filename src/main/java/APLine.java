public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int one, int two, int three){
  a = one;
  b = two;
  c = three;
  }

  public double getSlope(){
  return -1.0 * a/b;
  }

  public boolean isOnLine(double x, double y)
  return ((a * x) + (b * y) + c == 0);
}
