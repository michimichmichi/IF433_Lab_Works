package oop_114755_MichelleOliviaHerijanto.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",10,12.5, "OPEN" )
        ,TradeLog("ETHUSDT", "SHORT", 5, -3.2, "OPEN" )
        ,TradeLog("BNBUSDT", "LONG", 20, 25.0, "CLOSED" )
        ,TradeLog("SQLUSDT", "SHORT", 15, -10.8, "CLOSED" )
        ,TradeLog("XRPUSDT", "LONG", 3, 5.6, "OPEN" )
        ,TradeLog("ADAUSDT", "SHORT", 8, -2.4, "CLOSED" )
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0}
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map{
            "LOST [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory.map {it.pair}.toSet()


}