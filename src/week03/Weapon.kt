package week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: tidak boleh negatif")
            } else if (value > 1000) {
                field = 1000
            } else
                field = value
        }

    val tier: String
        get() {
            if (damage > 800) {
                return "Legendary"

            } else if (damage > 500) {
                return "Epic"

            } else
                return "Common"
        }
}