//area of a trapezium= 1/2(a+b)h
import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter a")
    var fnumber=reader.nextDouble()

    println("Enter b")
    var snumber=reader.nextDouble()

    println("Enter height")
    var height=reader.nextDouble()

    val constant=0.5
    var add=(fnumber+snumber)
    var product=(constant*add*height)
    println("The area of the trapezium is $product")

}
