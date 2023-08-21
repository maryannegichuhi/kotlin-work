//Parent class/Super class/Base class
open class animal{
    var colour="Brown"

    fun eat(){
        println("Animal is eating")
    }

}
//Child class/Sub class/Derived class
open class dog:animal(){
    var name="Siberian Husky"

    fun sound(){
        println("Dog is barking")
    }
}
class cat:dog(){
    var hasFur=true

    fun meow(){
        println("Meowing")
    }
}
fun main(){
    var a=animal()
    println(a.colour)
    a.eat()

    var b=cat()
    println(b.colour)

    var c=dog()
    c.eat()



}
