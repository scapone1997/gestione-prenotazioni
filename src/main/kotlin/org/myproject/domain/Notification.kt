package org.myproject.domain

import io.quarkus.mongodb.panache.common.MongoEntity
import org.bson.types.ObjectId
import java.time.LocalDateTime

@MongoEntity(collection = "notifications")
data class Notification(
    var userId: String,
    var bookingId: String?,
    var message: String,
    var type: String, // booking_confirmation, flight_change, cancellation
    var sentDate: LocalDateTime,
    var status: String // sent, pending, failed
) {
    var id: ObjectId? = null // Automatically generated by MongoDB
}