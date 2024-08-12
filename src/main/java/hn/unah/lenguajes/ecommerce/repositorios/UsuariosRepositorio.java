package hn.unah.lenguajes.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.ecommerce.modelos.Usuarios;


@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuarios, Long> {

    public boolean existsBycorreoElectronico(String correoElectronico);

    public boolean existsBynombre(String nombre);

    public boolean existsBycontrasenia(String contrasenia);

    public Usuarios findBynombre(String nombre);

}
