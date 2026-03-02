package oop_114755_MichelleOliviaHerijanto.week5

fun main(){
    val eWal = EWallet("michelle", 50000.00)
    val CC = CreditCard("Michelle", 100000.00)

    val daftarPaymentMethod : List<PaymentMethod> = listOf(eWal, CC)
    for (payment in daftarPaymentMethod){
        payment.processPayment(75000.0)

    }
}
