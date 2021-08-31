abstract class DepositableBankAccount(_accountNumber: String, _balance: Double) : BankAccount(_accountNumber, _balance), Depositable {
    override fun deposit(amount: Double) {
        TODO("Not yet implemented")
    }
}