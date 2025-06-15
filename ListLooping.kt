package sa.dev.classesInKotlin

import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun main() {
//declare an initialize a mutable list
    val number = mutableListOf(1, 2, 3, 4, 5, 6)
//print the initial list
    println("Initial list is : $number")

    //loop through the list using indices
    for (i in 0 until number.size) {
        println("Element at index $i is ${number[i]}")
    }
}