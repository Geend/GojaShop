
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopArticleWrapper extends model.ArticleWrapper implements PersistentShopArticleWrapper{
    
    
    public static PersistentShopArticleWrapper createShopArticleWrapper() throws PersistenceException{
        return createShopArticleWrapper(false);
    }
    
    public static PersistentShopArticleWrapper createShopArticleWrapper(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopArticleWrapperFacade
                .newDelayedShopArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopArticleWrapperFacade
                .newShopArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopArticleWrapper createShopArticleWrapper(boolean delayed$Persistence,PersistentShopArticleWrapper This) throws PersistenceException {
        PersistentShopArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopArticleWrapperFacade
                .newDelayedShopArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopArticleWrapperFacade
                .newShopArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShopArticleWrapper provideCopy() throws PersistenceException{
        ShopArticleWrapper result = this;
        result = new ShopArticleWrapper(this.article, 
                                        this.This, 
                                        this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public ShopArticleWrapper(PersistentArticle article,PersistentArticleWrapper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentArticle)article,(PersistentArticleWrapper)This,id);        
    }
    
    static public long getTypeId() {
        return 161;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 161) ConnectionHandler.getTheConnectionHandler().theShopArticleWrapperFacade
            .newShopArticleWrapper(this.getId());
        super.store();
        
    }
    
    public PersistentShopArticleWrapper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopArticleWrapper result = (PersistentShopArticleWrapper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopArticleWrapper)this.This;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleShopArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopArticleWrapper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShopArticleWrapper)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void addToCart(final long amount) 
				throws PersistenceException{
        //TODO: implement method: addToCart
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
