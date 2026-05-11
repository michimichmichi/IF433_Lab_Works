package oop_114755_MichelleOliviaHerijanto.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean) : Int {
    require(requestedGram > 0) {
       "Porsi kibble harus lebih dari 0 gr"
    }
    if(isJammed){
        throw DispenserJamException()
    }
    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50

        try{
            dispenseKibble(80, currentKibbleStock, false)
        }catch (e: DispenserJamException){
            println("Dispense Error: ${e.message}")
        }catch (e: FoodEmptyException){
            println("Food Error: ${e.message}")
        }catch (e: Exception){
            println("General Error occured")
        }
    finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}