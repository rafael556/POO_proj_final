import java.util.ArrayList;
import java.util.List;

//Aluno: Rafael Cruz - RA: 2266261

public class Navio extends Embarcacao {
    
    //atributos
    private double velocidade;
    private String propulsao;
    private double comprimento;
    private List <Navio> bdNav = new ArrayList<Navio>();
    Leitura input = new Leitura();

    //métodos
    public String nomeEmbarc(){
        return "H.M.S. "+getNome();
    }

    //=============métodos do submenu=================

    //cadastro
    public Navio cadastroNavio(Navio navio){
        navio = navio.setNavio(navio);

        bdNav.add(navio);
        return navio;
    }
    
    //listagem de todos os navios
    public void listaNavio(){
        for(int i = 0; i < bdNav.size(); i++){
            System.out.println("Nome: "+bdNav.get(i).nomeEmbarc());
        }

    }
    //==================getters========================
    public double getVelocidade(){
        return velocidade;
    }

    public String getPropulsao(){
        return propulsao;
    }

    public double getComprimento(){
        return comprimento;
    }

    public void getNavio(){
        System.out.println("\nNome: "+nomeEmbarc());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Tripulacao: "+getTripulacao());
        System.out.println("Propulsao: "+getPropulsao());
        System.out.println("Comprimento do navio: "+getComprimento()+" metros");
        System.out.println("velocidade do navio: "+getVelocidade()+" nos");
    }

    //==================setters========================
    public void setVelocidade(double velocidade) throws NumNegatException{
        if(velocidade > 0){
            this.velocidade = velocidade;
        }
        else{
            throw new NumNegatException();
        }
    }

    public void setPropulsao(String propulsao) throws BlankStringException{
        if(propulsao.isEmpty() || propulsao.equals(null)){
            throw new BlankStringException();
        }
        this.propulsao = propulsao;
    }

    public void setComprimento(double comprimento)throws NumNegatException{
        if(comprimento > 0){
            this.comprimento = comprimento;
        }
        else{
            throw new NumNegatException();
        }
    }
    public Navio setNavio(Navio navio){
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
        return navio;
    }
}
