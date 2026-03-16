package oop_114755_MichelleOliviaHerijanto.week7

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame() {
        when (isGameRunning) {
            true -> println("Game sudah Berjalan! Mencegah instansiasi ganda.")
            false -> {
                isGameRunning = true
                println("Memulai Game Engine")
            }

        }
    }
}