fun main() {
    for (number in 1..10) {
        println(number)
    }
    for (letters in 's'..'z') {
        print("  $letters")
    }
    println("  ")
    //Break
    for (myletter in 'a'..'d') {
        if (myletter == 'c')
            break
        println(myletter)
    }
    //Continue
    for (numbers in 20..30) {
        if (numbers == 25)
            continue
        println(numbers)
    }
}