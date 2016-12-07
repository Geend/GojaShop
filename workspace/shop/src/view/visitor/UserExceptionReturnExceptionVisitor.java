
package view.visitor;

import view.*;

public interface UserExceptionReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCycleException(CycleException cycleException) throws ModelException, E;
    public R handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException, E;
    public R handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException, E;
    public R handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException, E;
    public R handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException, E;
    public R handleOrderNotYetArrivedException(OrderNotYetArrivedException orderNotYetArrivedException) throws ModelException, E;
    public R handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    public R handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException, E;
    
}
