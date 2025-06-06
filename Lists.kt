package sa.dev.classesInKotlin

fun main() {
    //Immutable list
    //this cannot change once described....
//    val shoppingList = listOf("Processor", "CPU", "Graphic Card", "SSD")
    //mutable list
    val shoppingList = mutableListOf("Processor", "CPU", "Graphic Card", "SSD")

    //adding items
    shoppingList.add("Cooling system")
    shoppingList.remove("Graphic Card")
    shoppingList.add("Graphic Card with RTX 4090")
    print(shoppingList)
}




