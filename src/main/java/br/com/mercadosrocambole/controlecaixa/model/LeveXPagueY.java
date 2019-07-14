package br.com.mercadosrocambole.controlecaixa.model;

/**
 * Classe responsável por implementar promoção do tipo 'Leve 3 pague R$ 1,30'.
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class LeveXPagueY implements Promocao {

    private final Integer quantidadeDeProdutosParaEntrarNessaPromocao;
    private final Integer valorAPagar;

    public LeveXPagueY(Integer quantidadeDeProdutosParaEntrarNessaPromocao, Integer valorAPagar) {
        this.quantidadeDeProdutosParaEntrarNessaPromocao = quantidadeDeProdutosParaEntrarNessaPromocao;
        this.valorAPagar = valorAPagar;
    }

    @Override
    public Integer calculaDesconto(Produto produto, Integer quantidadeNaListaDeCompra) {
        int multiplicador = quantidadeNaListaDeCompra / quantidadeDeProdutosParaEntrarNessaPromocao;
        return multiplicador * ((quantidadeDeProdutosParaEntrarNessaPromocao * produto.getValorUnitario()) - valorAPagar);
    }
}
