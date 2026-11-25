package bolonhaemilano;
public class Cidade {
 private final String nome; private final Jogador dono;
 private int anoAtual=1400, florins=1000, terras=10000, graos=500, servos=200, soldados=0, construcoes=0, taxaImposto=10;
 private String nivelJustica="Moderada"; private boolean colheu, arrecadou;
 public Cidade(String nome, Jogador dono){this.nome=nome;this.dono=dono;}
 public String getNome(){return nome;} public Jogador getDono(){return dono;} public int getAnoAtual(){return anoAtual;}
 public void avancarAno(){anoAtual++;colheu=false;arrecadou=false;}
 public int getTaxaImposto(){return taxaImposto;} public void setTaxaImposto(int n){if(n>=0&&n<=50)taxaImposto=n;}
 public String getNivelJustica(){return nivelJustica;} public void setNivelJustica(String n){if("Justa".equals(n)||"Moderada".equals(n)||"Severa".equals(n))nivelJustica=n;}
 public boolean isColheu(){return colheu;} public void setColheu(boolean b){colheu=b;} public boolean isArrecadou(){return arrecadou;} public void setArrecadou(boolean b){arrecadou=b;}
 public int getFlorins(){return florins;} public void adicionarFlorins(int n){if(n>0)florins=Math.addExact(florins,n);} public boolean removerFlorins(int n){if(n<0||n>florins)return false;florins-=n;return true;}
 public int getTerras(){return terras;} public void adicionarTerras(int n){if(n>0)terras=Math.addExact(terras,n);} public boolean removerTerras(int n){if(n<0||n>terras)return false;terras-=n;return true;}
 public int getGraos(){return graos;} public void adicionarGraos(int n){if(n>0)graos=Math.addExact(graos,n);} public boolean removerGraos(int n){if(n<0||n>graos)return false;graos-=n;return true;}
 public int getServos(){return servos;} public void adicionarServos(int n){if(n>0)servos=Math.addExact(servos,n);} public boolean removerServos(int n){if(n<0||n>servos)return false;servos-=n;return true;}
 public int getSoldados(){return soldados;} public void adicionarSoldados(int n){if(n>0)soldados=Math.addExact(soldados,n);} public boolean removerSoldados(int n){if(n<0||n>soldados)return false;soldados-=n;return true;}
 public int getConstrucoes(){return construcoes;} public void adicionarConstrucoes(int n){if(n>0)construcoes=Math.addExact(construcoes,n);} public boolean removerConstrucoes(int n){if(n<0||n>construcoes)return false;construcoes-=n;return true;}
 public void exibirStatus(){System.out.printf("%s | %s (%s) | Ano %d%nFlorins: %d | Terras: %d | Grãos: %d | Servos: %d | Soldados: %d | Construções: %d%nImposto: %d%% | Justiça: %s%n",nome,dono.getNome(),dono.getTitulo(),anoAtual,florins,terras,graos,servos,soldados,construcoes,taxaImposto,nivelJustica);}
}