package org.myproject.domain

import io.quarkus.mongodb.panache.common.MongoEntity
import org.bson.types.ObjectId
import java.time.LocalDateTime

@MongoEntity(collection = "bookings")
data class Booking(
    var userId: String,
    var flightId: String,
    var bookingDate: LocalDateTime,
    var status: String, // confirmed, pending, canceled
    var totalPrice: Double,
    var passengers: List<PassengerDetails>,
    var paymentStatus: String // completed, pending, failed
) {
    var id: ObjectId? = null // Automatically generated by MongoDB

    data class PassengerDetails(
        var name: String,
        var age: Int,
        var gender: String,
        var passportNumber: String,
        var specialRequests: List<String>? = null
    )
}