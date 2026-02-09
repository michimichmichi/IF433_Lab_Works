package oop_114755_MichelleOliviaHerijanto.week02

class Loan (val bookTitle : String , var borrower : String, var loanDuration: Int = 1) {
    fun calculateFine () : Int{
       return if (loanDuration > 3){
           (loanDuration - 3) * 2000
       }else {
           0
       }
    }
}



