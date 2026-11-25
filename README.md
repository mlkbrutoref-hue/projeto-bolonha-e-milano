# Bolonha e Milano
Jogo didático de estratégia medieval em Java, para 1 a 4 jogadores no mesmo terminal. Desenvolva sua cidade entre 1400 e 1410 e alcance o título de Rei/Rainha.

## Compilar e jogar
Requer JDK 8 ou superior, sem bibliotecas externas.
```sh
mkdir -p out
javac -encoding UTF-8 -d out src/bolonhaemilano/*.java
java -cp out bolonhaemilano.Main
```
## Menu
1. Novo jogo
2. Status
3. Mercado
4. Agricultura
5. Governo
6. Construções
7. Encerrar turno
8. Classificação
9. Sobre
0. Sair

Cada cidade começa com 1000 florins, 10000 hectares, 500 grãos e 200 servos. Colha e arrecade uma vez por ano. Alimente a população e invista em construções ou soldados. O prestígio é 10 por construção, 2 por soldado, 1 por servo e 1 por 100 hectares. Só há uma promoção por ano.

## Testes
```sh
java -cp out bolonhaemilano.Testes
```
## Diagramas
- [Classes](uml/classes.md)
- [Sequência](uml/sequencia.md)
- [Casos de uso](casos-de-uso/casos.md)
