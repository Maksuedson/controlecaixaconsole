package br.com.mercadosrocambole.controlecaixa.dao;

import br.com.mercadosrocambole.controlecaixa.model.Produto;
import java.util.Map;

/**
 * Classe responsável por abstrair acesso ao banco de dados
 *
 * @author MAKSUEDSON / maksuedson@hotmail.com
 */
public class ProdutoDAO {

    /**
     * Método responsável por buscar um produto pelo ID.
     *
     * @param id identificador único do produto.
     * @return {@link br.com.mercadosrocambole.controlecaixa.model.Produto}
     * produto identificado pelo ID informado.
     */
    public Produto buscaPor(String id) {
        Map<String, Produto> db = DataSource.getDatabase();
        return db.get(id);
    }
}
