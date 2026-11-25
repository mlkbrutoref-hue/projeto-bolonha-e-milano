package bolonhaemilano;
import java.util.Arrays;
public class Testes {
 private static int aprovados,reprovados;
 private static Cidade cidade(){return new Cidade("Bolonha",new Jogador("Teste"));}
 private static void verificar(String nome,boolean ok){if(ok)aprovados++;else reprovados++;System.out.println((ok?"[OK] ":"[FALHA] ")+nome);}
 public static void main(String[] args){
 Cidade c=cidade();Mercado m=new Mercado();verificar("Compra de grãos",m.comprarGraos(c,10)&&c.getGraos()==510&&c.getFlorins()==980);verificar("Compra inválida",!m.comprarGraos(c,10000)&&c.getFlorins()==980);
 c=cidade();Agricultura a=new Agricultura();verificar("Colheita",a.processarColheita(c)==2000&&c.getGraos()==2000);verificar("Colheita repetida",a.processarColheita(c)==0&&c.getGraos()==2000);verificar("Alimentação",a.distribuirAlimentos(c,20)&&c.getServos()==210);verificar("Percentual inválido",!a.distribuirAlimentos(c,90));
 c=cidade();Governo g=new Governo();verificar("Impostos",g.arrecadarImpostos(c)==20&&c.getFlorins()==1020);verificar("Impostos repetidos",g.arrecadarImpostos(c)==0);verificar("Taxa inválida",!g.definirTaxaImposto(c,51));
 c=cidade();Construcoes b=new Construcoes();verificar("Soldados",b.recrutarSoldados(c,10)&&c.getSoldados()==10&&c.getServos()==190&&c.getFlorins()==950);verificar("Recrutamento recusado",!b.recrutarSoldados(c,500)&&c.getFlorins()==950);verificar("Obras",b.construir(c,10)&&c.getConstrucoes()==10);
 c=cidade();Nobreza n=new Nobreza();verificar("Prestígio inicial",n.calcularPrestigio(c)==300&&!n.verificarPromocao(c));b.construir(c,10);verificar("Promoção",n.verificarPromocao(c)&&c.getDono().getNivel()==1);
 Cidade d=cidade();Partida p=new Partida(Arrays.asList(c,d));verificar("Troca de turno",!p.encerrarTurno()&&p.getCidadeAtual()==d&&p.getAnoAtual()==1400);verificar("Fim de ano",p.encerrarTurno()&&p.getAnoAtual()==1401&&p.getCidadeAtual()==c);verificar("Reinício anual",!c.isColheu()&&!c.isArrecadou());verificar("Recurso negativo recusado",!c.removerGraos(-1)&&!c.removerGraos(99999));
 System.out.printf("Aprovados: %d | Reprovados: %d%n",aprovados,reprovados);if(reprovados>0)System.exit(1);
 }
}