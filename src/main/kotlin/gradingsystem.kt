import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the grade: ")
    var marks=reader.nextDouble()

    if (marks in 80.0..100.0){
        println("you have an A")
    }
    else if(marks<80 && marks>=70){
        println("you have a B")
    }
    else if(marks<70 && marks>=50){
        println("you have a C")
    }
    else if(marks in 0.0..50.0){
        println("you have Failed")
    }
    else{
        println("Invalid marks")
    }

    println("Enter student grade: ")
    var grade=reader.nextInt()

    if(grade>=80 && grade<=100){
        println("Scored an A")
    }
    else  if(grade>=70 && grade<=80){
        println("Scored an B")
    }
    else  if(grade>=60 && grade<=70){
        println("Scored an C")
    }
    else{
        println("It is a pass")
    }






}