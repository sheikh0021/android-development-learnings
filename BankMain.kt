package sa.dev.classesInKotlin
import sa.dev.classesInKotlin.BankAccount

fun main() {
    val samiBankAccount = BankAccount("Sami", 1500.25)
    samiBankAccount.deposit(500.0)
    samiBankAccount.deposit(5600.2)
    samiBankAccount.withdraw(56.0)
    samiBankAccount.displayTransactionHistory()
    println("${samiBankAccount.accountHolder}'s balance is ${samiBankAccount.balance}")
}
