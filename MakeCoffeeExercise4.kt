package sa.dev.rockpaperscissorsgame



fun main() {

    println("Who is this coffee for ?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    //here we call the function that we defined
    makeCoffee(name, sugarCountInt)
//    makeCoffee(name, sugarCount = 2)
//    makeCoffee(name, sugarCount = 0)
//    makeCoffee(name, sugarCount = -1) //test negative
//    makeCoffee(name, sugarCount = 30) //very high amount of sugar



    }
// Here we define function
fun makeCoffee(name: String, sugarCount: Int){
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name") //singular form
    }else {
        println("Coffee with $sugarCount spoons of sugar for $name") //plural form
    }

}






