package sa.dev.rockpaperscissorsgame


fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("rock, paper or scissors ?")
    playerChoice = readln()

    val randomNumber = (1..3).random()  //selects number randomly from 1 to 3
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3-> {
            computerChoice = "scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        

        else -> "Computer"
    }

    if(winner == "Tie"){
        println("Its a tie here")
    }else if(winner == "Player"){
        println("Player won")
    }else {
        println("Computer won ")
    }

}