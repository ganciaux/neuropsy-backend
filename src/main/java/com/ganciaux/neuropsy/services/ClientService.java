package com.ganciaux.neuropsy.services;

import com.ganciaux.neuropsy.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Integer save(Client client);

    List<Client> findAll();

    Optional<Client> findById(Integer id);

    void delete(Integer id);
}
