package bolonhaemilano;
public class Mercado {
 public boolean comprarGraos(Cidade c,int n){if(n<=0||n>c.getFlorins()/2||n>Integer.MAX_VALUE-c.getGraos())return false;c.removerFlorins(n*2);c.adicionarGraos(n);return true;}
 public boolean venderGraos(Cidade c,int n){if(n<=0||n>c.getGraos()||n>(Integer.MAX_VALUE-c.getFlorins())/2)return false;c.removerGraos(n);c.adicionarFlorins(n*2);return true;}
 public boolean comprarTerras(Cidade c,int n){if(n<=0||n>c.getFlorins()||n>Integer.MAX_VALUE-c.getTerras())return false;c.removerFlorins(n);c.adicionarTerras(n);return true;}
 public boolean venderTerras(Cidade c,int n){if(n<=0||n>c.getTerras()||n>Integer.MAX_VALUE-c.getFlorins())return false;c.removerTerras(n);c.adicionarFlorins(n);return true;}
}