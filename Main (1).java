/*#1 - One access modifier used is public which allows access from 
any class from any package */

/*#2 - Another access modifier used is private which the member can only be 
accessed within its own class */

/*#3 - Inheritance promotes code reusability and scalability, the common 
properties and functionality can be written in one class (superclass),
and other classes (subclasses) inherit common class and can change (add or modify) 
functionality*/

class Shape{
    int shapeSides;

Shape(int shapeSides){
    this.shapeSides = shapeSides;
}

int getshapeSides(){
    return shapeSides;
}
void setshapeSides(int shapeSides){
    this.shapeSides = shapeSides;
}}

class Circle extends Shape{
    public Circle(){
        super(0);
}}
class Rectangle extends Shape{
    public Rectangle(){
        super(4);
}}
public class Main{
	public static void main(String[] args) {
	    Circle circle = new Circle();
	    Rectangle rectangle = new Rectangle();
	    
		System.out.println("Circle: "+ circle.getshapeSides());
		System.out.println("Rectangle: "+ rectangle.getshapeSides());
	}
}
