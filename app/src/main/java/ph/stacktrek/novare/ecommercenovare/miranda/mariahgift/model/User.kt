package ph.stacktrek.novare.ecommercenovare.miranda.mariahgift.model

import java.time.LocalDate
import java.time.LocalDateTime

open class User(val username: String, val password: String)  {
    lateinit var email: String
        private set
    lateinit var mobileNumber: String
        private set
    lateinit var userID: String
        private set
    lateinit var accountCreated: LocalDate
        private set
    lateinit var lastLogin: LocalDateTime

    constructor(): this("", "")

    init {
        println("init called")
    }
}

class ShopOwner() : User() {
    lateinit var shopName: String
        private set

    lateinit var rating: ArrayList<String>

}

class Buyer() : User() {
    lateinit var cart: ArrayList<String>
}