package oop_114755_MichelleOliviaHerijanto.week7

fun main () {
    println("=== TEST SINGLETOON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n === TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}