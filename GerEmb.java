//Nome: Rafael Cruz - RA: 2266261

import java.util.List;
import java.util.ArrayList;

public class GerEmb {
    private List <Navio> bdNav = new ArrayList<Navio>();
    private List <Veleiro> bdVel = new ArrayList<Veleiro>();
    private List <JetSki> bdJet = new ArrayList<JetSki>();
    private Leitura input = new Leitura();
    private Navio navio;
    private Veleiro veleiro;
    private JetSki jetski;


//==========================Navio=============================================================

    public Navio cadastroNavio(Navio navio){
    
        while(true){
            try{
                navio.setCodigo(Integer.parseInt(input.entDados("Digite o codigo do navio")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();                
            }
            catch(NumberFormatException nfe){
                System.out.println("A entrada deve ser um numero inteiro");
            }
        }

        try{
            navio.setNome(input.entDados("\nDigite o nome do Navio:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaNome(navio);
        }
    
        try{
            navio.setTipo(input.entDados("Digite o tipo do navio:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaTipo(navio);
        }
    
        while(true){
            try{
                navio.setTripulacao(Integer.parseInt(input.entDados("Digite o numero de tripulantes:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero"); 
            }
        }
        
        try{
            navio.setPropulsao(input.entDados("Digite o tipo de propulsao:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaPropulsao(navio);
        }   
    
        while(true){
            try {
                navio.setComprimento(Double.parseDouble(input.entDados("Digite o comprimento do navio em metros:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
    
        while(true){
            try {
                navio.setVelocidade(Double.parseDouble(input.entDados("Digite a velocidade em nos: ")));    
                break;
            } 
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
        bdNav.add(navio);
        return navio;
    }
    
    //===========listagem de todos os navios=============================================================
    public void listaNavio(){
        for(int i = 0; i < bdNav.size(); i++)
            bdNav.get(i).getNavio();

        if(bdNav.size() == 0)
            System.out.println("Lista Vazia");
    }

    //==========consulta a partir do codigo============================================================
    
    public Navio ConsNavio(Navio navio){
       for(int i = 0; i < bdNav.size(); i++){
            if(navio.getCodigo() == bdNav.get(i).getCodigo())
                return bdNav.get(i);
       }
        return null;
    }

//================Remoção de Navio==========================

    public void RemoveNavio(Navio navio){
        bdNav.remove(navio);
    }

//===================Atualização Navio ======================
    
    public void AtNavio(Navio navio){
        
        try{
            navio.setNome(input.entDados("\nDigite o nome do Navio:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaNome(navio);
        }
    
        try{
            navio.setTipo(input.entDados("Digite o tipo do navio:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaTipo(navio);
        }
    
        while(true){
            try{
                navio.setTripulacao(Integer.parseInt(input.entDados("Digite o numero de tripulantes:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero"); 
            }
        }
        
        try{
            navio.setPropulsao(input.entDados("Digite o tipo de propulsao:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaPropulsao(navio);
        }   
    
        while(true){
            try {
                navio.setComprimento(Double.parseDouble(input.entDados("Digite o comprimento do navio em metros:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
    
        while(true){
            try {
                navio.setVelocidade(Double.parseDouble(input.entDados("Digite a velocidade em nos: ")));    
                break;
            } 
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        for(int i = 0; i < bdNav.size(); i++){
            if(navio.getCodigo() == bdNav.get(i).getCodigo()){
                bdNav.set(i, navio);
            }
        }
    }
//============================Veleiro=================================================================

    public Veleiro cadVeleiro(Veleiro veleiro){

        while(true){
            try{
                veleiro.setCodigo(Integer.parseInt(input.entDados("Digite o codigo para consulta")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("O codigo e um inteiro");
            }
        }

        try{
            veleiro.setNome(input.entDados("\nDigite o nome do veleiro:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaNome(veleiro);
        }
        
        try{
            veleiro.setTipo(input.entDados("Digite o tipo do veleiro:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaTipo(veleiro);
        }

        while(true){
            try {
                veleiro.setTripulacao(Integer.parseInt(input.entDados("Digite o numero de tripulantes:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setComprimento(Double.parseDouble(input.entDados("Digite o comprimento do veleiro em metros:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setMastros(Integer.parseInt(input.entDados("Digite o numero de mastros:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setVelas(Integer.parseInt(input.entDados("Digite o numero de velas:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setCapacidade(Double.parseDouble(input.entDados("Digite a quantidade de suprimentos em kg")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(SupCapacidade SPC){
                SPC.impSCP();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
        bdVel.add(veleiro);
        return veleiro;
    }

    //===============Listagem de Veleiros ========================================================

    public void listaVeleiro(){
        for(int i = 0; i < bdVel.size(); i++)
            bdVel.get(i).getVeleiro();
        
            if(bdVel.size() == 0)
            System.out.println("Lista Vazia");
    }

//=================Consulta de Veleiro=============================================================
    
    public Veleiro ConsVeleiro(Veleiro veleiro){
        for(int i = 0 ; i < bdVel.size(); i++){
            if(veleiro.getCodigo() == bdVel.get(i).getCodigo())   
                return bdVel.get(i);
        }
        return null;
    }

//==================Remoção de Veleiro==================================================================
    
    public void RemoveVeleiro(Veleiro veleiro){
        bdVel.remove(veleiro);
    }

//=====================Atualização de Veleiro=================
    
    public void AtVeleiro(Veleiro veleiro){

        try{
            veleiro.setNome(input.entDados("\nDigite o nome do veleiro:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaNome(veleiro);
        }
        
        try{
            veleiro.setTipo(input.entDados("Digite o tipo do veleiro:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaTipo(veleiro);
        }

        while(true){
            try {
                veleiro.setTripulacao(Integer.parseInt(input.entDados("Digite o numero de tripulantes:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setComprimento(Double.parseDouble(input.entDados("Digite o comprimento do veleiro em metros:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setMastros(Integer.parseInt(input.entDados("Digite o numero de mastros:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setVelas(Integer.parseInt(input.entDados("Digite o numero de velas:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                veleiro.setCapacidade(Double.parseDouble(input.entDados("Digite a quantidade de suprimentos em kg")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(SupCapacidade SPC){
                SPC.impSCP();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
    }

//=====================JetSki==================================================================================

    public JetSki cadJetSki(JetSki jetski){

        while(true){
            try{
                jetski.setCodigo(Integer.parseInt(input.entDados("Digite o codigo para consulta")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("O codigo e um inteiro");
            }
        }
        
        try{
            jetski.setNome(input.entDados("\nDigite o nome do jetski:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaNome(jetski);
        }
        
        try{
            jetski.setTipo(input.entDados("Digite o tipo do jetski:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaTipo(jetski);
        }

        while(true){
            try {
                jetski.setCapacidade(Double.parseDouble(input.entDados("Digite a capacidade do tanque de combustivel:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(SupCapacidade SPC){
                SPC.impJscp();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                jetski.setPotencia(Double.parseDouble(input.entDados("Digite a potencia do jetski em HP: ")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
        
        while(true){
            try {
                jetski.setEficiencia(Double.parseDouble(input.entDados("Digite a eficiencia de litros/h do jetski: ")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
        bdJet.add(jetski);
        return jetski;
    }
//=================Listagem JetSki===========
    public void listaJetSki(){
        for(int i = 0; i < bdJet.size(); i++)
            bdJet.get(i).getJetSki();

            if(bdJet.size() == 0)
            System.out.println("Lista Vazia");
    }

//===============Consulta de JetSki==========

    public JetSki ConsJet(JetSki jetski){
        for(int i = 0; i < bdJet.size(); i++){
            if(jetski.getCodigo() == bdJet.get(i).getCodigo())
                return bdJet.get(i);
        }
        return null;
    }
    
//===============Remoção de JetSki============

    public void RemoveJet(JetSki jetski){
        bdJet.remove(jetski);
    }

//================Atualização de JetSki========

    public void AtJet(JetSki jetski){
        try{
            jetski.setNome(input.entDados("\nDigite o nome do jetski:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaNome(jetski);
        }
        
        try{
            jetski.setTipo(input.entDados("Digite o tipo do jetski:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            bse.consertaTipo(jetski);
        }

        while(true){
            try {
                jetski.setCapacidade(Double.parseDouble(input.entDados("Digite a capacidade do tanque de combustivel:")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(SupCapacidade SPC){
                SPC.impJscp();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }

        while(true){
            try {
                jetski.setPotencia(Double.parseDouble(input.entDados("Digite a potencia do jetski em HP: ")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
        
        while(true){
            try {
                jetski.setEficiencia(Double.parseDouble(input.entDados("Digite a eficiencia de litros/h do jetski: ")));
                break;
            }
            catch(NumNegatException nne){
                nne.impNNE();
            }
            catch(NumberFormatException nfe){
                System.out.println("\nDigite um numero");
            }
        }
    }
}
