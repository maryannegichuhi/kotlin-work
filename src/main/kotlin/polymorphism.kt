//Parent class
open class shape{
    open fun draw(){
        println("It is a shape")
    }
//Child class
class rectangle:shape(){
    override fun draw(){
        println("Rectangle")
    }

}
class square:shape(){
    override fun draw(){
       println("Square")
    }

}
}
fun main() {
    var a = shape()
    a.draw()

    var b = shape.rectangle()
    b.draw()

    var c=shape.square()
    c.draw()

}