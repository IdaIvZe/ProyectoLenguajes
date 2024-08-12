package hn.unah.lenguajes.ecommerce.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ecommerce.modelos.Categorias;
import hn.unah.lenguajes.ecommerce.servicios.CategoriasServicio;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasServicio categoriasServicios;

    // metodo para mostrar toda las categorias existentes
    @Operation(summary = "Metodo para obtener todas las categorias")
    @GetMapping("/mostrar/todas")
    public List<Categorias> mostrarTodasCategorias() {

        return this.categoriasServicios.obtenerTodasCategorias();
    }

}
