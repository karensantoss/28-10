

package br.com.model.persistencia.jpa;

import br.com.model.Categoria;
import br.com.model.persistencia.dao.CategoriaDAO;
import java.util.List;


public class CategoriaDAOJPA  extends DAOJPA <Categoria, Integer> implements CategoriaDAO {
    
    public List<Categoria> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Categoria x where x.nome like '%" + Nome + "%'").getResultList();

    }
    
}
