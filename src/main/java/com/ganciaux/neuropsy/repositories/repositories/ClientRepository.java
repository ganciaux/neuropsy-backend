package com.ganciaux.neuropsy.repositories.repositories;

import com.ganciaux.neuropsy.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findAllByFirstname(String firstname);

    @Query("from Client where firstname = :fn")
    List<Client> searchByFirstname(@Param("fn") String firstname);

    @Query("from Client where firstname = '%:fn%'")
    List<Client> searchByFirstnameContaining(@Param("fn") String firstname);

    @Query(value="select * from client where firstname = :firstname", nativeQuery=true)
    Client searchClientNative(String firstname);
}
