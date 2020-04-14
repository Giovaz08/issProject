/* Generated by AN DISI Unibo */ 
package it.unibo.master2

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Master2 ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						utils.backupLastLog(  )
						utils.resetFile( "fileLog"  )
						utils.writeLog( "actorName | [backToCompensate - ] currentPosition | move | result\n"  )
					}
					 transition( edgeName="goto",targetState="startscanningperimeter", cond=doswitch() )
				}	 
				state("startscanningperimeter") { //this:State
					action { //it:State
						println("Inizio scansione della stanza.")
						forward("scanningPerimeter", "scanningPerimeter" ,"roomperimeterexplorer" ) 
					}
					 transition(edgeName="t00",targetState="findtable",cond=whenDispatch("endPerimeter"))
				}	 
				state("findtable") { //this:State
					action { //it:State
						forward("scanningTable", "scanningTable" ,"findtable" ) 
					}
					 transition(edgeName="t11",targetState="endscanning",cond=whenDispatch("endScanningTable"))
				}	 
				state("endscanning") { //this:State
					action { //it:State
						println("Trovata la posizione del tavolo")
						delay(1000) 
						forward("goHome", "goHome(master2)" ,"navi" ) 
					}
					 transition(edgeName="t22",targetState="executePrepare",cond=whenDispatch("homeReached"))
				}	 
				state("executePrepare") { //this:State
					action { //it:State
						delay(500) 
						forward("startPrepare", "startPrepare" ,"prepare" ) 
					}
				}	 
			}
		}
}