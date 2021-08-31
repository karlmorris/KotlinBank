abstract class BankAccount (_accountNumber : String, _balance : Double) {
    val accountNumber = _accountNumber
    private var balance = _balance

    fun getBalance(): Double {
        return balance
    }

    open fun withdraw(amount: Double) {
        if (amount <= balance) balance -= amount
    }
}