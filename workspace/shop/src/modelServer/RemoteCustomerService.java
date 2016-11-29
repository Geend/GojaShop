
package modelServer;


import persistence.*;

public  class RemoteCustomerService extends RemoteService {

	
	public RemoteCustomerService(String connectionName, String userName, PersistentCustomerService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> customerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentCustomerService)this.server).customerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> addToCart(String articleProxiString, String quantityAsString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long quantity = new Long(quantityAsString).longValue();
            ((PersistentCustomerService)this.server).addToCart(article, quantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticleQuantity(String articleProxiString, String newQuantityAsString){
        try {
            PersistentShoppingCartQuantifiedArticle article = (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newQuantity = new Long(newQuantityAsString).longValue();
            ((PersistentCustomerService)this.server).changeArticleQuantity(article, newQuantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> clearError(String errorProxiString){
        try {
            PersistentErrorDisplay error = (PersistentErrorDisplay)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(errorProxiString));
            ((PersistentCustomerService)this.server).clearError(error);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> clear(){
        try {
            ((PersistentCustomerService)this.server).clear();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> deposit(String amountAsString){
        try {
            common.Fraction amount = common.Fraction.parse(amountAsString);
            ((PersistentCustomerService)this.server).deposit(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> findArticle(String name){
        try {
            ((PersistentCustomerService)this.server).findArticle(name);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> order(String cartProxiString, String customerDeliveryTimeProxiString){
        try {
            PersistentShoppingCart cart = (PersistentShoppingCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            PersistentCustomerDeliveryTime customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeProxiString));
            ((PersistentCustomerService)this.server).order(cart, customerDeliveryTime);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.NotEnoughStockException e0){
            return createExceptionResult(e0, this);
        }catch(model.NotEnoughMoneyException e1){
            return createExceptionResult(e1, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> preOrder(String cartProxiString, String customerDeliveryTimeProxiString){
        try {
            PersistentShoppingCart cart = (PersistentShoppingCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            PersistentCustomerDeliveryTime customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeProxiString));
            ((PersistentCustomerService)this.server).preOrder(cart, customerDeliveryTime);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.NotEnoughMoneyException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> removeFromCart(String articleProxiString){
        try {
            PersistentShoppingCartQuantifiedArticle article = (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentCustomerService)this.server).removeFromCart(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> withdraw(String amountAsString){
        try {
            common.Fraction amount = common.Fraction.parse(amountAsString);
            ((PersistentCustomerService)this.server).withdraw(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.NotEnoughMoneyException e0){
            return createExceptionResult(e0, this);
        }
    }
    


}