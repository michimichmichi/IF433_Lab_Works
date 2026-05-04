package oop_114755_MichelleOliviaHerijanto.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama Terdeteksi: $it")
        it.length }

    println("Panjang nama: $length")
}