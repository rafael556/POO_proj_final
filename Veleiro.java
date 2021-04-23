//Aluno: Rafael Cruz - RA: 2266261
import java.lang.Math;

public class Veleiro extends Navio implements Vela, Autonomia{

    //atributos
    private int velas;
    private int mastros;

    //metodos
    public double ingresso(){
        return precoIngresso * getTripulacao();
    }

    public double autonomia(){
        return Math.floor(capacidade / (getTripulacao() * comidaPessoa));
    }

    public String nomeEmbarc(){
        return "Veleiro "+getNome();
    }

    public void getVeleiro(){
        System.out.println("\nNome: "+nomeEmbarc());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Tripulacao: "+getTripulacao());
        System.out.println("Comprimento do veleiro: "+getComprimento()+" metros");
        System.out.println("Numero de mastros: "+getMastros());
        System.out.println("Numero de velas: "+getVelas());
        System.out.println("Lucro com ingressos: R$ "+ingresso());
        System.out.println("Autonomia: "+autonomia()+" dias");
    }

    //getters
    public int getVelas(){
        return velas;
    }

    public int getMastros(){
        return mastros;
    }

    //setters
    public void setVelas(int velas)throws NumNegatException{
        if(velas > 0){
            this.velas = velas;
        }
        else{
            throw new NumNegatException();
        }
    }

    public void setMastros(int mastros)throws NumNegatException{
        if(mastros > 0){
            this.mastros = mastros;
        }
        else{
            throw new NumNegatException();
        }
    }

    public void setCapacidade(double capacidade)throws NumNegatException, SupCapacidade{
        if(capacidade > 0){
            if(capacidade <= (getTripulacao() * comidaPessoa) * 90){    //limite de mantimentos para 90 dias
                this.capacidade = capacidade;
            }
            else{
                throw new SupCapacidade();
            }
        }
        else{
            throw new NumNegatException();
        }
    }
}