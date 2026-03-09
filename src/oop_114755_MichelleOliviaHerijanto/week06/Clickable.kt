package oop_114755_MichelleOliviaHerijanto.week06

interface Clickable {
//Error: Property in an interface cannot have a backing field
val name: String = "Tombol Rahasia"
// Function without body (Implicitly Abstract)
fun click()
}
