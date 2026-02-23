package oop_114755_MichelleOliviaHerijanto.week04

open class ElectricCar (brand:String, numberofDoors: Int, var batteryCapacity: Int): Car(brand, numberofDoors) {

   final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas Baterai: $batteryCapacity% ")
    }
}