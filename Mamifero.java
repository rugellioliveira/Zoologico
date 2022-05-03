
/**
 * Classe que representa um Mamífero
 * Mamífero herda da classe Animal( tem nome, especie, quantidade de patas e somcaracterístico)
 * E acrescenta qual a cor do pelo 
 * 
 * @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class Mamifero extends Animal
{
    //Definimos apenas os atributos que sao especificos do mamifero
    private String corPelo;
    
    //Controi objeto da classe Mamífero a partir dos parametros passados
    public Mamifero(String nome, String especie, int quantidadeDePatas, String somCaracteristico,String corPelo){
        super(nome,especie,quantidadeDePatas,somCaracteristico);
        this.corPelo = corPelo;
    }
    
    //Retorna cor do pelo 
    public String getCorPelo(){
        return corPelo;
    }
    
    //Método que sobrescreve o método getDescricao() da superclasse
    @Override
    public String getDescricao(String nome){
        String descricao = super.getDescricao(nome);
        
        descricao = descricao + " e tem pelo " + corPelo;
        
        return descricao;
    }
}
