package oop_114755_MichelleOliviaHerijanto.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- LIBRARY SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Peminjaman (dalam hari): ")
    var loanDuration = scanner.nextInt()

    if ( loanDuration < 0){
        loanDuration = 1
    }

    var loan = Loan(bookTitle, borrower, loanDuration)
    var denda = loan.calculateFine(loanDuration)

    println("--- Detail Peminjaman ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Durasi Peminjaman: ${loan.loanDuration} hari")
    println("Total Denda: ${denda}")

}