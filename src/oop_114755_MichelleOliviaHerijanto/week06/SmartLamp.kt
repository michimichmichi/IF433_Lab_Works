package oop_114755_MichelleOliviaHerijanto.week06

class SmartLamp : Switchable, SmartDevice {
    override var name = "Google"
    override var id = "SL1020"

    override fun turnOff() {
        println(" Turning off $name smart lamp...")
    }

    override fun turnOn() {
        println(" Turning on $name smart lamp...")
    }

}