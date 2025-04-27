package Iptu;

public class Imovel {
    String codImovel;
    String nome;
    float imposto;
    int meses_atraso;
    float multa;
    int area;
    
    public float calculaImposto(int area) {
        if (area <= 50) {
            return 300;
        } else if (area > 50 && area <= 100) {
            return 500;
        } else if (area > 100 && area <= 150) {
            return 700;
        } else if (area > 150 && area <= 200) {
            return 900;
        } else {
            return 1200;
        }
        
    }

    public Imovel(String codigo, String nome, int meses, int area) {
        this.codImovel = codigo;
        this.nome = nome;
        this.meses_atraso = meses;
        this.area = area;
        this.imposto = calculaImposto(area);
    }
}
