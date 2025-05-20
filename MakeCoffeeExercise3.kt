package sa.dev.rockpaperscissorsgame



fun main() {
    //here we call the function that we defined
    makeCoffee(name = "Sami", sugarCount = 1)
    makeCoffee(name = "Joseph", sugarCount = 2)
    makeCoffee(name = "John", sugarCount = 0)
    makeCoffee(name = "Jacob", sugarCount = -1) //test negative
    makeCoffee(name = "Jack", sugarCount = 30) //very high amount of sugar



    }
// Here we define function
fun makeCoffee(name: String, sugarCount: Int){
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name") //singular form
    }else {
        println("Coffee with $sugarCount spoons of sugar for $name") //plural form
    }

}






