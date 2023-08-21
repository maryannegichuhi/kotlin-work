//Parent class
open class Shape{
    fun area(){
        println("this is the area")
    }
    fun circumference(){
        println("this is the  circumference")

    }
//Child class
class Rectangle:Shape(){
    var length=15
    var breath=10

    fun getlength(){
        println(length)
    }

    fun getbreath(){
        println(breath)
    }

}
class Circle:Shape(){
    var radius=24

    fun getradius(){
        println(radius)
    }
}
}
fun main(){
    var a=Shape()
    a.area()

    var b=Shape.Rectangle()
    b.getbreath()
    b.area()

    var c=Shape.Circle()
    c.getradius()
    c.circumference()
}