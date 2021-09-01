package base

import Depositable

abstract class DepositableBankAccount(_accountNumber: String, _balance: Double) : BankAccount(_accountNumber, _balance),
    Depositable {
     override fun deposit(amount: Double) {
        super.deposit(amount)
    }
}