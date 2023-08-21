fun main(){
    var word="Hello World"
    var school="eMobilis"
    var day="It's a 'Saturday'"// never use a double quote inside a double quote instead use a single quote

    println(word+" "+school)
    println(word.plus(school))
    println(word+" I study at "+school) //concatenation
    println("I study at $school") //string interpolation

    println(word[0]) //Accessing an element
    println(word[10])
    println(word.indexOf("World"))
    println(word.indexOf('l'))

    println(word.toUpperCase())

}