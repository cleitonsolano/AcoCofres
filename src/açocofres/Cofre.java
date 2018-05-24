
package açocofres;

/**
 *
 * @author cleiton
 */
public class Cofre {
    
    private String modelo;
    private double altura, largura, profundidade, valor, peso;
    
    public Cofre( double al, double la, double pro, double v, double pe, String mo ){
        this.setAltura(al);
        this.setLargura(la);
        this.setModelo(mo);
        this.setPeso(pe);
        this.setProfundidade(pro);
        this.setValor(v);
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
  
        
}
