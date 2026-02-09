package oop_114755_MichelleOliviaHerijanto.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println(" ---WELCOME TO MINI RPG BATTLE--- ")

    print("Masukkan Nama Hero: ")
    var name = scanner.nextLine()
    print("Masukkan Stat Damage: ")
    var baseDamage = scanner.nextInt()

    var hero = Hero(name, baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0){
        println("-- Pick Your Move --")
        println(" 1. Serang ")
        println(" 2. Kabur ")

        print("Action: ")
        var input = scanner.nextInt()

        if(input == 1 ){
            enemyHp -= baseDamage
            hero.attack("Enemy")
            if (enemyHp < 0) enemyHp = 0
            println("Enemy HP: ${enemyHp}")
            if(enemyHp > 0 ) hero.takeDamage((10..20).random())
            println("Hero HP: ${hero.hp}")
        }else if(input == 2 ){
            println("Hero runs away !!")
            break
        }
    }

    if(hero.hp > enemyHp){
        println("${hero.name} wins the battle !!")
    }else {
        println("Enemy wins the battle !!")
    }



}
