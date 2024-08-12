package hn.unah.lenguajes.ecommerce.modelos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "resenias")
@Data
public class Resenias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoresenia")
    private long codigoResenias;

    @Column(name = "comentario")
    private String comentario;

    @CreationTimestamp
    @Column(name = "fechaposteo")
    @JsonProperty("fechaposteo")
    private LocalDateTime fechaPosteo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "reseniasporproductos", joinColumns = @JoinColumn(name = "codigoresenia", referencedColumnName = "codigoresenia"), inverseJoinColumns = @JoinColumn(name = "odigoproducto", referencedColumnName = "codigoproducto"))
    private List<Productos> listproductos;
}
