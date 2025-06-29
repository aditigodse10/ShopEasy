package com.example.shopeasy.Domain

import java.io.Serializable

data class StoreModel(
    var Id: Int = 0,
    var CategoryId: String = "",
    var Title: String = "",
    var Latitude: Double = 0.0,
    var Longitude: Double = 0.0,
    var Call: String = "",
    var Address: String = "",
    var Activity: String = "",
    var ShortAddress: String = "",
    var Hours: String = "",
    var ImagePath: String = ""

) : Serializable
