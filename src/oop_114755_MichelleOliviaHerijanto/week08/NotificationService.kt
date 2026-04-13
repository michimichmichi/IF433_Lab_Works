package oop_114755_MichelleOliviaHerijanto.week08

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){

        //sendEmail(user.email)//ERROR

        if(user.email != null){
            sendEmail(user.email)
        }else{
            println("User ${user.name} tidak memiliki email.")
        }
    }

}