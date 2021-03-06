# Sprint

L'organizzazione agile dettata dal metodo SCRUM è visibile nel Product Backlog presente in "/Documenti/**Sprint e Product Backlog.xlsx"**
che consigliamo di visionare in quanto contiene dettagliatamente quanto è stato fatto durante i vari sprint.

Di seguito riassumiamo per ogni sprint il relativo Sprint Goal:
- **Sprint preliminare:** analisi dei requisiti
- **Sprint 0:** muovere il robot in una determinata cella senza l'uso del planner  &rarr; contiene un JUnit Test
- **Sprint 1:** scansionare la stanza e individuare il tavolo utilizzando il planner
- **Sprint 2:** implementazione di prepare  &rarr; contiene un JUnit Test
- **Sprint 3:** implementazione di clear
- <ins>**Sprint 4:** frigo intelligente</ins> 
- **Sprint 5:** implementazione "add food"
- **Sprint 6:** implementazione "consult"
- **Sprint 7:** implementazione parziale del frontend
- **Sprint 8:** implementazione definitiva del frontend
- **Sprint 9:** implementazione "stop" e "reactivate"
- **Sprint 10:** implementazione "avoid"
- **Sprint 11:** revisione dell'intero progetto

## Note importanti
Il frigo è smart, quindi ha una sua rappresentazione interna ed è in grado di rispondere a domande su di essa. Per comunicare utilizza il protocollo CoAP. In particolare deve essere in grado di: 
- Esporre via CoAP il suo contenuto sullo smartphone del maître
-	Rispondere via CoAP al maître e al robot dato un codice

Data l'esigenza di dover utilizzare il protocollo CoAP e vista la proprietà del frigo di essere intelligente e di avere un proprio software dedicato, si evince che il frigorifero e il resto del sistema devono essere in contesti differenti.

## Estensioni future

Oltre ad alcune estensioni legate al codice e alle feature dell'applicazione, ad ora il progetto è realizzato esclusivamente nell'ambiente virtuale, ma abbiamo già predisposto il nostro **robot fisico equipaggiato di raspberry.**
Potrebbe essere perciò necessario avere altri sprint il cui sprint goal sarebbe appunto quello di implementare su robot fisico l'intero progetto.

### Estensioni Sprint 4

La Dispensa e la lavastoviglie attualmente non è richiesto che siano smart, ma non escludiamo che possano diventarlo in futuro. Una possibile estensione sarebbe quella di rendere anch'esse intelligenti.

