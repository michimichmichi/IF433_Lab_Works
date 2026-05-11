package oop_114755_MichelleOliviaHerijanto.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, $balance: $balance")

