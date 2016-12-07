
package model.visitor;

import persistence.*;

public interface UserExceptionReturnVisitor<R> {
    
    public R handleCycleException(model.CycleException cycleException) throws PersistenceException;
    public R handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException;
    public R handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException;
    public R handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException;
    public R handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException;
    public R handleOrderNotYetArrivedException(model.OrderNotYetArrivedException orderNotYetArrivedException) throws PersistenceException;
    public R handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    public R handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException;
    
}
