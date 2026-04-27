package oop_114755_MichelleOliviaHerijanto.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box(100)

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}