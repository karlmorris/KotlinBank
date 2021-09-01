import base.BankAccount

fun main(args: Array<String>) {
    println("Hello World!")

    var myAccount : BankAccount

    myAccount = SavingsAccount("ABC123", 34.0)

    println("Account number ${myAccount.accountNumber}")
    println("Account balance ${myAccount.getBalance()}")

    myAccount.withdraw(1.0)
    myAccount.withdraw(1.0)
    myAccount.withdraw(1.0)
    myAccount.withdraw(1.0)
    myAccount.withdraw(1.0)
    myAccount.withdraw(1.0)
    myAccount.withdraw(1.0)

    println("Account number ${myAccount.accountNumber}")
    println("Account balance ${myAccount.getBalance()}")

}

fun depositVerification(account : Depositable) {

}

