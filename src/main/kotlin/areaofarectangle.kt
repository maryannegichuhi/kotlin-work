import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter length")
    var length=reader.nextDouble()

    println("Enter width")
    var width=reader.nextDouble()

    var area=length*width
    println("The area of the rectangle is $area")
}