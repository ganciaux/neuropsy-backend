package com.ganciaux.neuropsy.services;

import com.ganciaux.neuropsy.dto.ClientDTO;
import com.ganciaux.neuropsy.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Integer save(ClientDTO client);

    List<ClientDTO> findAll();

    Optional<ClientDTO> findById(Integer id);

    void delete(Integer id);
}
