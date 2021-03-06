# Sprint

L'organizzazione agile dettata dal metodo SCRUM è visibile nel Product Backlog presente in "/Documenti/**Sprint e Product Backlog.xlsx"**
che consigliamo di visionare in quanto contiene dettagliatamente quanto è stato fatto durante i vari sprint.

Di seguito riassumiamo per ogni sprint il relativo Sprint Goal:
- **Sprint preliminare:** analisi dei requisiti
- **Sprint 0:** muovere il robot in una determinata cella senza l'uso del planner &rarr; contiene un JUnit Test
- **Sprint 1:** scansionare la stanza e individuare il tavolo utilizzando il planner
- **Sprint 2:** implementazione di prepare &rarr; contiene un JUnit Test
- **Sprint 3:** implementazione di clear
- **Sprint 4:** frigo intelligente
- **Sprint 5:** implementazione "add food"
- **Sprint 6:** implementazione "consult"
- <ins> **Sprint 7:** implementazione parziale del frontend </ins> &rarr; no interazione con il sistema Qak 
- **Sprint 8:** implementazione definitiva del frontend
- **Sprint 9:** implementazione "stop" e "reactivate"
- **Sprint 10:** implementazione "avoid"
- **Sprint 11:** revisione dell'intero progetto

## Note importanti

In questa prima realizzazione grezza del frontend abbiamo predisposto i bottoni e le viste che ci serviranno per l'interazione con il sistema costruito tramite l'infrastruttura QAK. Per il momento la pagina WEB è a sé stante, i listener degli eventi sono attivi ma non provocano nessuna reazione. 

Per evitare eccezioni legate all'inserimento del food-code da parte dell'utente, nella casella relativa, abbiamo previsto un controllo lato client della stringa per far sì che sia ben formata. Infatti se il codice è nel formato cxxx, l'input è accettato, altrimenti appare una modal che segnala come deve essere il contenuto della stringa.

## Estensioni future

Oltre ad alcune estensioni legate al codice e alle feature dell'applicazione, ad ora il progetto è realizzato esclusivamente nell'ambiente virtuale, ma abbiamo già predisposto il nostro **robot fisico equipaggiato di raspberry.**
Potrebbe essere perciò necessario avere altri sprint il cui sprint goal sarebbe appunto quello di implementare su robot fisico l'intero progetto.
