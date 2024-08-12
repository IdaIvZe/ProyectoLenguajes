package hn.unah.lenguajes.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.ecommerce.modelos.Favoritos;

@Repository
public interface FavoritosRepositorio extends JpaRepository<Favoritos, Long> {
    
}
