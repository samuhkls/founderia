
package model;


import static View.Cliente_GUI.txtCpf;
import static View.Cliente_GUI.txtNome;
import static View.Cliente_GUI.txtdTel;
import static View.Cliente_GUI.lblEftd;
import View.EmFalta_GUI;
import View.Sabores_GUI;
import static View.Nota_Fiscal_GUI.lblFiscalNome;
import static View.Nota_Fiscal_GUI.lblFiscalCpf;
import static View.Nota_Fiscal_GUI.lblFiscalTelefone;
import static View.Nota_Fiscal_GUI.lblFiscalPreco;
import static View.Nota_Fiscal_GUI.lblFiscalTam;
import static View.Nota_Fiscal_GUI.lblFiscalChoco;
import static View.Nota_Fiscal_GUI.lblFiscalKiwi;
import static View.Nota_Fiscal_GUI.lblFiscalMorango;
import static View.Nota_Fiscal_GUI.lblFiscalPera;
import static View.Nota_Fiscal_GUI.lblFiscalMaca;
import static View.Nota_Fiscal_GUI.lblFiscalBanana;
import static View.Nota_Fiscal_GUI.lblFiscalCaqui;
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
import static model.Variaveis.ao_leite;
import static model.Variaveis.banan;
import static model.Variaveis.caq;
import static model.Variaveis.kiwi;
import static model.Variaveis.mac;
import static model.Variaveis.morang;
import static model.Variaveis.per;
import static model.Variaveis.clienteNome;
import static model.Variaveis.clienteCpf;
import static model.Variaveis.clienteTel;
import View.EmFalta_GUI;
import View.InputIngrediente_GUI;
import View.Nota_Fiscal_GUI;
import javax.swing.JOptionPane;
import static model.Variaveis.branco;
import static model.Variaveis.meio_amargo;
import static View.Nota_Fiscal_GUI.lblFiscalChoco;


public class Classes_DAO {
    public static int i=0;
    public static String[] pedido = new String[7];
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
    
    public static void abrirFiscal(boolean tela){
    
        new Nota_Fiscal_GUI().setVisible(tela);
        lblFiscalNome.setText(clienteNome);
        lblFiscalCpf.setText(clienteCpf);
        lblFiscalTelefone.setText(clienteTel);
        lblFiscalPreco.setText(String.valueOf(ValorTotal));
        lblFiscalTam.setText(pedido[0]);
        lblFiscalChoco.setText(pedido[1]);
        lblFiscalKiwi.setText(pedido[2]);
        lblFiscalMorango.setText(pedido[3]);
        lblFiscalPera.setText(pedido[4]);
        lblFiscalBanana.setText(pedido[5]);
        lblFiscalMaca.setText(pedido[6]);
        lblFiscalCaqui.setText(pedido[7]);
        
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
            Tam[1]="Meio-Amargo";
        }
        if(Branco.isSelected()){
            Tam[1]="Branco";
        }
        if(Leite.isSelected()){
            Tam[1]="Leite";
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
            Fiscal[0]="Porções de Kiwi: "+k;
        }else{
            Fiscal[0]="";
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
            Fiscal[1]="Porçoes de Morango: "+g;
        }else{
            Fiscal[1]="";
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
            Fiscal[2]="Porções de Pera: "+p;
        }else{
            Fiscal[2]="";
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
            Fiscal[3]="Porções de Banana: "+b;
        }else{
            Fiscal[3]="";
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
            Fiscal[4]="Porções de Maçã: "+m;
        } else{
            Fiscal[4]="";
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
            Fiscal[5]="Porções de Caqui: "+c;
        } else{
            Fiscal[5]="";
        }
        
    }
    public static void NotaFiscal(){
        
        pedido[0] = ("Tamanho: "+Tam[0]);
        pedido[1] = ("Chocolate: "+Tam[1]);
        for(i=2;i<6;i++){
            pedido[i] = Fiscal[i-2];
        }
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
    public static void cadCliente (){
    
        clienteNome = txtNome.getText();
        clienteCpf = txtCpf.getText();
        clienteTel = txtdTel.getText();
        lblEftd.setText("Efetuado");
        
    }

}