import kotlin.time.TimeSource

fun main(){
//Standard Library Functions(Predefined Functions) for example
    //; fun main(){},print/println
    println("Hello world")

    var squareroot=Math.sqrt(36.0)
    println(squareroot)

    var num=Math.round(34.26)
    println(num)

    var num2=Math.ceil(45.2)
    println(num2)

     sum()
    product(4,5)
    quotient(10,5)
    details("Maryanne",19)

}
//User-Defined Functions:user defined functions are applied outside the main function
fun sum(){
    var num3=3
    var num4=4

    println(num3+num4)

    //after writing the function we need to call it inside the main function in order to see the results
}
//Parameterized Functions
fun product(mark:Int,marks:Int){
    println(mark*marks)
}
fun quotient(x:Int,y:Int){
    println(x/y)
}
fun details(name:String,age:Int){
    println("My name is $name.I am $age years old")
}
