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
        //===============miss exceção================
        bdNav.add(navio);
        return navio;
    }
    
    //listagem de todos os navios
    public void listaNavio(){
        for(int i = 0; i < bdNav.size(); i++)
            bdNav.get(i).getNavio();
    }
}
