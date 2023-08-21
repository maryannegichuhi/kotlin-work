fun main(){
    var language= arrayOf("Kotlin","Java","PHP")
    //Reassigning a value
    language[1]="python"


    //Accessing an element
    println(language[0])
    for(x in language){
        println(x)
    }

    //Size of the array
    println(language.size)

    //adding an element to an array
    var new=language.plus("C++")
    for (x in new){
        println(x)
    }


}