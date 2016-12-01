
package view.visitor;

import view.*;

public interface OrderStateReturnVisitor<R> {
    
    public R handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException;
    public R handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException;
    public R handlePreOrderState(PreOrderStateView preOrderState) throws ModelException;
    public R handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException;
    public R handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException;
    
}
