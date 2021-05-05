//Nome: Rafael Cruz - RA: 2266261

public class BlankStringException extends Exception {
    
    Leitura input = new Leitura();
    
    public void impBlank(){
        System.out.println("O campo deve ser preenchido");
    }
    
    public Navio consertaNome(Navio navio){
        try{
            navio.setNome(input.entDados("\nDigite o nome do Navio:"));
        }
        
        catch(BlankStringException bse){
            bse.impBlank();
            navio = bse.consertaNome(navio);
        }
        return navio;
    }

    public Navio consertaTipo(Navio navio){
        try{
            navio.setTipo(input.entDados("Digite o tipo do navio:"));
        }

        catch(BlankStringException bse){
            bse.impBlank();
            navio = bse.consertaTipo(navio);
        }
        return navio;
    }

    public Navio consertaPropulsao(Navio navio){
        try{
            navio.setPropulsao(input.entDados("Digite o tipo de propulsao:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            navio = bse.consertaPropulsao(navio);
        }   
        return navio;
    }

    public Veleiro consertaNome(Veleiro veleiro){
        try{
            veleiro.setNome(input.entDados("\nDigite o nome do veleiro:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            veleiro = bse.consertaNome(veleiro);
        }
        return veleiro;
    }

    public Veleiro consertaTipo(Veleiro veleiro){
        try{
            veleiro.setTipo(input.entDados("Digite o tipo do veleiro:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            veleiro = bse.consertaTipo(veleiro);
        }
        return veleiro;
    }

    public JetSki consertaNome(JetSki jetski){
        try{
            jetski.setNome(input.entDados("\nDigite o nome do jetski:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            jetski = bse.consertaNome(jetski);
        }
        return jetski;
    }

    public JetSki consertaTipo(JetSki jetski){
        try{
            jetski.setTipo(input.entDados("Digite o tipo do jetski:"));
        }
        catch(BlankStringException bse){
            bse.impBlank();
            jetski = bse.consertaTipo(jetski);
        }
        return jetski;
    }
}