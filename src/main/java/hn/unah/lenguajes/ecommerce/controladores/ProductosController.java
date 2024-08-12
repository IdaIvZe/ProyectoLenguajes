package hn.unah.lenguajes.ecommerce.controladores;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ecommerce.modelos.Productos;
import hn.unah.lenguajes.ecommerce.servicios.ProductosServicio;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api/productos")
public class ProductosController {

    @Autowired
    private ProductosServicio productosServicios;

    // Metodo para crear solo el producto
    @Operation(summary = "Crear nuevo producto")
    @PostMapping("/crear/nvo")
    public Productos nuevoProducto(@RequestBody Productos nuevoProducto) {
        return this.productosServicios.crearNuevoProducto(nuevoProducto);
    }

    // Metodo para crear producto con su categoria asociada
    @Operation(summary = "Crear nuevo producto asociandole la categoria")
    @PostMapping("/crear/nvoCompleto")
    public Productos crearNuevoProductoConCategoria(@RequestBody Productos nvoProducto) {
        return this.productosServicios.crearNuevoProductoConCategoria(nvoProducto);

    }

    // Metodo para obtener un producto por id
    @Operation(summary = "Obtener un producto especifico por el ID")
    @GetMapping("/mostrar/{codigoproducto}")
    private Productos obtenerProductos(@PathVariable(name = "codigoproducto") long codigoproducto) {
        // borre el optinonal<>
        return this.productosServicios.obtenerProductos(codigoproducto);
    }

    // Metodo para obtener todos los productos por una misma categoria
    @Operation(summary = "Filtrar todos los produtos de una mismacategoria")
    @GetMapping("/mostrar/porCategoria/{codigocategoria}")
    public List<Productos> mostrarPorCategorias(@PathVariable(value = "codigocategoria") long codigocategoria) {
        return this.productosServicios.mostrarProductosDeMismaCategoria(codigocategoria);
    }
}
