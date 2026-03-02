package oop_114755_MichelleOliviaHerijanto.week5

fun main(){

    val calc = MathHelper()

    println("Luas Persegi: ${calc.hitungLuas(10)}")
    println("Luas Persegi Panjang: ${calc.hitungLuas(20, 30)}")
    println("Luas Lingkaran: ${calc.hitungLuas(5.5)}")
}
