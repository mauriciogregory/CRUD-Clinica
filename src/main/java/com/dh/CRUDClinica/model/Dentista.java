package com.dh.CRUDClinica.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dentista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numMatricula;
    private int atendeConvenio;
    private String nome;
    private  String email;

    public Dentista() {}

    public Dentista(int id, int numMatricula, int atendeConvenio, String nome, String email) {
        this.id = id;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
        this.nome = nome;
        this.email = email;
    }

    public Dentista(int numMatricula, int atendeConvenio, String nome, String email) {
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getAtendeConvenio() {
        return atendeConvenio;
    }

    public void setAtendeConvenio(int atendeConvenio) {
        this.atendeConvenio = atendeConvenio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", numMatricula=" + numMatricula +
                ", atendeConvenio=" + atendeConvenio +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
