package hn.unah.lenguajes.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ecommerce.modelos.Lugares;
import hn.unah.lenguajes.ecommerce.servicios.LugaresServicio;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api")
public class LugaresController {

    @Autowired
    private LugaresServicio lugaresSericios;

    @Operation(summary = "Validar que una direccion de un mismo lugar no este ya registrado en la BBDD")
    @PostMapping("/validar")
    public Lugares existeEnLaBBDD(@RequestBody Lugares nvolugar) {

        if (this.lugaresSericios.validarExistenciaPorPaisYDepto(nvolugar.getNombrePais(), nvolugar.getDepartamento(),
                nvolugar.getCodigoPostal())) {

        }

        return null;
    }

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN PRUEBAS ///////////////////
    //////////////////////////////////////////////////////////////

}
