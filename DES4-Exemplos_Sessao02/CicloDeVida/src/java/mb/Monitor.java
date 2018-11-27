/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author razer
 */
public class Monitor implements PhaseListener {
  public void afterPhase(PhaseEvent e) {
     System.out.println("Depois da Fase: " + e.getPhaseId());
  }
  public void beforePhase(PhaseEvent e) {
     System.out.println("Antes da Fase:  " + e.getPhaseId());
  }
  public PhaseId getPhaseId() {
     return PhaseId.ANY_PHASE;
  }
}