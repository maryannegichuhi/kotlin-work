class Employee(var jobdescription:String,var salary:Double,var yearsofexperience:Int,var age:Int){

}
fun main(){
    var a=Employee("Manager",150000.00,10,55)
    println(a.jobdescription)
    var b=Employee("Secretary",50000.00,5,30)
    println(b.jobdescription)
    var c=Employee("Watchman",10000.00,4,35)
    println(c.jobdescription)

}