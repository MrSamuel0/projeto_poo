/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iptu;
import Bet_poo.InOut;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author samuel
 */
public class projeto_poo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Imovel geladeira = new Imovel("01A", "Geladeira", 5, 2.80F, 100);
        Imovel fogao = new Imovel("02A", "Fogão", 7, 5.00F, 500);
        Imovel ar_condicionado = new Imovel("03A", "Ar condicionado", 9, 6.20F, 80);
        Imovel cama = new Imovel("04A", "Cama", 11, 8.30F, 150);
        Imovel micro_ondas = new Imovel("05A", "Micro-ondas", 12, 10.10F, 120);
        Imovel televisao = new Imovel("06A", "Televisão", 14, 12.50F, 40);
        Municipio vila_velha = new Municipio();
        vila_velha.cadastrarImovel(geladeira);
        vila_velha.cadastrarImovel(fogao);
        vila_velha.cadastrarImovel(ar_condicionado);
        vila_velha.cadastrarImovel(cama);
        vila_velha.cadastrarImovel(micro_ondas);
        vila_velha.cadastrarImovel(televisao);
        vila_velha.cacularMulta(geladeira);
        Float despesas = vila_velha.despesasDoMunicipio();
    
        InOut.MsgDeInformacao("test", df.format(geladeira.multa));
        InOut.MsgDeInformacao("test", df.format(despesas));
    }
}
