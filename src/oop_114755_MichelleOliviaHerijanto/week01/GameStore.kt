package oop_114755_MichelleOliviaHerijanto.week01

fun main(){
    val gameTitle: String = "Roblox"
    val price : Int = 1000000
    val newPrice = calculateDiscount(price).toInt()

    printReceipt( title = gameTitle, price = price, finalPrice = newPrice)
}
fun calculateDiscount (price: Int) =
    if (price > 500000)  0.8 * price
    else 0.9 * price

fun printReceipt (title : String, price : Int, finalPrice: Int){
    println(" Title : $title ")
    println(" Price : $price")
    println(" Final Price: $finalPrice")
}

