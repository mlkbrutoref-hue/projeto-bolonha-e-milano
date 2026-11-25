package bolonhaemilano;
public class Nobreza {
 private static final int[] METAS={0,400,550,700,850,1000};
 public int calcularPrestigio(Cidade c){return (int)Math.min(Integer.MAX_VALUE,10L*c.getConstrucoes()+2L*c.getSoldados()+c.getServos()+c.getTerras()/100);}
 public int proximoPrestigio(Cidade c){return METAS[Math.min(5,c.getDono().getNivel()+1)];}
 public boolean verificarPromocao(Cidade c){return !c.getDono().ehMonarca()&&calcularPrestigio(c)>=proximoPrestigio(c)&&c.getDono().promover();}
}