package week03

fun main(){
    val e = Employee("Budi")

    //tes validasi salary
    e.salary = -1000 //harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. Test Encapsulation
    e.increasePerformance()
    //e.performanceRating = 5

    //3.Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}