package bolonhaemilano;
public class Governo {
 public boolean definirTaxaImposto(Cidade c,int n){if(n<0||n>50)return false;c.setTaxaImposto(n);return true;}
 public boolean definirNivelJustica(Cidade c,String n){if(!"Justa".equals(n)&&!"Moderada".equals(n)&&!"Severa".equals(n))return false;c.setNivelJustica(n);return true;}
 public int arrecadarImpostos(Cidade c){if(c.isArrecadou())return 0;long base=(long)c.getServos()*c.getTaxaImposto()/100;double fator="Justa".equals(c.getNivelJustica())?0.8:"Severa".equals(c.getNivelJustica())?1.3:1.0;int valor=(int)Math.min(base*fator,Integer.MAX_VALUE-c.getFlorins());c.adicionarFlorins(valor);c.setArrecadou(true);return valor;}
}