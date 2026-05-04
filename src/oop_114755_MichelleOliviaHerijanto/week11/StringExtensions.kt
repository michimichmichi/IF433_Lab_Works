package oop_114755_MichelleOliviaHerijanto.week11

fun String.addGreeting() : String {
    return "Hello $this"
}

fun String.repeatTimes(n: Int) : String {
    return this.repeat(n)
}