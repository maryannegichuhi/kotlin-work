class Animal( var colour:String,var size:Int){

    fun eat(){
        println("It is eating")
    }
    //fun sleep(){
        //println("It is sleeping")
    fun sleep(name:String){
        println("The animal is $name")
    }
    fun woof(){
        println("Woofing")
    }
}
fun main(){
    var a=Animal("White",34)
    var f=Animal("Grey",15)
    f.sleep("Fish")
    var l=Animal("Brown",50)
    l.sleep("Leopard")



}
