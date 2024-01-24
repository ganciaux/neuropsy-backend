package com.ganciaux.neuropsy.controllers;

import com.ganciaux.neuropsy.models.Client;
import com.ganciaux.neuropsy.repositories.ClientRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    private Client newClient(@RequestBody Client client){
        return this.repository.save(client);
    }

    @GetMapping
    List<Client> getClients(){
        return repository.findAll();
    }

    @GetMapping("/{firstname}")
    List<Client> getClientsByFirstname(@PathVariable("firstname") String firstname){
        return repository.findAllByFirstname(firstname);
    }

    @GetMapping("/search/{firstname}")
    List<Client> searchClientsByFirstname(@PathVariable("firstname") String firstname){
        return repository.searchByFirstname(firstname);
    }

    @GetMapping("/search-contains/{firstname}")
    List<Client> searchClientsByFirstnameContaining(@PathVariable("firstname") String firstname){
        return repository.searchByFirstnameContaining(firstname);
    }

    @GetMapping("/search-native/{firstname}")
    Client searchClientNative(@PathVariable("firstname") String firstname){
        return repository.searchClientNative(firstname);
    }

    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Optional<Client> updateTodo(@PathVariable("id") Integer id, @RequestBody Client updated){
        return repository.findById(id)
                .map(current -> repository.save(updated));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}
