package sa.dev.kotlinbasics


// comparison operator
// greater equal >=
//lower equal <=
//equal =

fun main(){
    var legalAge = 18
    println("Please enter your age : ")

    legalAge = readln().toInt()

    if(legalAge >= 18){
        println("you are allowed to drive")

    }else {
        println("you are not allowed to drive")
    }
}