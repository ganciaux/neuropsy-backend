package com.ganciaux.neuropsy.dto;

import com.ganciaux.neuropsy.models.Client;
import com.ganciaux.neuropsy.models.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@Builder
public class ClientDTO {
    private Integer id;

    private String name;

    private String firstname;

    private LocalDate birthDate;

    private String phone;

    private String gsm;

    private String email;

    private String address;

    private String city;

    private String country;

    private String zip;

    public static ClientDTO fromEntity(Client client) {
        // null check
        return ClientDTO.builder()
                .id(client.getId())
                .firstname(client.getFirstname())
                .name(client.getName())
                .email(client.getEmail())
                .birthDate(client.getBirthDate())
                .phone(client.getPhone())
                .gsm(client.getGsm())
                .address(client.getAddress())
                .city(client.getCity())
                .country(String.valueOf((client.getCountry())))
                .zip(client.getZip())
                .build();
    }

    public static Client toEntity(ClientDTO clientDto) {
        // null check
        return Client.builder()
                .id(clientDto.getId())
                .firstname(clientDto.getFirstname())
                .name(clientDto.getName())
                .email(clientDto.getEmail())
                .birthDate(clientDto.getBirthDate())
                .phone(clientDto.getPhone())
                .gsm(clientDto.getGsm())
                .address(clientDto.getAddress())
                .city(clientDto.getCity())
                .country(Country.valueOf((clientDto.getCountry())))
                .zip(clientDto.getZip())
                .build();
    }
}
