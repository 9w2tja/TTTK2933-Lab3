import java.util.Scanner;
import java.text.DecimalFormat;

public class TestPC2Circle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
       	DecimalFormat  df  = new DecimalFormat("0.0000");
       	double radius, area, circumference;

       	int N = sc.nextInt();
       	for (int i = 1; i <= N; i++) {

       		PC2Circle myCircle = new PC2Circle();
       		radius = sc.nextDouble();

       		myCircle.setRadius(radius);
       		area = myCircle.getArea();
     		circumference = myCircle.getCircumference();

       		System.out.println("Case #" + i + ": " +
       			df.format(myCircle.getRadius()) + " " +
       			df.format(area) + " " + df.format(circumference));
 		}
	}
}

class PC2Circle {
 	private double radius;

 	public PC2Circle() {
 		radius = 0.0;
 	}

    void setRadius(double rad) {
 		radius = rad;
 	}

    double getRadius() {
  		return radius;
  	}


 	double getArea() {
 		return radius * radius * Math.PI;
 	}

 	double getCircumference() {
 		return 2 * Math.PI * radius;
 	}
}