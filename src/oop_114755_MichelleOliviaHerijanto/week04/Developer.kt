package oop_114755_MichelleOliviaHerijanto.week04

open class Developer (name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }

}