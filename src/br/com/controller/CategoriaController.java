

package br.com.controller;

import br.com.model.Categoria;
import br.com.model.persistencia.dao.CategoriaDAO;
import br.com.model.persistencia.jpa.CategoriaDAOJPA;
import java.util.List;


public class CategoriaController {

    public Categoria pesquisarCodigo(int codigo) {
        CategoriaDAO dao = new CategoriaDAOJPA();
        return dao.getById(Categoria.class, codigo);
    }

    public Categoria salvar(Categoria a) {
        CategoriaDAO dao = new CategoriaDAOJPA();
        return dao.save(a);
    }
    
    public List<Categoria> ListarCategoria() {
        CategoriaDAO dao = new CategoriaDAOJPA();
        return dao.getAll(Categoria.class);
    }
    
    public boolean remover(int codigo) {
        CategoriaDAO dao = new CategoriaDAOJPA();
        return dao.remove(Categoria.class, codigo);
    }
    
    public List<Categoria> PesquisarCategoriaNome(String Nome) {
        CategoriaDAO dao = new CategoriaDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}
