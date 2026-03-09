package oop_114755_MichelleOliviaHerijanto.week06

class SmartCCTV : SmartDevice, Switchable, Recordable {

    override var name = "Mi CCTV"
    override var id = "MI1020"
    override fun startRecord() {
        println("$name is recording")
    }
    override fun turnOn() {
        println("Turning on $name")
        startRecord()
    }
    override fun turnOff() {
        println("Turning off $name")
    }

}