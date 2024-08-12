package hn.unah.lenguajes.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.ecommerce.modelos.Lugares;



@Repository
public interface LugaresRepositorio extends JpaRepository<Lugares, Long> {

    public boolean existsBynombrePais(String nombrePais);

    public boolean existsBydepartamento(String departamento);

    public boolean existsBycodigoPostal(String codigoPostal);

    public Lugares findBynombrePais(String nombrePais);

    public Lugares findBydepartamento(String departamento);

}
