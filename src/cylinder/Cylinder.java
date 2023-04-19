package cylinder;

import test3.MathUtil;

public class Cylinder {
    private int radius = 4;
    private int height = 6;
   public  double getVolume(int radius, int height){
       double baseArea = getBaseArea(radius);
       double perimeter = getPerimeter(radius);
       double Volume = perimeter * height + 2 * baseArea;
       return Volume;
   }
   public  double getPerimeter(int radius){
       return 2 * Math.PI * radius;
   }
   public double getBaseArea(int radius){
       return Math.PI * radius * radius;
   }

    @Override
    public String toString() {
        return String.format("%.4f %.3f %15f \n",getPerimeter(radius),getPerimeter(radius),getVolume(radius,height));
    }
}
