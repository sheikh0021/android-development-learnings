package sa.dev.classesInKotlin

fun main() {
    //Immutable list
    //this cannot change once described....
//    val shoppingList = listOf("Processor", "CPU", "Graphic Card", "SSD")
    //mutable list
    val shoppingList = mutableListOf("Processor", "CPU", "Graphic Card", "SSD")

    //adding items

    print(shoppingList)
    //removes item according to the index 
    shoppingList.removeAt(0)
    print(shoppingList)
}




