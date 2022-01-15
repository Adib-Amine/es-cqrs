package com.adib.coreapi.exceptions

data class NegativeBalanceException(
    override var message : String
):RuntimeException(message)