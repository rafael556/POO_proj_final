//Aluno: Rafael Cruz - RA: 2266261

public class JetSki extends Embarcacao implements Autonomia{
    
    //atributos
    private double potencia;
    private double eficiencia; //combustivel/hora
    Leitura input = new Leitura();

    //métodos
    public double autonomia(){ 
        return getCapacidade() / eficiencia;
    }

    public String getAutonomia(){   //converter a saida para horas ou minutos
        double horas = Math.floor(autonomia());
        double minutos = Math.ceil((autonomia() - horas) * 60);

        if(minutos != 0)
            return "Aproximadamente "+horas+" horas e "+minutos+" minutos";
        else
            return "Aproximadamente "+horas+" horas";
    }

    public String nomeEmbarc(){
        return "Jet Ski "+getNome();
    }

    public void getJetSki(){
        System.out.println("\nNome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Potencia: "+getPotencia()+" HP");
        System.out.println("Eficiencia: "+getEficiencia()+" litros/h");
        System.out.println("autonomia: "+getAutonomia());
    }

    public JetSki setJetSki(JetSki jetski){
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
        return jetski;
    }
        
    //getters
    public double getPotencia(){
        return potencia;
    }

    public double getEficiencia(){
        return eficiencia;
    }

    //setters
    public void setPotencia(double potencia)throws NumNegatException{
        if(potencia > 0){
            this.potencia = potencia;
        }
        else{
            throw new NumNegatException();
        }
    }

    public void setEficiencia(double eficiencia)throws NumNegatException{
        if(eficiencia > 0){
            this.eficiencia = eficiencia;
        }
        else{
            throw new NumNegatException();
        }
    }

    public void setCapacidade(double capacidade)throws NumNegatException, SupCapacidade{
        if(capacidade > 0){
            if(capacidade <= 80){    //limite do tanque de combustivel
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