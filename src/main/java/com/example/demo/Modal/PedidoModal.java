package com.example.demo.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class PedidoModal {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String cpf;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
}
