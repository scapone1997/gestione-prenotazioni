package org.myproject.domain

import io.quarkus.mongodb.panache.common.MongoEntity
import org.bson.types.ObjectId

@MongoEntity(collection = "luggage")
data class Luggage(
    var bookingId: String,
    var passengerId: String,
    var type: String, // checked, carry_on
    var weight: Double,
    var dimensions: Dimensions
) {
    var id: ObjectId? = null // Automatically generated by MongoDB

    data class Dimensions(
        var length: Int,
        var width: Int,
        var height: Int
    )
}