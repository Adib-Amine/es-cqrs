package com.adib.commandservice.services;

import com.adib.coreapi.dtos.CreateAccountRequestDto;
import com.adib.coreapi.dtos.CreditAccountRequestDto;
import com.adib.coreapi.dtos.DebitAccountRequestDto;

import java.util.concurrent.CompletableFuture;

public interface CommandService {
        CompletableFuture<String> createAccount(CreateAccountRequestDto accountRequestDTO);
        CompletableFuture<String> debitAccount(DebitAccountRequestDto debitAccountRequestDTO);
        CompletableFuture<String> creditAccount(CreditAccountRequestDto creditAccountRequestDTO);

}
