package br.com.mercadosrocambole.controlecaixa;

import br.com.mercadosrocambole.controlecaixa.model.Venda;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class Teste3 {

    @Test
    public void executa() {
        Venda checkout = new Venda();
        checkout.adicionaProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 20, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 40, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 40, 0);
        assertEquals(checkout.obterDescontoTotal(), 20, 0);
        checkout.adicionaProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 60, 0);
        assertEquals(checkout.obterDescontoTotal(), 20, 0);
        checkout.removerProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 40, 0);
        assertEquals(checkout.obterDescontoTotal(), 20, 0);
        checkout.removerProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 40, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
    }
}
