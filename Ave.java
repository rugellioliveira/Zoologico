
/**
 * Classe que representa uma Ave
 * Ave herda da classe Animal( tem nome, especie, quantidade de patas e somcaracterístico)
 * E acrescenta se a ave voa bem ou mal
 * 
 * @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class Ave extends Animal
{
    //Definimos apenas os atributos que sao especificos da ave
    private boolean voamBem;
    
    //Controi objeto da classe Ave a partir dos parametros passados
    public Ave(String nome, String especie, int quantidadeDePatas, String somCaracteristico, boolean voamBem){
        super(nome,especie,quantidadeDePatas,somCaracteristico);
        this.voamBem = voamBem;
    }

    //Retorna se a ave voa bem ou mal
    public boolean getVoamBem(){
        return voamBem;
    }
    
    //Método que sobrescreve o método getDescricao() da superclasse
    @Override
    public String getDescricao(String nome){
        String descricao = super.getDescricao(nome);
        
        if(voamBem){
         descricao = descricao + " e voa bem ";
        }
        else{
         descricao = descricao + " e voa mal ";    
        }
        
        return descricao;
    }
}