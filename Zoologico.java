import java.util.ArrayList;
/**
 * classe que representa um Zoologico, possui uma coleção de animais
 * 
 * @author Rugelli Oliveira
 * @version 2022-03-17
 */
public class Zoologico
{
    //Declara coleção de objetos da classe Animal
    private ArrayList <Animal> animais;
   
    //Construtor da classe inicializa a coleção vazia
    public Zoologico(){
        animais = new ArrayList <Animal>();
    }
    
    //Método para cadastrar animais mamiferos
    public void cadastrarMamifero(String nome, String especie, String corPelo){
        Animal animal;
        if(especie.equals("cachorro")){
            animal = new Cachorro(nome, corPelo);
            animais.add(animal);
        }
        else if(especie.equals("gato")){
            animal = new Gato(nome, corPelo);
            animais.add(animal);
        }
        else if(especie.equals("lobo")){
            animal = new Lobo(nome, corPelo);
            animais.add(animal);
        }
    }
    
    //Método para cadastrar animais que voam (aves)
    public void cadastrarAve(String nome, String especie){
        Animal animal;
        if(especie.equals("galinha")){
            animal = new Galinha(nome);
            animais.add(animal);
        }
        else if(especie.equals("aguia")){
            animal = new Aguia(nome);
            animais.add(animal);
        }
    }
    
    //Método para listar animais já cadastrados
    public String listarAnimais(){
        String lista = "Animais do zoológico: \n";
        for(Animal a : animais)
        {lista = lista + a.getNome() + " eh um(a) " + a.getEspecie() + "\n"; }
        return lista;
    }
    
    //Método para buscar e retornar o som emitido por um animal com base no nome recebido por parâmetro 
    public String emitirSom(String nome){
     String som = "som característico: ";
     for(Animal a : animais){
        if(a.getNome().equals(nome)){
          som = som + a.getSom();
        }
     }
     return som;    
    }
    
    //Método para retornar uma descrição longa contendo as caracteristicas de um animal com base no parâmetro recebido
    public String getDescricaoLonga(String nome){
    String descricao = "";
        for(Animal a : animais){
            if(a.getNome().equals(nome)){
               descricao = a.getDescricao(nome);
            }
    }
    return descricao;
   }
}
