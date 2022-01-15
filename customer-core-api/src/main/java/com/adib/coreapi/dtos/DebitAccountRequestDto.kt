package com.adib.coreapi.dtos

data class DebitAccountRequestDto(
    var accountId : String,
    var balance : Double,
    var currency: String
)
