package br.com.mercadosrocambole.controlecaixa.model;

/**
 * Classe responsável por implementar promoção do tipo 'Leve 3 pague 2'.
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class LeveXPaguePorY implements Promocao {

    private final Integer quantidadeDeProdutosParaEntrarNessaPromocao;
    private final Integer quantidadeDeProdutosQueIraPagar;

    public LeveXPaguePorY(Integer quantidadeDeProdutosParaEntrarNessaPromocao, Integer quantidadeDeProdutosQueIraPagar) {
        this.quantidadeDeProdutosParaEntrarNessaPromocao = quantidadeDeProdutosParaEntrarNessaPromocao;
        this.quantidadeDeProdutosQueIraPagar = quantidadeDeProdutosQueIraPagar;
    }

    @Override
    public Integer calculaDesconto(Produto produto, Integer quantidadeNaListaDeCompra) {
        int multiplicador = quantidadeNaListaDeCompra / quantidadeDeProdutosParaEntrarNessaPromocao;
        return multiplicador * ((quantidadeDeProdutosParaEntrarNessaPromocao * produto.getValorUnitario()) - (quantidadeDeProdutosQueIraPagar * produto.getValorUnitario()));
    }
}
