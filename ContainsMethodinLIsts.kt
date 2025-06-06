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

    shoppingList.add(2, "Fans")
    println(shoppingList[2])
    val hasFan = shoppingList.contains("Fans")
    if(hasFan){
        println("It has Fan under the list")
    }else{
        println("it doesnt consists that kinda item....")
    }
    println(shoppingList)

}




