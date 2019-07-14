package br.com.mercadosrocambole.controlecaixa;

import br.com.mercadosrocambole.controlecaixa.model.Venda;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class Teste2 {
    
    @Test
    public void executa() {
        Venda checkout = new Venda();
        checkout.adicionaProduto("D");
        assertEquals(checkout.obterPrecoTotal(), 15, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("A");
        assertEquals(checkout.obterPrecoTotal(), 65, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("B");
        assertEquals(checkout.obterPrecoTotal(), 95, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("A");
        assertEquals(checkout.obterPrecoTotal(), 145, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("B");
        assertEquals(checkout.obterPrecoTotal(), 160, 0);
        assertEquals(checkout.obterDescontoTotal(), 15, 0);
        checkout.adicionaProduto("A");
        assertEquals(checkout.obterPrecoTotal(), 190, 0);
        assertEquals(checkout.obterDescontoTotal(), 35, 0);
        checkout.removerProduto("A");
        assertEquals(checkout.obterPrecoTotal(), 160, 0);
        assertEquals(checkout.obterDescontoTotal(), 15, 0);
        checkout.removerProduto("B");
        assertEquals(checkout.obterPrecoTotal(), 145, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
    }
}
