package oop_114755_MichelleOliviaHerijanto.week7

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Monster ${event.monsterName} is attacking you")
        }

        is BattleState.LootDropped -> {
            println("You got ${event.item.name} (Rarity: ${event.item.rarity})")
        }

        is BattleState.GameOver -> {
            println(" ${event.reason} hahaha, GAME OVER!!!")
        }

        BattleState.SafeZone -> {
            println("Yepeee, you are in safezone !!! ")
        }
    }
}
