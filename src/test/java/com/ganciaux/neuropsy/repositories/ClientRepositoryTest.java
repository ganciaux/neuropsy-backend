package com.ganciaux.neuropsy.repositories;

import com.ganciaux.neuropsy.models.Client;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository clientRepository;

    @BeforeEach
    void setup() {
        this.clientRepository.deleteAll();
        this.clientRepository.save(
            new Client()
                .setEmail("toto@user.lu")
                .setFirstname("Toto")
        );
        this.clientRepository.save(
            new Client()
                .setEmail("tata@user.lu")
                .setFirstname("Tata")
        );
        Assertions.assertEquals(2, this.clientRepository.count());
    }

    @AfterEach
    void cleanup() {
        this.clientRepository.deleteAll();
    }

    @Test
    void findAllByFirstname() {
        List<Client> clients = this.clientRepository.findAllByFirstname("Toto");
        Assertions.assertEquals(1, clients.size());
        Assertions.assertEquals("Toto", clients.get(0).getFirstname());
    }

    @Test
    void searchByFirstname() {
    }

    @Test
    void searchByFirstnameContaining() {
    }

    @Test
    void searchClientNative() {
    }
}