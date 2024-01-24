package com.ganciaux.neuropsy.services.Impl;

import com.ganciaux.neuropsy.models.Client;
import com.ganciaux.neuropsy.repositories.ClientRepository;
import com.ganciaux.neuropsy.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Integer save(Client client) {
        Client savedClient = clientRepository.save(client);
        return savedClient.getId();
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
