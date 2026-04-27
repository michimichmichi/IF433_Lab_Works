package oop_114755_MichelleOliviaHerijanto.week10

class MathBox<T:Number>(var value1:T, val value2: T) {
    fun sum():Double {
        return value1.toDouble() + value2.toDouble()
    }
}