package hn.unah.lenguajes.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ecommerce.repositorios.ProductosRepositorio;
import hn.unah.lenguajes.ecommerce.repositorios.ReseniasRepositorio;


@Service
public class ReseniasServicio {

    @Autowired
    private ReseniasRepositorio reseniasRepositorios;

    @Autowired
    private ProductosRepositorio productosRepositorios;

    /*
     * //se planea hacer un metodo que crea un a resenai y lo asocie con un codigo
     * perfil de usuairo
     * public resenias nuevaResenias(resenias nvaResenia, long codigoproducto) {
     * 
     * resenias localResenia = this.nvaResenia.getCodigoResenia().get();
     * productos produtolocal =
     * this.productoRepositorios.findById(codigoproducito).get();
     * 
     * if (nvaResenia != null) {
     * 
     * 
     * localResenia.setComentario(nvaResenia.getComentario());
     * 
     * }
     * }
     * 
     * 
     * // metodo para crear una reseña asociada a un producto
     */
}
