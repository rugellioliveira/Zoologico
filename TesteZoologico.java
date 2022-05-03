
/**
 * Classe que contém o método main para testar o programa
 * 
* @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class TesteZoologico
{
    private static InterfaceUsuario usuario;  
    
    /**
     * Metodo principal que inicia a execucao do programa
     *
     * @param args Parametros do programa (o programa nao espera nenhum)
     */
    public static void main(String[] args) {
        usuario = new InterfaceUsuario();
        
        usuario.iniciarFuncionamento();
        
    }
}