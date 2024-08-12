package hn.unah.lenguajes.ecommerce.servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ecommerce.modelos.Categorias;
import hn.unah.lenguajes.ecommerce.modelos.Productos;
import hn.unah.lenguajes.ecommerce.repositorios.CategoriasRepositorio;
import hn.unah.lenguajes.ecommerce.repositorios.ProductosRepositorio;



@Service
public class ProductosServicio {

    @Autowired
    private ProductosRepositorio productosRepositorios;

    @Autowired
    private CategoriasRepositorio categoriasRepositorios;

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN CONSTRUCCION ///////////////////
    //////////////////////////////////////////////////////////////

    // Metodo para crear productos
    public Productos crearNuevoProducto(Productos nvoProducto) {
        return this.productosRepositorios.save(nvoProducto);
    }

    // Metodo para crear un nuevo producto con su objeto categoria
    public Productos crearNuevoProductoConCategoria(Productos nvoProducto) {

        Categorias categoriaAsociada = nvoProducto.getCategorias();
        if (categoriaAsociada != null) {
            categoriaAsociada.setNombreCategoria(nvoProducto.getCategorias().getNombreCategoria());
            this.categoriasRepositorios.save(categoriaAsociada);
        }

        return this.productosRepositorios.save(nvoProducto);
    }

    // Metodo para obtener un producto por id
    public Productos obtenerProductos(long codigoproducto) {
        // borre el optional<>
        return this.productosRepositorios.findById(codigoproducto).get();
    }

    // Metodo para mostrar todos los productos que pertencen a una misma categoria
    public List<Productos> mostrarProductosDeMismaCategoria(long codigocategoria) {

        return this.productosRepositorios.findByCategoriasCodigoCategoria(codigocategoria);
    }
}
