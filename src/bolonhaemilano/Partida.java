package bolonhaemilano;
import java.util.*;
public class Partida {
 private final List<Cidade> cidades=new ArrayList<>(); private int vez=0, anoAtual=1400; private final Nobreza nobreza=new Nobreza();
 public Partida(List<Cidade> cidades){if(cidades.size()<1||cidades.size()>4)throw new IllegalArgumentException("1 a 4 cidades");this.cidades.addAll(cidades);}
 public List<Cidade> getCidades(){return Collections.unmodifiableList(cidades);} public Cidade getCidadeAtual(){return cidades.get(vez);} public int getAnoAtual(){return anoAtual;} public int getAnoFinal(){return 1410;}
 public boolean encerrarTurno(){if(terminou())return false;vez++;if(vez<cidades.size())return false;vez=0;encerrarAno();return true;}
 private void encerrarAno(){for(Cidade c:cidades){nobreza.verificarPromocao(c);c.avancarAno();}anoAtual++;}
 public boolean terminou(){return anoAtual>1410||cidades.stream().anyMatch(c->c.getDono().ehMonarca());}
 public Cidade getVencedor(){return cidades.stream().max(Comparator.comparingInt((Cidade c)->c.getDono().getNivel()).thenComparingInt(nobreza::calcularPrestigio)).orElseThrow(IllegalStateException::new);}
}