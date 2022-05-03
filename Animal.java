
/**
 * classe que representa um Animal e estabelece um relacionamento de agregação com classe Zoologico
 * 
* @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class Animal
{
    //Definimos atributos comuns aos animais
    private String nome;
    private String especie;
    private int quantidadeDePatas;
    private String somCaracteristico;
    
    //Constroi objeto Animal com base nos parâmetros passados
    public Animal(String nome, String especie,int quantidadeDePatas, String somCaracteristico){
        this.nome = nome;
        this.especie = especie;
        this.quantidadeDePatas = quantidadeDePatas;
        this.somCaracteristico = somCaracteristico;
    }
    
    //Retorna nome do Animal
    public String getNome(){
        return nome;
    }
    
    //Retorna especie do Animal
    public String getEspecie(){
        return especie;
    }
    
    //Retorna quantidade de patas do Animal
    public int getQuantidadePatas(){
        return quantidadeDePatas;
    }
    
    //Retorna o som que o Animal emite
    public String getSom(){
        return somCaracteristico;
    }
    
    //Retorna descricao de um animal contendo(nome, especie e som característico)
    public String getDescricao(String nome){
        return nome + " eh um(a) " + especie + " que faz " + somCaracteristico;
    }

}