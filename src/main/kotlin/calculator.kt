import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number: ")
    var number=reader.nextDouble()

    println("Enter the operator")
    var symbols=reader.next()

    println("Enter second number:")
    var num=reader.nextDouble()

    if (symbols=="+"){
        print("The sum of the two numbers is ")
        println(number+num)
    }
    else if(symbols=="-"){
        print("The difference of the two numbers is ")
        println(number-num)
    }
    else if(symbols=="*"){
        print("The product of the two numbers is ")
        println(number*num)
    }
    else if(symbols=="/"){
        print("The quotient of the two numbers is ")
        println(number/num)
    }
    else if(symbols=="%"){
        print("The remainder of the two numbers is ")
        println(number%num)
    }
    else{
        println("Invalid operator")
    }
}