public interface Area
{
   public double getArea();
}

//interface Volume

public interface Volume
{
   public double getVolume();
}

//Shape class
class Shape
{
   //data member
   String name;
   //constructor
   public Shape()
   {
       name = "";
   }
   //return name
   public String getName()
   {
       return name;
   }
}

//Circle class
class Circle extends Shape implements Area
{
   //data member
   double radius;
   //constructor
   Circle(double r, String n)
   {
       name = n;
       radius = r;
   }
   //return area of circle
   public double getArea()
   {
       return 3.1415*radius*radius;
   }
}

//Square class
class Square extends Shape implements Area
{
   //data member
   double side;
   //constructor
   public Square(double s, String n)
   {
       name = n;
       side = s;
   }
   //return area of Square
   public double getArea()
   {
       return side * side;
   }
}

//Cylinder class
class Cylinder extends Circle implements Volume
{
   //data member
   double height;
   //constructor
   public Cylinder(double h, double r, String n)
   {
       super(r, n);
       height = h;
   }
   //return volume of Cylinder
   public double getVolume()
   {
       return 3.1415 * radius*radius * height;
   }
}

//Sphere class
class Sphere extends Circle implements Volume
{
   //constructor
   public Sphere(double r, String n)
   {
       super(r, n);
   }
   //return volume of Sphere
   public double getVolume()
   {
       return 4*3.1415*radius*radius*radius/3;
   }
}

//Cube class
class Cube extends Square implements Volume
{
   //constructor
   public Cube(double s, String n)
   {
       super(s, n);
   }
   //return volume of Cube
   public double getVolume()
   {
       return side*side;
   }
}

//Glome class
class Glome extends Sphere implements Volume
{
   //constructor
   public Glome(double r, String n)
   {
       super(r, n);
   }
   //return volume of Glome
   public double getVolume()
   {
       return 0.5*3.1315*3.1415*Math.pow(radius, 4);
   }
}

//Driver class
class Driver
{
   //main method
   public static void main (String[] args)
   {
       Circle c = new Circle(10, "Circle");
       System.out.println ("Name = " + c.getName());
       System.out.println ("Area = " + c.getArea());
      
       Square s = new Square(10, "Square");
       System.out.println ("Name = " + c.getName());
       System.out.println ("Area = " + s.getArea());
      
       Cylinder c2 = new Cylinder(5, 10, "Cylinder");
       System.out.println ("Name = " + s.getName());
       System.out.println ("Volume = " + c2.getVolume());
      
       Sphere s2 = new Sphere(10, "Sphere");
       System.out.println ("Name = " + c2.getName());
       System.out.println ("Volume = " + s2.getVolume());
      
       Cube c3 = new Cube(10, "Cube");
       System.out.println ("Name = " + s2.getName());
       System.out.println ("Volume = " + c3.getVolume());
      
       Glome g = new Glome(10, "Glome");
       System.out.println ("Name = " + c3.getName());
       System.out.println ("Volume = " + g.getVolume());
   }
}
