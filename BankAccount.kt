package sa.dev.classesInKotlin
import sa.dev.classesInKotlin.BankAccount
import java.time.temporal.TemporalAmount

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()


    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }
    fun withdraw(amount: Double){
        if (amount <= balance){
            //we can withdraw money
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else {
            //we cannot withdraw money
            println("You dont have enough money")
        }

    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }

    }
}