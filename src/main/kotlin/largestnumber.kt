import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number: ")
    var fnumber=reader.nextDouble()

    println("Enter second number: ")
    var snumber=reader.nextDouble()

    println("Enter third number: ")
    var tnumber=reader.nextDouble()

    if(fnumber>snumber && fnumber>tnumber){
        println("$fnumber is the largest")

    }
    else if(snumber>tnumber && snumber>tnumber){
        println("$snumber is the largest") }
    else{
        println("$tnumber is the largest")
    }

}

