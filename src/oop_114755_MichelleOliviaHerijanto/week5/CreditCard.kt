package oop_114755_MichelleOliviaHerijanto.week5

class CreditCard( accountName: String, val limit: Double, var usedAmount: Double = 0.0 ) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount+ amount <= limit){
            usedAmount += amount
            println("Sukses.")
        }else if (usedAmount+ amount > limit){
            println("Transaksi ditolak.")
        }

    }
}