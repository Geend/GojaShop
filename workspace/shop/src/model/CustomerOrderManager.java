
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;

import java.util.Iterator;


/* Additional import section end */

public class CustomerOrderManager extends model.OrderManager implements PersistentCustomerOrderManager{
    
    
    public static CustomerOrderManager4Public createCustomerOrderManager(CustomerAccount4Public account) throws PersistenceException{
        return createCustomerOrderManager(account,false);
    }
    
    public static CustomerOrderManager4Public createCustomerOrderManager(CustomerAccount4Public account,boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newDelayedCustomerOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newCustomerOrderManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("account", account);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static CustomerOrderManager4Public createCustomerOrderManager(CustomerAccount4Public account,boolean delayed$Persistence,CustomerOrderManager4Public This) throws PersistenceException {
        PersistentCustomerOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newDelayedCustomerOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newCustomerOrderManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("account", account);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot account = (AbstractPersistentRoot)this.getAccount();
            if (account != null) {
                result.put("account", account.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    account.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && account.hasEssentialFields())account.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerOrderManager provideCopy() throws PersistenceException{
        CustomerOrderManager result = this;
        result = new CustomerOrderManager(this.subService, 
                                          this.This, 
                                          this.account, 
                                          this.getId());
        result.orders = this.orders.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerAccount account;
    
    public CustomerOrderManager(SubjInterface subService,PersistentOrderManager This,PersistentCustomerAccount account,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentOrderManager)This,id);
        this.account = account;        
    }
    
    static public long getTypeId() {
        return 308;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 308) ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
            .newCustomerOrderManager(this.getId());
        super.store();
        if(this.getAccount() != null){
            this.getAccount().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade.accountSet(this.getId(), getAccount());
        }
        
    }
    
    public CustomerAccount4Public getAccount() throws PersistenceException {
        return this.account;
    }
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.account)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.account = (PersistentCustomerAccount)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade.accountSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerOrderManager result = (PersistentCustomerOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerOrderManager)this.This;
    }
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getOrders().getLength() > 0) return 1;
        return 0;
    }
    
    
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerOrderManager)This);
		if(this.isTheSameAs(This)){
			this.setAccount((PersistentCustomerAccount)final$$Fields.get("account"));
		}
    }
    public void newOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewOrderCommand4Public command = model.meta.NewOrderCommand.createNewOrderCommand(now, now);
		command.setCart(cart);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void newPreOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewPreOrderCommand4Public command = model.meta.NewPreOrderCommand.createNewPreOrderCommand(now, now);
		command.setCart(cart);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void newOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.NotEnoughStockException, model.NotEnoughMoneyException, PersistenceException{

        Order4Public order = Order.createOrder(customerDeliveryTime, ActiveOrder.createActiveOrder());
        Iterator<ShoppingCartQuantifiedArticle4Public> iterator = cart.getArticles().iterator();

        Fraction totalPrice = customerDeliveryTime.getPrice();

        while (iterator.hasNext()) {
            ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle = iterator.next();

            shoppingCartQuantifiedArticle.getArticle().getArticle().reduceStock(shoppingCartQuantifiedArticle.getQuantity());

            Fraction perArticlePrice = shoppingCartQuantifiedArticle.getArticle().getArticle().getPrice();

            OrderQuantifiedArticle4Public orderQuantifiedArticle =
                    OrderQuantifiedArticle.createOrderQuantifiedArticle(
                            shoppingCartQuantifiedArticle.getQuantity(),
                            shoppingCartQuantifiedArticle.getArticle(),
                            perArticlePrice);

            totalPrice.add(perArticlePrice.mul(shoppingCartQuantifiedArticle.getQuantity()));
            order.addArticle(orderQuantifiedArticle);
        }

        if(getThis().getAccount().getBalance().isLess(totalPrice)){
            throw new NotEnoughMoneyException("Nicht genug Geld");
        }

        getThis().getOrders().add(order);

    }
    public void newPreOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.NotEnoughMoneyException, PersistenceException{
        //TODO: implement method: newPreOrder
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}