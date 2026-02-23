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

    println("---- MANAGER ----")
    val manager = Manager (name = "Budi", baseSalary = 1000000)
    manager.work()
    manager.calculateBonus()
    println("Bonus Manager ${manager.name}: ${manager.calculateBonus()}")


    println("---- DEVELOPER ---")
    val developer = Developer(name = "Susi", baseSalary = 500000, programmingLanguage = "PHP")
    developer.work()
    developer.calculateBonus()
    println("Bonus Manager ${developer.name}: ${developer.calculateBonus()}")




}


