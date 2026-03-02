package oop_114755_MichelleOliviaHerijanto.week5

abstract class PaymentMethod (val accountName: String){

    abstract fun processPayment(amount: Double)
}

