package oop_114755_MichelleOliviaHerijanto.week03

fun main(){

    val weapon = Weapon(name = "AK47")
    weapon.damage = -50
    weapon.damage = 9999
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

    val player = Player(username = "Michael")
    //println(player.xp) //causes error

    player.addXp(50)
    player.addXp(60)

}