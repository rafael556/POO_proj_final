//Aluno: Rafael Cruz - RA: 2266261

public abstract class Embarcacao{
    
    //atributos
    private String nome;
    private String tipo;
    protected int tripulacao;
    protected double capacidade; //combustivel ou suprimentos

    //metodos
    public String nomeEmbarc(){
        return "Navio "+nome;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public final String getTipo(){
        return tipo;
    }

    public final int getTripulacao(){
        return tripulacao;
    }

    public double getCapacidade(){
        return capacidade;
    }

    //setters
    public void setNome(String nome) throws BlankStringException{
        if(nome.isEmpty() || nome.equals(null)){
            throw new BlankStringException();
        }
        else
            this.nome = nome;
    }

    public final void setTipo(String tipo) throws BlankStringException{
        if(tipo.isEmpty() || tipo.equals(null)){
            throw new BlankStringException();
        }
        else
            this.tipo = tipo;
    }

    public final void setTripulacao(int tripulacao) throws NumNegatException{
        if(tripulacao > 0){
            this.tripulacao = tripulacao;
        }
        else{
            throw new NumNegatException();
        }
    }

    public void setCapacidade(double capacidade)throws NumNegatException, SupCapacidade{
        if(capacidade > 0){
            this.capacidade = capacidade;
        }
        else{
            throw new NumNegatException();
        }
    }
}