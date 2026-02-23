package oop_114755_MichelleOliviaHerijanto.week03

class Player ( var username: String){
    private var xp: Int = 0
    val level : Int
        get() = (xp/ 100) + 1

    fun addXp (amount: Int){
        var currentlevel = level
            if (amount <= 0){
                println("ERROR ")
                return

            } else {
                xp += amount
                println(" Current level is $level")

        }
        var newlevel = level

        if(newlevel > currentlevel){
            println("Level Up! Selamat $username naik ke level $level")
        }

    }



}