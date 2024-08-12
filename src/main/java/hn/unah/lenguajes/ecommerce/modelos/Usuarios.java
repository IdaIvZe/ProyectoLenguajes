package hn.unah.lenguajes.ecommerce.modelos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigousuario")
    private long codigoUsuario;

    @JsonProperty("nombre")
    @Column(name = "nombre")
    private String nombre;

    @JsonProperty("apellido")
    @Column(name = "apellido")
    private String apellido;

    @JsonProperty("correo")
    @Column(name = "correo")
    private String correoElectronico;

    @JsonProperty("contrasenia")
    @Column(name = "contrasenia")
    private String contrasenia;

    @CreationTimestamp
    @Column(name = "fecha_creacion")
    @JsonProperty("fecha_creacion")
    private LocalDateTime fechaCreacionCuenta;

    /*
     * CREATE TABLE usuarios (
     * codigoUsuario INT PRIMARY KEY AUTO_INCREMENT,
     * nombre VARCHAR(50),
     * apellido VARCHAR(50),
     * correo VARCHAR(100),
     * contrasenia VARCHAR(50),
     * codigoLugar INT,
     * FOREIGN KEY (codigoLugar) REFERENCES lugares(codigoLugar)
     * );
     */

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // relacion entre la tbla de usuarios ---- lugares

    @ManyToOne
    @JoinColumn(name = "codigolugar", referencedColumnName = "codigolugar")
    private Lugares lugares;

    // relacionar de muchos a muchos como tablas intermedia
    // lista_favoritos_productos_por_usuarios
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "listaproductosfavoritos", joinColumns = @JoinColumn(name = "codigousuario", referencedColumnName = "codigousuario"), inverseJoinColumns = @JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto"))

    private List<Productos> listaproductos;

}
