package oop_114755_MichelleOliviaHerijanto.week10

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(nama: String, selector: (T) -> String): List<T> {
        return items.filter { selector(it) == nama }
    }
}