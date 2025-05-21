package sa.dev.rockpaperscissorsgame



fun main() {
    println("Enter the first number: ")
    val  num1 = readln().toIntOrNull() ?: 0

    println("Enter the second number: ")
    val num2 = readln().toIntOrNull() ?: 0

    val result = add(num1, num2)

    //formatted output
    println("\n--- Result ---")
    println("The result of $num1 + $num2 is: $result")



    }
fun add(a: Int, b: Int): Int{
    return a + b
}





