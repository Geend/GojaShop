
package model.visitor;

import persistence.*;

public interface OrderStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException, E;
    public R handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException, E;
    public R handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException, E;
    public R handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException, E;
    public R handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException, E;
    
}
