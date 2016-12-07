
package view.visitor;

import view.*;

public interface UserExceptionExceptionVisitor<E extends view.UserException> {
    
    public void handleCycleException(CycleException cycleException) throws ModelException, E;
    public void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException, E;
    public void handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException, E;
    public void handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException, E;
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException, E;
    public void handleOrderNotYetArrivedException(OrderNotYetArrivedException orderNotYetArrivedException) throws ModelException, E;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException, E;
    
}
