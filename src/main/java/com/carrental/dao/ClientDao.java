package com.carrental.dao;

import com.carrental.models.Client;
import java.util.List;

public interface ClientDao {
    Client findById(int id);
    List<Client> findAll();
    void save(Client client);
    void update(Client client);
    void delete(int clientId);
}
