package com.adib.coreapi.dtos

data class CreditAccountRequestDto(
    var accountId : String,
    var balance : Double,
    var currency: String
)
