package week03

fun main(){

    val weapon = Weapon(name = "AK47")
    weapon.damage = -50
    weapon.damage = 9999
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}