package br.com.mercadosrocambole.controlecaixa;

import br.com.mercadosrocambole.controlecaixa.model.Venda;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public class Teste4 {

    @Test
    public void executa() {
        Venda checkout = new Venda();
        checkout.adicionaProduto("C");
        assertEquals(checkout.obterPrecoTotal(), 20, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("B");
        assertEquals(checkout.obterPrecoTotal(), 50, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
        checkout.adicionaProduto("B");
        assertEquals(checkout.obterPrecoTotal(), 65, 0);
        assertEquals(checkout.obterDescontoTotal(), 15, 0);
        checkout.removerProduto("B");
        assertEquals(checkout.obterPrecoTotal(), 50, 0);
        assertEquals(checkout.obterDescontoTotal(), 0, 0);
    }
}
