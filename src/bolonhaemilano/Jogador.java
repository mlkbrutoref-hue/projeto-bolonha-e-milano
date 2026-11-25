package bolonhaemilano;
public class Jogador {
 private final String nome; private int nivel;
 private static final String[] TITULOS={"Cavaleiro","Barão","Conde","Marquês","Duque","Rei/Rainha"};
 public Jogador(String nome){this.nome=nome;}
 public String getNome(){return nome;} public String getTitulo(){return TITULOS[nivel];} public int getNivel(){return nivel;}
 public boolean promover(){if(ehMonarca())return false; nivel++;return true;} public boolean ehMonarca(){return nivel==5;}
}