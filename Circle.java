public class Circle {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
  
    public double circumference() {
        return Math.PI * 2 * radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
  
    public String getInfo() {
      return "radius: " + radius + "\n" + "area: " + area() + "\n" + "circumference: " + circumference() + "\n";
    }
  }
  
  