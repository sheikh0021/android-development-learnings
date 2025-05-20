package sa.dev.rockpaperscissorsgame



fun main() {
    //here we call the function that we defined
    makeCoffee(sugarCount = 1)
    makeCoffee(sugarCount = 2)
    makeCoffee(sugarCount = 0)
    makeCoffee(sugarCount = -1) //test negative
    makeCoffee(sugarCount = 30) //very high amount of sugar



    }
// Here we define function
fun makeCoffee(sugarCount: Int){
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar") //singular form
    }else {
        println("Coffee with $sugarCount spoons of sugar") //plural form
    }

}






