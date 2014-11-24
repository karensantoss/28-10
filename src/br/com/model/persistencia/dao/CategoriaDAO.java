
package br.com.model.persistencia.dao;

import br.com.model.Categoria;
import java.util.List;


public interface CategoriaDAO extends DAO <Categoria, Integer> {
    
    public List<Categoria>getByNome(String Nome);
    
}
