//Aluno: Rafael Cruz - RA: 2266261

public class ProjFinal {
    public static void main(String arg[]){
        Leitura input = new Leitura();

        while(true){

            int decisao = 0;
    
            System.out.println("Escolha 1 para criar um navio");
            System.out.println("Escolha 2 para criar um veleiro");
            System.out.println("Escolha 3 para criar um jet ski");
            
            decisao = Integer.parseInt(input.entDados(""));
    
            switch(decisao){
                case 1:
                    Navio navio = new Navio();
    
                    //entradas
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
                    
                    //saidas
                    navio.getNavio();
                    break;
    
                case 2:
                    Veleiro veleiro = new Veleiro();
    
                    //entradas
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
                    
                    //saidas
                    veleiro.getVeleiro();
                    break;
    
                case 3:
                    JetSki jetski = new JetSki();
    
                    //entradas

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

                    //saidas
                    jetski.getJetSki();
                    break;
    
                default:
                    System.out.println("Erro\n");
                    break;
            }

            //Menu para recomeço
            System.out.println("\nDeseja criar outra embarcacao?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            decisao = Integer.parseInt(input.entDados(""));

            if(decisao == 1)
                continue;
                
            else if(decisao == 2)
                break;

            else{
                System.out.println("Erro\n");
                break;
            }
        }
        
    }
}
