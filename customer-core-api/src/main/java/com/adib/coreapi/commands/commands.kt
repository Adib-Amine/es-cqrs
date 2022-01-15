package com.adib.coreapi.commands

abstract class BaseCommand<T>(
        open val id : T
)

data class AccountCreateCommand(
        override val id : String,
        val currency : String,
        val initialBalance : Double

): BaseCommand<String>(id);

data class AccountCreditCommand(
        override val id : String,
        val currency : String,
        val balance : Double
): BaseCommand<String>(id);

data class AccountDebitCommand(
        override val id : String,
        val currency : String,
        val balance : Double,
): BaseCommand<String>(id);