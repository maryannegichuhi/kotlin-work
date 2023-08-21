import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter a number: ")
    var number=reader.nextInt()

    if(number%2==0){
        println("Number is even")

    }
    else{
        println("Number is odd")
    }

}
