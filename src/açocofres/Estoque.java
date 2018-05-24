
package açocofres;

import java.util.*;
import javax.swing.*;
/**
 *
 * @author cleiton
 */
public class Estoque {
    
    ArrayList<Cofre> listacofres = new ArrayList<>();
    
    public void adicionando_cofres(Cofre c){
        
        
        
        /*JOptionPane.showInputDialog("Adicionando um cofre ao estoque:");
        int op = 0;
        do{
            String modelo = JOptionPane.showInputDialog("Informe o Modelo:");
            double largura = (Double.parseDouble(JOptionPane.showInputDialog("Informe a largura:")));
            double profundidade = (Double.parseDouble(JOptionPane.showInputDialog("Informe a profundidade:")));        
            double altura = (Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:")));
            double peso = (Double.parseDouble(JOptionPane.showInputDialog("Informe a peso:")));
            double pre = (Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:")));
            
            listacofres.add(new Cofre(altura, largura, profundidade, pre, peso, modelo));
            
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Encerrar cadastros\n2 - Cadastrar mais cofres\n"));
        
        }while(op == 2);*/
        listacofres.add(c);
    }
    
    public void listar_produtos(){
            JOptionPane.showMessageDialog(null,"****Os cofres armazenados no estuque-"+ listacofres.size()+ "**** ");
        for(int i=0; i< listacofres.size();i++){
                    JOptionPane.showMessageDialog(null, listacofres.get(i).toString());
                }
    
    }
    
    public String num_cofres(){
    
        return listacofres.size() + "";
    }
    
    public void buscar_cofre(){
    
    
    }
    
    public void remover_cofre(){
        
    
    }
}
