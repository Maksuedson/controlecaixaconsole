package br.com.mercadosrocambole.controlecaixa;

import br.com.mercadosrocambole.controlecaixa.model.Venda;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class Teste1 {

    @Test
    public void executa() {
        Venda checkout = new Venda();
        checkout.adicionaProduto("A");
        assertEquals(50, checkout.obterPrecoTotal(), 0);
        assertEquals(0, checkout.obterDescontoTotal(), 0);
        checkout.adicionaProduto("A");
        assertEquals(100, checkout.obterPrecoTotal(), 0);
        assertEquals(0, checkout.obterDescontoTotal(), 0);
        checkout.adicionaProduto("A");
        assertEquals(130, checkout.obterPrecoTotal(), 0);
        assertEquals(20, checkout.obterDescontoTotal(), 0);
        checkout.adicionaProduto("A");
        assertEquals(180, checkout.obterPrecoTotal(), 0);
        assertEquals(20, checkout.obterDescontoTotal(), 0);
        checkout.adicionaProduto("A");
        assertEquals(230, checkout.obterPrecoTotal(), 0);
        assertEquals(20, checkout.obterDescontoTotal(), 0);
        checkout.adicionaProduto("A");
        assertEquals(260, checkout.obterPrecoTotal(), 0);
        assertEquals(40, checkout.obterDescontoTotal(), 0);
        checkout.removerProduto("A");
        assertEquals(230, checkout.obterPrecoTotal(), 0);
        assertEquals(20, checkout.obterDescontoTotal(), 0);
    }
}
