import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)
    println("Enter your full name :")
    var name= readln()
    println("My name is $name")

    println("Enter your age: ")
    var age=reader.nextInt()
    println("I am $age years old")

    println("Enter your height")
    var heights=reader.nextDouble()
    println("I am $heights cm tall")


}