package hn.unah.lenguajes.ecommerce.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoproducto")
    private long codigoProducto;

    @Column(name = "nombreproducto")
    private String nombreProducto;

    @Column(name = "preciounitario")
    private double precioUnitario;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidaddisponible")
    private Integer cantidadDisponible;

    // relacion enrtre tabla de productos y categorias
    @ManyToOne
    @JoinColumn(name = "codigocategoria", referencedColumnName = "codigocategoria")
    private Categorias categorias;

    // relacion muchos a muchos con tabla intermedia de listaproductosfavoritos
    // entre productos y usuarios
    @JsonIgnore
    @ManyToMany(mappedBy = "listaproductos")
    private List<Usuarios> listausuarios;

    // reliacion de muchos a mcuhos con tabla intermedia reseniasporproductos entre
    // productos y resenias
    @JsonIgnore
    @ManyToMany(mappedBy = "listproductos")
    private List<Resenias> listresenias;

}

