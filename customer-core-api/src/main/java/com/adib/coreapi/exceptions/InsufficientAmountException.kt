package com.adib.coreapi.exceptions

data class InsufficientAmountException(
    override var message : String
):RuntimeException(message)
