fun main(args: Array<String>) {
    println("Hello World!")

    var myAccount = SavingsAccount("ABC123", 34.0)

    println("Account number ${myAccount.accountNumber}")
    println("Account balance ${myAccount.getBalance()}")


}