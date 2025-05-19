package sa.dev.rockpaperscissorsgame


fun main() {
    println("Please enter your number: ")
    val inputString = readln()
    try {
        val inputNumber = inputString.toInt()
        val multiplier = 5
        val result = inputNumber * multiplier
        println("Result of the operation is: $result")
    }catch (e: NumberFormatException){
        println("Error: $inputString is not valid integer ")
    }




    }


