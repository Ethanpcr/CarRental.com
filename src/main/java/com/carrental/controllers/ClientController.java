package com.carrental.controllers;

import com.carrental.models.Client;
import com.carrental.services.ClientService;

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public void addClient(Client client) {
        clientService.saveClient(client);
    }

    public void updateClient(int clientId, Client client) {
        clientService.updateClient(clientId, client);
    }

    public Client getClient(int clientId) {
        return clientService.findClientById(clientId);
    }

    public void deleteClient(int clientId) {
        clientService.deleteClient(clientId);
    }
}
