package com.boaroli.projetofinal.model;

import com.boaroli.projetofinal.util.AbstractEntityBuilder;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "INTERESSADOS")
public class Interessado implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOME")
    @Size(max = 100)
    private String nome;
    
    @Column(name = "EMAIL")
    @Size(max = 100)
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
    public static class Builder extends AbstractEntityBuilder<Interessado, Interessado.Builder> {
        private Builder(Interessado interessado) {
            super(interessado);
        }

        public static Builder create() {
            return new Builder(new Interessado());
        }

        public Builder nome(String nome) {
            entity.nome = nome;
            return this;
        }

        public Builder email(String email) {
            entity.email = email;
            return this;
        }
    }
}
