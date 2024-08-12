package hn.unah.lenguajes.ecommerce.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ecommerce.modelos.Categorias;
import hn.unah.lenguajes.ecommerce.repositorios.CategoriasRepositorio;



@Service
public class CategoriasServicio {

    @Autowired
    private CategoriasRepositorio categoriasRepositorios;

    // metodo para obtener todas las cateegorias
    public List<Categorias> obtenerTodasCategorias() {

        return this.categoriasRepositorios.findAll();

    }

}
