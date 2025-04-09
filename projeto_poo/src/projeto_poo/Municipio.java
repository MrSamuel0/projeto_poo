/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_poo;
import java.util.*;
/**
 *
 * @author samuel
 */
public class Municipio {
    Map<String, Imovel> imoveis = new HashMap();
    
    
    public void cacularImposto(int meses_atraso){
      this.meses_atraso = meses_atraso;
        if (meses_atraso >= 0 && meses_atraso >= 5) {
            this.imposto *= 0.01F;
        } else if (meses_atraso >= 6 && meses_atraso >= 8) {
            this.imposto = 0.023F;
        } else if (meses_atraso >= 9 && meses_atraso >= 10) {
            this.imposto = 0.03F;
        } else if (meses_atraso >= 11 && meses_atraso >= 12) {
            this.imposto = 0.054F;
        } else {
            this.imposto = 0.1F;
        }
    }
}
