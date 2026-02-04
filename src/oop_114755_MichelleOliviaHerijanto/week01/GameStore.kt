package oop_114755_MichelleOliviaHerijanto.week01

fun main(){
    val gameTitle: String = "Roblox"
    val price : Int = 1000000
    val newPrice = calculateDiscount(price).toInt()

    //tes hasil
println( newPrice )
}
fun calculateDiscount (price: Int) =
    if (price > 500000)  0.8 * price
    else 0.9 * price
