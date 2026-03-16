package oop_114755_MichelleOliviaHerijanto.week7

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()

}