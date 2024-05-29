# Diario di bordo - UNO

![Language](https://img.shields.io/badge/Language-Java-red?style=flat)

__Cognome e nome__: Poenariu Gabriel
__Classe__: 4CI
__Data__: 27/02/2024

## Descrizione e regole

Gioco di carte, da 2 a 10 giocatori.

### Carte disponibili

- 76 carte __Basi__ con 19 carte per colore (blu, rosso, giallo, verde)
  Sono numerate dall'1 al 9 (2 serie) più uno 0
- 8 carte __Cambia Giro__ per colore
- 8 carte __Salta Giro__ per colore
- 8 carte __Pesca Due__ per colore
- 4 carte jolly  __Pesca Quattro__
- 4 carte jolly __Cambia Colore__

### Svolgimento partita

Ognuno riceve 7 carte a caso all'inizio della partita.
Una carta viene usata come inizio del __mazzo di scarto__ e il resto va nel __mazzo di pesca__.
Uno alla volta, ogni giocatore può mettere una o più carte sul mazzo di scarto che siano compatibili in base al numero o al colore.
Se il giocatore non ha a disposizione carte adatte da scartare, deve pescarne una dal mazzo di pesca.
Se la carta pescata può essere giocata lo si può fare immediatamente, altrimenti si dichiara di passare il turno al giocatore successivo.
Se si hanno a disposizione carte adatte da scartare non è obbligatorio farlo.
Vince chi per primo riesce a finire tutte le carte che ha a disposizione.

## Motivazioni scelta

La mia idea era quella di lavorare su più giocatori e creare un progetto che mantenesse il modello model-controller-view.
Un gioco di carte come Uno mi sembrava adatto.

## Obiettivi principali

- Finestra per menù
- Finestra per aggiunta giocatori
- Finestra del gioco con il mazzo del giocatore
- Controller che gestisce tutte le finestre
- Fine gioco con un vincitore che finisce le carte

## Obiettivi facoltativi

- Fare in modo che funzioni con giocatori in pc diversi
- Grafica più avanzata con possibili animazioni

# Changelog

## 2023-03-05

- Aggiunte le classi model CartaUno e MazzoUno
- CartaUno formata da attributi colore e valore usando le classi enum
- MazzoUno con il metodo reset che crea un mazzo default del gioco

## 2023-03-12

- Aggiunti metodi alla classe MazzoUno tra cui quello che mescola le carte

## 2023-03-19

- Aggiunta la classe model Gioco
- Contiene gli attributi necessari per la gestione del gioco
- Il costruttore, a cui viene dato un elenco di giocatori, inizializza gli attributi
- Aggiunta la classe Controller che fa partire il gioco

## 2023-03-26

- Aggiunte le classi view Menu e AggiuntaGiocatori
- Aggiunta la classe Uno come main che apre la finestra Menu
- AggiuntaGiocatori crea un oggetto Controller passando la lista di giocatori
- Il Controller passa la lista al Gioco
- Aggiunte classi (JPanel) per lo sfondo delle finestre

## 2023-04-02

- Aggiunta la classe view FinestraGioco
- Eliminata la classe model Gioco
- I suoi metodi e attributi vengono spostati al Controller per semplicità
- Ora la classe Uno crea un oggetto Controller
- Il Controller apre la finestra Menu passando come parametro al costruttore il Controller stesso
- Il Menu passa il Controller alla finestra AggiuntaGiocatori
- I giocatori vengono inseriti uno alla volta chiamando il metodo del Controller addGiocatore()
- In seguito, AggiuntaGiocatori chiama il metodo del Controller startGioco()
- Il Controller apre la finestra FinestraGioco all'avvio del gioco ma è ancora vuota

## 2023-04-09

- Aggiunta la classe Errore e tutta la gestione degli errori in AggiuntaGiocatori
- La finestra FinestraGioco fa vedere le carte del primo giocatori
- Non si possono ancora eseguire operazioni

## 2023-04-16

- Aggiunto l'insieme di combinazioni della compatibilità tra carte

## 2023-04-23

- Aggiunta la possibilità di scartare carte e il passaggio tra giocatori
- Aggiunta schermata "pronto" tra ogni turno per nascondere il mazzo dei giocatori

## 2023-04-30

- Aggiunta la possibilità di pescare carte
- Risoluzione problema del mazzo di carte troppo grande per la finestra
- Risoluzione problemi nello scartare certe carte

## 2023-05-07

- Risoluzione problemi con la pesca causata dai "Pesca Due" o "Pesca Quattro"
- Aggiunta schermata di vittoria
- Miglioramento grafica generale