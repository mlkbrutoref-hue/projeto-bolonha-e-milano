package bolonhaemilano;
public class Construcoes {
 public boolean recrutarSoldados(Cidade c,int n){if(n<=0||n>c.getFlorins()/5||n>c.getServos()||n>Integer.MAX_VALUE-c.getSoldados())return false;c.removerFlorins(n*5);c.removerServos(n);c.adicionarSoldados(n);return true;}
 public boolean construir(Cidade c,int n){if(n<=0||n>c.getFlorins()/20||n>Integer.MAX_VALUE-c.getConstrucoes())return false;c.removerFlorins(n*20);c.adicionarConstrucoes(n);return true;}
}