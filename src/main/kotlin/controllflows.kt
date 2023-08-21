import java.util.Scanner
fun main(){
    var temperatures=20
        temperatures=37

    if (temperatures>37){
        println("It is too hot")
    }
    else if (temperatures<37){
        println("It is too cold")
    }
    else{
        println("Normal temperature")
    }

    var reader=Scanner(System.`in`)

    println("Enter temperature: ")
    var temperature=reader.nextInt()

    if (temperature>37){
        println("It is too hot")

    }
    else if(temperature<37){
        println("It is too cold")
    }
    else{
        println("Normal temperature")
    }

}


