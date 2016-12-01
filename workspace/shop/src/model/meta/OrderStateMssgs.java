package model.meta;

public interface OrderStateMssgs {
    void accept(OrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderStateDOWNMssgs extends Mssgs, OrderStateMssgs{}
interface OrderStateUPMssgs extends PreOrderStateUPMssgs, ProcessingOrderStateUPMssgs, FinishedOrderStateUPMssgs, WaitingForAcceptOrderStateUPMssgs, InTransitOrderStateUPMssgs, OrderStateMssgs{}
