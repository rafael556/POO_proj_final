//Aluno: Rafael Cruz - RA: 2266261

public class Navio extends Embarcacao {
    
    //atributos
    protected double velocidade;
    private String propulsao;
    protected double comprimento;

    //métodos
    public String nomeEmbarc(){
        return "H.M.S. "+getNome();
    }

    public void getNavio(){
        System.out.println("\nNome: "+nomeEmbarc());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Tripulacao: "+getTripulacao());
        System.out.println("Propulsao: "+getPropulsao());
        System.out.println("Comprimento do navio: "+getComprimento()+" metros");
        System.out.println("velocidade do navio: "+getVelocidade()+" nos");
    }

    //getters
    public double getVelocidade(){
        return velocidade;
    }

    public String getPropulsao(){
        return propulsao;
    }

    public double getComprimento(){
        return comprimento;
    }

    //setters
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
}
