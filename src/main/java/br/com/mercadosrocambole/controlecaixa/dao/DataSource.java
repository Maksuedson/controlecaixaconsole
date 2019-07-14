package br.com.mercadosrocambole.controlecaixa.dao;

import br.com.mercadosrocambole.controlecaixa.model.LeveXPaguePorY;
import br.com.mercadosrocambole.controlecaixa.model.LeveXPagueY;
import br.com.mercadosrocambole.controlecaixa.model.Produto;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsável por simular acesso ao banco de dados.
 *
 * @author MAKSUEDSON GOMES DA SILVA / maksuedson@hotmail.com
 */
public abstract class DataSource {

    private final static Map<String, Produto> DATABASE = new HashMap<>();

    static {
        //A
        LeveXPagueY leve3Pague130 = new LeveXPagueY(3, 130);
        Produto a = new Produto("A", 50, leve3Pague130);
        DATABASE.put(a.getId(), a);

        //B
        LeveXPagueY leve2Page45 = new LeveXPagueY(2, 45);
        Produto b = new Produto("B", 30, leve2Page45);
        DATABASE.put(b.getId(), b);

        //C
        LeveXPaguePorY leve3PaguePor2 = new LeveXPaguePorY(3, 2);
        Produto c = new Produto("C", 20, leve3PaguePor2);
        DATABASE.put(c.getId(), c);

        //D
        Produto d = new Produto("D", 15, null);
        DATABASE.put(d.getId(), d);
    }

    public static Map<String, Produto> getDatabase() {
        return DATABASE;
    }
}
