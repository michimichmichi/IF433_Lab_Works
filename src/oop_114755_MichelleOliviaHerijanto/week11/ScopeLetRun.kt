package oop_114755_MichelleOliviaHerijanto.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val namelength = name?.let { //kuganti nama kak krn error trs
        println("Nama Terdeteksi: $it")
        it.length }

    println("Panjang nama: $namelength")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result" )
}