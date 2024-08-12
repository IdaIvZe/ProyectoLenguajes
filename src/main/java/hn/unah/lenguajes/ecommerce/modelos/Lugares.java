package hn.unah.lenguajes.ecommerce.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lugares")
@Data
public class Lugares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigolugar")
    private long codigoLugar;

    @Column(name = "nombrepais")
    private String nombrePais;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "codigopostal")
    private String codigoPostal;

    //////////////////////////////////////
    @JsonIgnore
    @OneToMany(mappedBy = "lugares", cascade = CascadeType.ALL)
    private List<Usuarios> usuarios;

}

