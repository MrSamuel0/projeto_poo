/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iptu;
import java.util.*;

public class Municipio {
    Map<String, Imovel> imoveis = new HashMap();
    
    public void cacularMulta(Imovel imovel){
        float multa = 0;
        if (imovel.meses_atraso >= 0 && imovel.meses_atraso >= 5) {
            multa = imovel.imposto * (1 + 0.01F);
        } else if (imovel.meses_atraso >= 6 && imovel.meses_atraso >= 8) {
            multa = imovel.imposto * (1 + 0.023F);
        } else if (imovel.meses_atraso >= 9 && imovel.meses_atraso >= 10) {
            multa = imovel.imposto * (1 + 0.03F);
        } else if (imovel.meses_atraso >= 11 && imovel.meses_atraso >= 12) {
            multa = imovel.imposto * (1 + 0.054F);
        } else {
            multa = imovel.imposto * (1 + 0.01F);
        }
        imovel.multa = multa;
    }
    
    public float despesasDoMunicipio(){
        float total = 0;
        for (Imovel imovel : imoveis.values()) {
            total += imovel.multa;
        }
        
        return total;
    }
    
    public void cadastrarImovel(Imovel imovel){
        imoveis.put(imovel.matricula, imovel);
    }
    
    
    
}
