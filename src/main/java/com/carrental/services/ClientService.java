package com.carrental.services;

import com.carrental.models.Client;
import com.carrental.dao.ClientDao;

import java.util.List;

public class ClientService {
    private ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public Client findClientById(int id) {
        return clientDao.findById(id);
    }

    public List<Client> findAllClients() {
        return clientDao.findAll();
    }

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deleteClient(int id) {
        clientDao.delete(id);
    }
}
