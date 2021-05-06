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
                        //opções do submenu principal de Navio
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
                        
                        //submenu de Navio
                        switch(decisao){
                            case 1:
                                navio = new Navio();
                                navio = ger.cadastroNavio(navio);
                                break;
                            case 2:
                                System.out.println("\nListagem de pessoas!");
                                ger.listaNavio();
                                break;  
                            case 3:
                                System.out.println("\nConsulta de Navio por codigo");
                                navio = new Navio();
                                break;  
                            case 4:
                                System.out.println("\nRemover Navio pelo codigo");
                                navio = new Navio();
                                break;  
                            case 5:
                                System.out.println("\nAtualizar dados a partir de codigo");
                                navio = new Navio();
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
    
                case 2:
                    
                    // opcao = true;
                    // while(true){
                    //     //opções do submenu principal de Veleiro
                    //     System.out.println("1 - Cadastrar Veleiro");
                    //     System.out.println("2 - Listar Veleiros");
                    //     System.out.println("3 - Consultar Veleiro pelo código");
                    //     System.out.println("4 - Remover Veleiro pelo código");
                    //     System.out.println("5 - Atualizar dados de Veleiro pelo código");
                    //     System.out.println("6 - Sair do menu Veleiros");
                        
                    //     while(true){
                    //         try{
                    //             decisao = Integer.parseInt(input.entDados(""));
                    //             break;
                    //         }
                    //         catch(NumberFormatException nfe){
                    //             System.out.println("A entrada deve ser um inteiro de 1 a 6!");
                    //         }
                    //     }
                        
                    //     while(opcao){
                    //         //submenu de Veleiro
                    //         switch(decisao){
                    //             case 1:
                    //                 Veleiro veleiro = new Veleiro();
                                    
                    //                 break;
                    //             case 2:
                                        
                    //                 break;  
                    //             case 3:
                                        
                    //                 break;  
                    //             case 4:
                                        
                    //                 break;  
                    //             case 5:
                                        
                    //                 break;  
                    //             case 6:
                    //                 opcao = false;    
                    //                 break;  
                    //             default:
                                    
                    //                 break;  
                    //         }
                    //     }
                    //     break;
                    // }
                        //saidas
                        // veleiro.getVeleiro();
                        // break;
    
                case 3:
                    // opcao = true;

                    // while(true){
                    //     //opções do submenu principal de Jetski
                    //     System.out.println("1 - Cadastrar Jetski");
                    //     System.out.println("2 - Listar Jetskis");
                    //     System.out.println("3 - Consultar Jetski pelo código");
                    //     System.out.println("4 - Remover Jetski pelo código");
                    //     System.out.println("5 - Atualizar dados de Jetski pelo código");
                    //     System.out.println("6 - Sair do menu Jetskis");
                        
                    //     while(true){
                    //         try{
                    //             decisao = Integer.parseInt(input.entDados(""));
                    //             break;
                    //         }
                    //         catch(NumberFormatException nfe){
                    //             System.out.println("A entrada deve ser um inteiro de 1 a 6!");
                    //         }
                    //     }
                        
                    //     while(opcao){
                    //         //submenu de Jetski
                    //         switch(decisao){
                    //             case 1:
                    //                 JetSki jetski = new JetSki();
    
                    //                 break;
                    //             case 2:
                                    
                    //                 break;  
                    //             case 3:
                                    
                    //                 break;  
                    //             case 4:
                                    
                    //                 break;  
                    //             case 5:
                                    
                    //                 break;  
                    //             case 6:
                    //                 opcao = false;
                    //                 break;  
                    //             default:

                    //                 break;  
                    //         }
                    //     }
                    //     break;
                    // }
    
                default:
                    System.out.println("Erro\n");
                    break;
            }

            //Menu para recomeço
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


