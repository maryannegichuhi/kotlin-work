// write a program that return the quotient and the remainder
import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number")
    var fnumber=reader.nextInt()

    println("Enter second number")
    var snumber=reader.nextInt()

    var quotient=fnumber/snumber
    var remainder=fnumber%snumber
    println("The quotient of the two number is $quotient its rem is $remainder")

}
