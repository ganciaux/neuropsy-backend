package com.ganciaux.neuropsy.services.Impl;

import com.ganciaux.neuropsy.dto.ClientDTO;
import com.ganciaux.neuropsy.models.Client;
import com.ganciaux.neuropsy.repositories.ClientRepository;
import com.ganciaux.neuropsy.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Integer save(ClientDTO clientDto) {
        Client client=ClientDTO.toEntity(clientDto);
        Client savedClient = clientRepository.save(client);
        return savedClient.getId();
    }

    @Override
    public List<ClientDTO> findAll() {
        return clientRepository.findAll().stream()
                .map(ClientDTO::fromEntity)
                //.map(u -> UserDto.fromEntity(u))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ClientDTO> findById(Integer id) {
        return clientRepository.findById(id)
                .map(ClientDTO::fromEntity);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
