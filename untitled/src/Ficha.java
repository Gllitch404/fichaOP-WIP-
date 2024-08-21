public class Ficha {
    private String nomeChar;
    private String nomePlayer;
    private int[] atributos = new int[5]; //AGI - 0 | INT - 1 | VIG - 2 | PRE - 3 | FOR - 4 |
    private String patente; //Talvez seja util usar uma classe pra isso tambem.
    private Classe classeDaFicha;
    private Trilha trilhaDaFicha;
    private int hitPoints, sanity, pontosDeEsforco;
    private int[] experiencia = new int[2]; //NEX e NIVEL, se a ficha usar a mecaica
                                            //de nivel usar a segunda var para nivel
    private int usaNivel; //0 - não | 1 - sim

}
