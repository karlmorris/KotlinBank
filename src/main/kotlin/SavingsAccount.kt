import base.DepositableBankAccount

class SavingsAccount(_accountNumber: String, _balance: Double) : DepositableBankAccount(_accountNumber, _balance) {
    val withdrawalLimit = 6
    var withdrawalCounter = 0

    override fun withdraw(amount: Double) {
        if (withdrawalCounter < withdrawalLimit) {
            super.withdraw(amount)
            withdrawalCounter++
        }
    }

}