package com.adib.coreapi.dtos

data class CreateAccountRequestDto(
    var initialBalance : Double,
    var currency: String
)