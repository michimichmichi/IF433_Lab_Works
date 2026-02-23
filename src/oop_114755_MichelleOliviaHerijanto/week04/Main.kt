import oop_114755_MichelleOliviaHerijanto.week04.Car
import oop_114755_MichelleOliviaHerijanto.week04.Vehicle

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberofDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}