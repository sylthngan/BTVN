fun main () {
    // Đây là câu chào
    println("Hello, world")
    println("This is the text to print!")

    // Biến
    val age = "5"
    val name = "Rover"

    var roll = 6
    var rolledValue : Int = 4

    // In biến có các mẫu chuỗi
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")

    println("You have a changing variable which is ${roll}")
    println("And the changing variable is ${rolledValue} ")

    // Hàm không có đối số
    printHello()

    //Hàm không có đối số
    printBorder("n", 10)

    // Lặp lại
    printBorder()
    printCakeBottom(5, 3)

    //
    val num = 4
    if (num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }


    //Câu lệnh có điều kiện với when
    val luckyNumber = 3
    val rollResult = (1..6).random()

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }

    val dice = Dice()
    dice.roll()

    val dices = Dices(8)
    dices.roll()
    println(dices.roll())

}
// Hàm  có đối số
fun printHello () {
    println ("Hello Kotlin")
}
//Hàm không có đối số
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
// Hàm trả về 1 gía trị
fun roll(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}
fun printBorder() {
    repeat(23) {
        println("=")
    }
}
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

class Dice {
    var sides = 6
    fun roll(){
        val randomNumber = (1..sides).random()
        println(randomNumber)
    }
}

class Dices ( val num: Int){
    fun roll():Int{
        val  randomNum = (1..num).random()
        return randomNum
    }
}