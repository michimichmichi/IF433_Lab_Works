package oop_114755_MichelleOliviaHerijanto.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001",  0.1))
    txRepo.add(Transaction("TX002",  1.5))
    txRepo.add(Transaction("TX003",  500.0))

    println("\n=== Transactions ===")

    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id},  Amount: ${tx.amount}")
    }

    val result = coinRepo.findByName("BTC") { it.name }

    println("\n=== Search Coin BTC ===")
    result.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }
}
