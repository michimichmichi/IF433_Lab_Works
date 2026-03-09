package oop_114755_MichelleOliviaHerijanto.week06

class SmartSpeaker : SmartDevice, Switchable {
    override var id = "JBL1020"
    override var name = "JBL HOME"

    override fun turnOff() {
        println("Turning off $name speaker...")
    }

    override fun turnOn() {
        println("Turning on $name speaker...")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}