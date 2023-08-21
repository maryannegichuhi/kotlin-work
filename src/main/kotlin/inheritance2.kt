open class employee{

    fun name(){
        println("Maryanne")
    }
    fun age(){
        println(19)
    }
    fun salary(){
        println(500000)

    }
class WebDeveloper:employee(){
    fun website(){
        println("best website developer")
    }

}
class androidDeveloper:employee(){
    fun android(){
        println("best android app developer")
    }
}
class iOSDeveloper:employee(){
    fun iosapp(){
        println("best iosapp developer")
    }
}

}
fun main(){
    var a=employee()
    a.name()

    var b=employee.WebDeveloper()
    b.salary()
    b.website()

    var c=employee.androidDeveloper()
    c.age()
    c.android()

    var d=employee.iOSDeveloper()
    d.salary()
    d.iosapp()

}