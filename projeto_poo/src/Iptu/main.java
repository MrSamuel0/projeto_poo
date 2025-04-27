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
public class main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Municipio vila_velha = new Municipio();
        
        int limite = InOut.leInt("Digite a quantidade de imoveis que voce deseja cadastrar");
        int x = 0;
        
        while (x < limite) {
            String codigoImovel = InOut.leString("Digite o codigo do imovel");
            String nomeImovel = InOut.leString("Digite o nome do imovel");
            int mesesAtraso = InOut.leInt("Meses de atraso do iptu");
            int areaImovel = InOut.leInt("Digite a area do imovel");
            InOut.MsgDeAviso("Sucesso!", nomeImovel + " cadastrado");

            Imovel imovel = new Imovel(codigoImovel, nomeImovel, mesesAtraso, areaImovel);
            vila_velha.cadastrarImovel(imovel);
            vila_velha.cacularMulta(imovel);
            vila_velha.buscarImovel(imovel.codImovel);
            
            x += 1;
        }
        
        Float despesas = vila_velha.despesasDoMunicipio();
        
        InOut.MsgDeInformacao("test", df.format(despesas));
    }
}
