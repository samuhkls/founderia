
package model;


import View.EmFalta_GUI;
import View.Sabores_GUI;
import static View.Sabores_GUI.Branco;
import static View.Sabores_GUI.Leite;
import static View.Sabores_GUI.b;
import static View.Sabores_GUI.c;
import static View.Sabores_GUI.g;
import static View.Sabores_GUI.grande;
import static View.Sabores_GUI.k;
import static View.Sabores_GUI.m;
import static View.Sabores_GUI.medio;
import static View.Sabores_GUI.meioAmargo;
import static View.Sabores_GUI.p;
import static View.Sabores_GUI.pequeno;
import static model.Estoque.ao_leite;
import static model.Estoque.banan;
import static model.Estoque.caq;
import static model.Estoque.kiwi;
import static model.Estoque.mac;
import static model.Estoque.morang;
import static model.Estoque.per;
import View.EmFalta_GUI;
import View.InputIngrediente_GUI;
import javax.swing.JOptionPane;
import static model.Estoque.branco;
import static model.Estoque.meio_amargo;



public class Classes_DAO {
    public static int i=0;
    public static String[] Tam = new String[8];
    public static String[] Fiscal = new String[6];
    public static float ValorTotal=0;
    public static int[] fruta = new int[2];
    public static float valorUnitario;
    public static float kiw=0;
    public static float morango=0;
    public static float caqui=0;
    public static float banana=0;
    public static float maca=0;
    public static float pera=0;
    

    
    public static void abrirSabores(boolean tela){
        
        new Sabores_GUI().setVisible(tela);
    }
    
    public static void abrirEstoque(boolean tela){
        
        new EmFalta_GUI().setVisible(tela);
    }
    
    public static void inserirIngr(boolean tela){
        
        new InputIngrediente_GUI().setVisible(tela);
    }
    
    public static void Tamanho(){
        if(pequeno.isSelected()){
            Tam[0]="Pequeno";
            ValorTotal = (float) (ValorTotal + 7.00);
            valorUnitario=(float) 7.00;
        }
        if(medio.isSelected()){
            Tam[0]="Médio";
            ValorTotal = (float) (ValorTotal + 9.00);
            valorUnitario=(float) 9.00;
            
        }
        if(grande.isSelected()){
            Tam[0]="Grande";
            ValorTotal = (float) (ValorTotal + 11.00);
            valorUnitario=(float) 11.00;
        }
        if(meioAmargo.isSelected()){
            Tam[1]=" Chocolate meio-Amargo";
        }
        if(Branco.isSelected()){
            Tam[1]="Chocolate Branco";
        }
        if(Leite.isSelected()){
            Tam[1]="Chocolate ao Leite";
        }
        
        
        
    }
    

    public static void Kiwi() {
        kiw=(float) (k*3.00);
        ValorTotal=ValorTotal+kiw;
        
        kiwi=(int) (kiwi-(k*100)); 
        if(kiwi<=200){
            new EmFalta_GUI().setVisible(true);
        }
        if(k!=0){
            Fiscal[0]=k+" porcão de kiwi";
           
        }
        
    }
    public static void Morango() {
        morango=(float) (g*3.00);
        ValorTotal=ValorTotal+morango;
        morang=(int) (morang-(g*100)); 
        if(morang<=200){
            new EmFalta_GUI().setVisible(true);
        }
        if(g!=0){
            Fiscal[1]=g+" porcão de morango";
            
        }
    }
    public static void Pera() {
        pera=(float) (p*3.00);
        ValorTotal=ValorTotal+pera;
        per=(int) (per-(p*100)); 
        if(per<=200){
            new EmFalta_GUI().setVisible(true);
        }
        if(p!=0){
            Fiscal[2]=p+" porcão de pera";
            
        }
    }
    public static void Banana() {
        banana=(float) (b*3.00);
        ValorTotal=ValorTotal+banana;
        banan=(int) (banan-(b*100)); 
        if(banan<=200){
            new EmFalta_GUI().setVisible(true);
        }
        if(b!=0){
            Fiscal[3]=b+" porcão de banana";
           
        }
    }
    public static void Maca() {
        maca=(float) (m*3.00);
        ValorTotal=ValorTotal+maca;
        mac=(int) (mac-(m*100)); 
        if(mac<=200){
            new EmFalta_GUI().setVisible(true);
        }
        if(m!=0){
            Fiscal[4]=m+" porcão de Maca";
            
        }
    }
    public static void Caqui() {
        caqui=(float) (c*3.00);
        ValorTotal=ValorTotal+caqui;
        caq=(int) (caq-(k*100)); 
        if(caq<=200){
            new EmFalta_GUI().setVisible(true);
        }
        if(c!=0){
            Fiscal[5]=c+"porcão de Caqui";
            
        }
    }
    public static void NotaFiscal(){
        
        System.out.println(Tam[0]+"Sabor"+Tam[1]+"Valor unitario"+valorUnitario+"Acompanhamentos:"+k+"porções de kiwi, Valor Total"+ValorTotal);
    }
    
    public static void atualizarEstoque(){
    
        EmFalta_GUI.lblEstqCaqui.setText(caq+"g");
        EmFalta_GUI.lblEstqPera.setText(per+"g");
        EmFalta_GUI.lblEstqMorango.setText(morang+"g");
        EmFalta_GUI.lblEstqBanana.setText(banan+"g");
        EmFalta_GUI.lblEstqMaca.setText(mac+"g");
        EmFalta_GUI.lblEstqKiwi.setText(kiwi+"g");
        EmFalta_GUI.lblEstqBranco.setText(branco+"g");
        EmFalta_GUI.lblEstqAoLeite.setText(ao_leite+"g");
        EmFalta_GUI.lblEstqAmargo.setText(meio_amargo+"g");
        
        if(caq <= 200){ 
            EmFalta_GUI.lblAcabCaqui.setText("Caqui em falta");
        } else{
            EmFalta_GUI.lblAcabCaqui.setText("");
        }
        
        if (per <= 200){
            EmFalta_GUI.lblAcabPera.setText("Pera em falta");
        } else{
            EmFalta_GUI.lblAcabPera.setText("");
        }
        
        if (morang <= 200){
            EmFalta_GUI.lblAcabMorango.setText("Morango em falta");
        } else{
            EmFalta_GUI.lblAcabMorango.setText("");
        }
        
        if (banan <= 200){
            EmFalta_GUI.lblAcabBanana.setText("Banana em falta");
        } else{
            EmFalta_GUI.lblAcabBanana.setText("");
        }
        
        if (mac <= 200){
            EmFalta_GUI.lblAcabMaca.setText("Maçã em falta");
        } else{
            EmFalta_GUI.lblAcabMaca.setText("");
        }
        
        if (kiwi <= 200){
            EmFalta_GUI.lblAcabKiwi.setText("Kiwi em falta");
        } else{
            EmFalta_GUI.lblAcabKiwi.setText("");
        }
        
        if (ao_leite <= 200){
            EmFalta_GUI.lblAcabChocLeit.setText("Chocolate ao leite em falta");
        } else{
            EmFalta_GUI.lblAcabChocLeit.setText("");
        }
        
        if (meio_amargo <= 200){
            EmFalta_GUI.lblAcabChocAmarg.setText("Chocolate meio amargo em falta");
        } else{
            EmFalta_GUI.lblAcabChocAmarg.setText("");
        }
        
        if (branco <= 200){
            EmFalta_GUI.lblAcabChocBranco.setText("Chocolate branco em falta");
        } else{
            EmFalta_GUI.lblAcabChocBranco.setText("");
        }
        
        
    }
    
    public static void addIngrediente (){
        String ingrediente = (String) InputIngrediente_GUI.cmbIngrediente.getSelectedItem();
        int qntd = (int) InputIngrediente_GUI.spnGramas.getValue();
        
        if (ingrediente.equals("Pera")){
            per = per + qntd;
        }else if (ingrediente.equals("morango")){
            morang = morang + qntd;
        }else if (ingrediente.equals("Banana")){
            banan = banan + qntd;
        }else if (ingrediente.equals("Maçã")){
            mac = mac + qntd;
        }else if (ingrediente.equals("Kiwi")){
            kiwi = kiwi + qntd;
        }else if (ingrediente.equals("Chocolate branco")){
            branco = branco + qntd;
        }else if (ingrediente.equals("Chocolate amargo")){
            meio_amargo = per + qntd;
        }else if (ingrediente.equals("Chocolate ao leite")){
            ao_leite = ao_leite + qntd;
        }
    
    }

}