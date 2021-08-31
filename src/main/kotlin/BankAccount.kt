class BankAccount (_accountNumber : String, _balance : Double) {
    val accountNumber = _accountNumber
    private var balance = _balance

    fun getBalance () : Double {
        return balance
    }

    fun withdraw (amount : Double) {
        if (amount <= balance) balance -= amount
    }

    fun deposit (amount : Double) {
        if (amount > 0) balance += amount

    }

}