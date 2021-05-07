//Aluno: Rafael Cruz - RA: 2266261

import java.util.List;
import java.util.ArrayList;

public class ProjFinal {

    //listas de objetos 
    private static Navio navio;
    private static Veleiro veleiro;
    private static JetSki jetski;
    private static Leitura input = new Leitura();
    private static GerEmb ger = new GerEmb();
    public static void main(String arg[]){
        boolean opcao = true;

//=====================Menu Principal=============================
        while(true){

            int decisao = 0;
    
            System.out.println("\n1 -  Editar navios");
            System.out.println("2 -  Editar veleiros");
            System.out.println("3 -  Editar jet skis");
            
            decisao = Integer.parseInt(input.entDados(""));
            
            switch(decisao){
                case 1:
                    opcao = true;
                    
                    while(opcao){
//==============opções do submenu principal de Navio===============
                        System.out.println("\n1 - Cadastrar Navio");
                        System.out.println("2 - Listar Navios");
                        System.out.println("3 - Consultar Navio pelo codigo");
                        System.out.println("4 - Remover Navio pelo codigo");
                        System.out.println("5 - Atualizar dados de Navio pelo codigo");
                        System.out.println("6 - Sair do menu Navios");
                        
                        while(true){
                            try{
                                decisao = Integer.parseInt(input.entDados(""));
                                break;
                            }
                            catch(NumberFormatException nfe){
                                System.out.println("A entrada deve ser um inteiro de 1 a 6!");
                            }
                        }
                        
//========================submenu de Navio========================
                        switch(decisao){
                            case 1:
                                navio = new Navio();
                                navio = ger.cadastroNavio(navio);
                                break;

                            case 2:
                                System.out.println("\nListagem de Navios!");
                                ger.listaNavio();
                                break;  

                            case 3:
                                System.out.println("\nConsulta de Navio por codigo");
                                navio = new Navio();

                                while(true){
                                    try{
                                        navio.setCodigo(Integer.parseInt(input.entDados("Digite o codigo para consulta")));
                                        break;
                                    }
                                    catch(NumNegatException nne){
                                        nne.impNNE();
                                    }
                                    catch(NumberFormatException nfe){
                                        System.out.println("O codigo e um inteiro");
                                    }
                                }

                                navio = ger.ConsNavio(navio);
                                if(navio != null){
                                    navio.getNavio();
                                }
                                else{
                                    input.entDados("Codigo inexistente! Pressione <Enter>");
                                }
                                
                                break;  
                            case 4:
                                System.out.println("\nRemover Navio pelo codigo");
                                navio = new Navio();

                                while(true){
                                    try{
                                        navio.setCodigo(Integer.parseInt(input.entDados("Digite o codigo para consulta")));
                                        break;
                                    }
                                    catch(NumNegatException nne){
                                        nne.impNNE();
                                    }
                                    catch(NumberFormatException nfe){
                                        System.out.println("O codigo e um inteiro");
                                    }
                                }
                                navio = ger.ConsNavio(navio);
                                if(navio != null){
                                    ger.RemoveNavio(navio);
                                }
                                else{
                                    input.entDados("Codigo inexistente! Pressione <Enter>");
                                }

                                break;  
                            case 5:
                                System.out.println("\nAtualizar dados a partir de codigo");
                                navio = new Navio();

                                while(true){
                                    try{
                                        navio.setCodigo(Integer.parseInt(input.entDados("Digite o codigo para consulta")));
                                        break;
                                    }
                                    catch(NumNegatException nne){
                                        nne.impNNE();
                                    }
                                    catch(NumberFormatException nfe){
                                        System.out.println("O codigo e um inteiro");
                                    }
                                }
                                navio = ger.ConsNavio(navio);
                                if(navio != null){
                                    ger.AtNavio(navio);
                                }
                                else{
                                    input.entDados("Codigo inexistente! Pressione <Enter>");
                                }

                                break;  
                            case 6:
                                opcao = false;
                                break;  
                            default:
                                System.out.println("Erro");
                                break;  
                        }
                    }
                    break;
    
//=========opções do submenu principal de Veleiro==================
                case 2:
                    opcao = true;
                    while(opcao){
                        System.out.println("\n1 - Cadastrar Veleiro");
                        System.out.println("2 - Listar Veleiros");
                        System.out.println("3 - Consultar Veleiro pelo codigo");
                        System.out.println("4 - Remover Veleiro pelo codigo");
                        System.out.println("5 - Atualizar dados de Veleiro pelo codigo");
                        System.out.println("6 - Sair do menu Veleiros");
                        
                        while(true){
                            try{
                                decisao = Integer.parseInt(input.entDados(""));
                                break;
                            }
                            catch(NumberFormatException nfe){
                                System.out.println("A entrada deve ser um inteiro de 1 a 6!");
                            }
                        }
                    
//======================submenu de Veleiro=========================
                        switch(decisao){
                            case 1:
                                veleiro = new Veleiro();
                                veleiro = ger.cadVeleiro(veleiro);
                                break;
                            case 2:
                                System.out.println("Listagem de Veleiros");
                                ger.listaVeleiro();
                                break;  
                            case 3:
                                veleiro = new Veleiro();
                                System.out.println("Consulta a partir do codigo do Veleiro");

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
                                veleiro = ger.ConsVeleiro(veleiro);
                                
                                if(veleiro != null)
                                    veleiro.getVeleiro();
                                else 
                                    input.entDados("Codigo invalido... pressione <Enter>");
                                
                                break;  
                            case 4:
                                veleiro = new Veleiro();

                                System.out.println("Digite o codigo para a remocao de veleiro");

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

                                veleiro = ger.ConsVeleiro(veleiro);

                                if(veleiro != null)
                                    ger.RemoveVeleiro(veleiro);
                                else 
                                    input.entDados("Codigo invalido... Pressione <Enter>");
                                
                                break;  
                            case 5:
                                veleiro = new Veleiro();
                                System.out.println("Digite o codigo apra atualizacao:");

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

                                veleiro = ger.ConsVeleiro(veleiro);

                                if(veleiro != null)
                                    ger.AtVeleiro(veleiro);
                                else 
                                input.entDados("Codigo invalido... Pressione <Enter>");
                                    
                                break;  
                            case 6:
                                opcao = false;    
                                break;  
                            default:
                                
                                break;  
                        }
                    }
                        break;
    
//===================Opções de submenu de JetSki===================
                case 3:
                    opcao = true;

                    while(opcao){
                        //opções do submenu principal de Jetski
                        System.out.println("\n1 - Cadastrar Jetski");
                        System.out.println("2 - Listar Jetskis");
                        System.out.println("3 - Consultar Jetski pelo codigo");
                        System.out.println("4 - Remover Jetski pelo codigo");
                        System.out.println("5 - Atualizar dados de Jetski pelo codigo");
                        System.out.println("6 - Sair do menu Jetskis");
                        
                        while(true){
                            try{
                                decisao = Integer.parseInt(input.entDados(""));
                                break;
                            }
                            catch(NumberFormatException nfe){
                                System.out.println("A entrada deve ser um inteiro de 1 a 6!");
                            }
                        }
                    
                        //submenu de Jetski
                        switch(decisao){
                            case 1:
                                jetski = new JetSki();
                                jetski = ger.cadJetSki(jetski);
                                break;
                            case 2:
                                System.out.println("Listagem de Jetskis");
                                ger.listaJetSki();
                                break;  
                            case 3:
                                jetski = new JetSki();
                                System.out.println("Consulta a partir do codigo do Jetski");
                                
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

                                jetski = ger.ConsJet(jetski);
                                
                                if(jetski != null)
                                    jetski.getJetSki();
                                else 
                                input.entDados("Codigo invalido... pressione <Enter>");
                                
                                break;  
                            case 4:
                                jetski = new JetSki();

                                System.out.println("Digite o codigo para a remocao de jetski");
                                
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

                                jetski = ger.ConsJet(jetski);

                                if(jetski != null)
                                    ger.RemoveJet(jetski);
                                else
                                input.entDados("Codigo invalido... Pressione <Enter>");
                                break;  
                            case 5:
                                jetski = new JetSki();
                                
                                System.out.println("Digite o codigo apra atualizacao:");

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

                                jetski = ger.ConsJet(jetski);

                                if(jetski != null)
                                    ger.AtJet(jetski);
                                else
                                input.entDados("Codigo invalido... Pressione <Enter>");
                                break;  
                            case 6:
                                opcao = false;
                                break;  
                            default:

                                break;  
                        }
                    }
                        break;
    
                default:
                    System.out.println("Erro\n");
                    break;
            }

//=====================Menu para recomeço==========================
            System.out.println("\nDeseja editar outro tipo de embarcacao?");
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
