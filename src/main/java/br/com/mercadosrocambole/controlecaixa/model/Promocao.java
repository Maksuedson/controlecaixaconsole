package br.com.mercadosrocambole.controlecaixa.model;

/**
 * Interface que deve ser implementada por toda classe que representa uma
 * promoção.
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public interface Promocao {

    /**
     * Método que deve ser implementado por toda classe que represente uma
     * promoção.
     *
     * @param produto
     * {@link br.com.mercadosrocambole.controlecaixa.model.Produto Produto}
     * @param quantidadeNaListaDeCompra quantidade de um mesmo produto inserido
     * na lista de compras
     * @return {@link Integer} - valor em centavos dos descontos promocionais do
     * produto
     */
    Integer calculaDesconto(Produto produto, Integer quantidadeNaListaDeCompra);
}
