package sa.dev.classesInKotlin

import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun main() {
//declare an initialize a mutable list
    val fruitList = mutableListOf("Apple", "Orange", "Banana", "Mango", "Grapes")
//print the initial list
    println("initial fruit list: $fruitList")
    //Add a new fruit to the list
    fruitList.add("Strawberry")
    //print the new list
    println( "After adding a new fruit: $fruitList")
    //remove a fruit from the list
    fruitList.remove("Banana")
    //print the updated list now
    println("Updated fruit list: $fruitList")

    //check if the specific fruit exists
    val hasFruit = "Mango"
    if (fruitList.contains(hasFruit)){
        println("The list consists Mango ")
    }else{
        println("The list has no such fruit")
    }
    //for loop
    for (item in fruitList){
        println(item)
        if (item == "Grapes"){
            fruitList.removeLast()
            break
        }
    }
}