package oop_114755_MichelleOliviaHerijanto.week7

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}