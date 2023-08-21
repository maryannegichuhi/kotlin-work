//write a program that checks for a leap year
//it should allow you to enter the year
import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the year")
    var year=reader.nextInt()

    if (year%4==0){
        println("It is a leap year")
    }
    else{
        println("it is not a leap year")
    }
}
