package com.adib.commandservice.services;

import com.adib.coreapi.commands.AccountCreateCommand;
import com.adib.coreapi.commands.AccountCreditCommand;
import com.adib.coreapi.commands.AccountDebitCommand;
import com.adib.coreapi.dtos.CreateAccountRequestDto;
import com.adib.coreapi.dtos.CreditAccountRequestDto;
import com.adib.coreapi.dtos.DebitAccountRequestDto;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class CommandServiceImpl implements CommandService{
    private CommandGateway commandGateway;

    public CommandServiceImpl(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @Override
    public CompletableFuture<String> createAccount(CreateAccountRequestDto accountRequestDTO) {
        CompletableFuture<String> response = commandGateway.send(new AccountCreateCommand(
                UUID.randomUUID().toString(),
                accountRequestDTO.getCurrency(),
                accountRequestDTO.getInitialBalance()
        ));
        return response;
    }

    @Override
    public CompletableFuture<String> debitAccount(DebitAccountRequestDto debitAccountRequestDTO) {
        CompletableFuture<String> response = commandGateway.send(new AccountDebitCommand(
                debitAccountRequestDTO.getAccountId(),
                debitAccountRequestDTO.getCurrency(),
                debitAccountRequestDTO.getBalance()
        ));
        return response;
    }

    @Override
    public CompletableFuture<String> creditAccount(CreditAccountRequestDto creditAccountRequestDTO) {

        CompletableFuture<String> response = commandGateway.send(new AccountCreditCommand(
                creditAccountRequestDTO.getAccountId(),
                creditAccountRequestDTO.getCurrency(),
                creditAccountRequestDTO.getBalance()
        ));
        return response;
    }
}
