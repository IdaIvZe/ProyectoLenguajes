package hn.unah.lenguajes.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ecommerce.modelos.Lugares;
import hn.unah.lenguajes.ecommerce.repositorios.LugaresRepositorio;

@Service
public class LugaresServicio {

    @Autowired
    private LugaresRepositorio lugaresRepositorios;

    // Crud
    // Metodo para crear un nuevo lugar
    public Lugares crearNuevoLugar(Lugares nvoLugar) {
        return this.lugaresRepositorios.save(nvoLugar);
    }

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN CONSTRUCCION ///////////////////
    //////////////////////////////////////////////////////////////

    // Metodo Para obtener un lugar

    public boolean validarExistenciaPorPaisYDepto(String nombrePais, String departamento, String codigoPostal) {

        if (!this.lugaresRepositorios.existsBynombrePais(nombrePais)
                && !this.lugaresRepositorios.existsBydepartamento(departamento)
                && !this.lugaresRepositorios.existsBycodigoPostal(codigoPostal)) {
            return true;
        }

        return false;
    }
}
