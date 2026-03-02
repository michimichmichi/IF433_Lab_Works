package oop_114755_MichelleOliviaHerijanto.week5

class EWallet (accountName: String, var balance: Double): PaymentMethod (accountName){
    override fun processPayment(amount: Double) {
        if(balance < amount){
            println("Saldo tidak cukup.")
        }else{
            balance = balance - amount
            println("Sukses")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}

