package bolonhaemilano;
public class Agricultura {
 public int processarColheita(Cidade c){if(c.isColheu())return 0;long area=Math.min(c.getTerras(),5L*c.getServos()); if(area/2>c.getGraos())area=2L*c.getGraos(); area=Math.min(area,(Integer.MAX_VALUE-c.getGraos())/2L); int sementes=(int)(area/2), producao=(int)(area*2);c.removerGraos(sementes);c.adicionarGraos(producao);c.setColheu(true);return producao;}
 public boolean distribuirAlimentos(Cidade c,int percentual){if(percentual<20||percentual>80)return false;int comida=(int)((long)c.getGraos()*percentual/100), necessidade=c.getServos()/5;c.removerGraos(comida);if(comida>=necessidade)c.adicionarServos(Math.min(c.getServos()/20,Integer.MAX_VALUE-c.getServos()));else c.removerServos(Math.min(c.getServos(),necessidade-comida));return true;}
}