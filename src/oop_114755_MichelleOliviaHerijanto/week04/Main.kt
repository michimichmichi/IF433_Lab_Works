package oop_114755_MichelleOliviaHerijanto.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberofDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar(brand = "Hyundai", numberofDoors = 4, batteryCapacity = 50)
    electricCar.openTrunk()
    electricCar.accelerate()
    electricCar.honk()
}


