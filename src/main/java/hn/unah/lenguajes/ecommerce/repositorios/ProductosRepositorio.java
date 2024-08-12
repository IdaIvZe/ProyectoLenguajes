package hn.unah.lenguajes.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.ecommerce.modelos.Productos;

import java.util.List;

@Repository
public interface ProductosRepositorio extends JpaRepository<Productos, Long> {

    List<Productos> findByCategoriasCodigoCategoria(long codigocategoria);

}
