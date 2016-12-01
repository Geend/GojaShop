
package view.visitor;

import view.*;

public abstract class OrderStateStandardVisitor implements OrderStateVisitor {
    
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException{
        this.standardHandling(preOrderState);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException{
        this.standardHandling(finishedOrderState);
    }
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException{
        this.standardHandling(processingOrderState);
    }
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException{
        this.standardHandling(inTransitOrderState);
    }
    protected abstract void standardHandling(OrderStateView orderState) throws ModelException;
}
