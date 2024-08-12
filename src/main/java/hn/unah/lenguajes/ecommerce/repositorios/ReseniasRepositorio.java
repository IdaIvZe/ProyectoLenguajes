package hn.unah.lenguajes.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.ecommerce.modelos.Resenias;


@Repository
public interface ReseniasRepositorio extends JpaRepository<Resenias, Long> {

}
