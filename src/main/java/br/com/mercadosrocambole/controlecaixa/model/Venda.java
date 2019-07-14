package br.com.mercadosrocambole.controlecaixa.model;

import br.com.mercadosrocambole.controlecaixa.dao.ProdutoDAO;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa uma venda.
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class Venda {

    private Integer idVenda;
    private final Calendar data;
    private final Map<String, Integer> produtos;

    public Venda() {
        this.data = new GregorianCalendar();
        this.produtos = new HashMap<>();
    }

    public void adicionaProduto(String id) {
        int quantidade = !produtos.containsKey(id) ? 1 : (produtos.get(id) + 1);
        produtos.put(id, quantidade);
    }

    public void removerProduto(String id) {
        int quantidade = produtos.get(id) - 1;
        if (quantidade == 0) {
            produtos.remove(id);
        } else {
            produtos.put(id, quantidade);
        }
    }

    public Integer obterPrecoTotal() {
        int precoTotal = 0;
        ProdutoDAO produtoDAO = new ProdutoDAO();
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            String id = entry.getKey();
            int quantidadeVendida = entry.getValue();
            Produto produto = produtoDAO.buscaPor(id);
            precoTotal += (produto.getValorUnitario() * quantidadeVendida) - produto.getValorDesconto(quantidadeVendida);
        }
        return precoTotal;
    }

    public Integer obterDescontoTotal() {
        int descontoTotal = 0;
        ProdutoDAO produtoDAO = new ProdutoDAO();
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            String id = entry.getKey();
            int quantidadeVendida = entry.getValue();
            Produto produto = produtoDAO.buscaPor(id);
            descontoTotal += produto.getValorDesconto(quantidadeVendida);
        }
        return descontoTotal;
    }
}
