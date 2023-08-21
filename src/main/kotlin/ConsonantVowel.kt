// if a letter is a consonant or a vowel
import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the letter")
    var letter=reader.next()

    if (letter=="a"){
        println("It is a vowel")
    }
    else if (letter=="e"){
        println("It is a vowel")
    }
    else if (letter=="i"){
        println("It is a vowel")
    }
    else if (letter=="o") {
        println("It is a vowel")
    }
    else if (letter=="u"){
        println("It is a vowel")
    }
    else{
        println("It is a consonant")
    }

    println("Enter an alphabet: ")
    var alphabet=reader.next().single()

    if (alphabet=='a'|| alphabet=='e'|| alphabet=='i'|| alphabet=='o'|| alphabet=='u') {
        println("it is a vowel")
    }
        else{
            println("it is a consonant")
        }
    }
