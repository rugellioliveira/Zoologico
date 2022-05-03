import java.util.Scanner;
/**
 * classe InterfaceUsuario implementada para permitir que o usuário utilize comandos de entrada/saída.
 * 
 * @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class InterfaceUsuario
{
    private Zoologico zoologico;
    
    //Construtor da classe
    public InterfaceUsuario(){
        zoologico = new Zoologico();
    }
    
    //Método para ser utilizado na classe principal para iniciar o funcionamento do programa
    public void iniciarFuncionamento(){
    
        String nome,especie,corPelo;
        
        Scanner input = new Scanner(System.in);
        
        int opcaoMenu;
        do {
            opcaoMenu = exibirMenu();
            
            switch (opcaoMenu) {
                case 1:
                    System.out.print("Digite o nome : ");
                    nome = input.next();
                    System.out.print("Qual o tipo de animal (1-Mamifero, 2-Ave)? ");
                    int tipo = input.nextInt();
                    if(tipo==1){
                     //System.out.print("Digite o nome : ");
                     //nome = input.next();
                     System.out.print("Digite a especie: ");
                     especie = input.next();
                     System.out.print("Digite a cor do pelo: ");
                     corPelo = input.next();
                     zoologico.cadastrarMamifero(nome,especie,corPelo);
                        
                    }
                    else{
                     //System.out.print("Digite o nome : ");
                     //nome = input.next();
                     System.out.print("Digite a especie: ");
                     especie = input.next();
                     zoologico.cadastrarAve(nome,especie);
                        
                    }
                    break;
                case 2:
                    System.out.print(zoologico.listarAnimais());
                    break;
                case 3:
                    System.out.print("Digite o nome do animal : ");
                    nome = input.next();
                    System.out.print(zoologico.emitirSom(nome));
                    break;
                case 4:
                    System.out.print("Digite o nome do animal : ");
                    nome = input.next();
                    System.out.print(zoologico.getDescricaoLonga(nome));
                    break;
                case 5: //vai sair do programa
                    System.out.print("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcaoMenu != 5);
    }
        
    /**
    * Exibe o menu para o usuario e retorna a opcao escolhida por ele
    * 
    * @return Opcao de menu escolhida pelo usuario
    */       
        private static int exibirMenu(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\n********MENU***********");
        System.out.println("\n1) Cadastrar animal");
        System.out.println("2) Listar animais");
        System.out.println("3) Emitir som do animal");
        System.out.println("4) Dados do animal");
        System.out.println("5) Sair");
        System.out.print("\tDigite sua opcao: ");
        
        return entrada.nextInt();
    }
    
}