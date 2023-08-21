class Person{
    //Attribute/Property/Variable
    var name="Glory"
    var skintone="Lightskin"
    var age=45

    //Metthod/Function
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }


}
fun main(){
    //Object1
    var teacher=Person()
    println(teacher.age)
    teacher.walk()
    //Object2
    var student=Person()
    println(student.name)
    student.eat()
}