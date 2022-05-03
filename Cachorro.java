
/** Classe que representa um Cachorro 
 * Cachorro herda da classe Mamifero
 * 
 * @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class Cachorro extends Mamifero
{
    //Constroi objeto Cachorro com base nos parâmetros passados
    public Cachorro(String nome,String corPelo){
        super(nome,"cachorro",4,"Au-au",corPelo);
    }
}
