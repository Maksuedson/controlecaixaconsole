package br.com.mercadosrocambole.controlecaixa.model;

/**
 * Classe que representa um produto
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class Produto {

    private final String id;
    private final Integer valorUnitario;
    private final Promocao campanhaPromocional;

    public Produto(String id, Integer valorUnitario, Promocao campanhaPromocional) {
        this.id = id;
        this.valorUnitario = valorUnitario;
        this.campanhaPromocional = campanhaPromocional;
    }

    public String getId() {
        return id;
    }

    public Integer getValorUnitario() {
        return valorUnitario;
    }

    public Integer getValorDesconto(Integer quantidadeVendida) {
        return campanhaPromocional != null ? campanhaPromocional.calculaDesconto(this, quantidadeVendida) : 0;
    }
}
