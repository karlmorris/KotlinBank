package base

abstract class BankAccount (_accountNumber : String, _balance : Double) {
    val accountNumber = _accountNumber
    private var balance = _balance

    open protected fun deposit(amount : Double) {
        balance += amount
    }

    fun getBalance(): Double {
        return balance
    }

    open fun withdraw(amount: Double) {
        if (amount <= balance) balance -= amount
    }
}