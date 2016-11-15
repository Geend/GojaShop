
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleProducerLst(ProducerLstView producerLst) throws ModelException;
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleService(ServiceView service) throws ModelException;
    
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.handleService(ownerService);
    }
    public void handleCustomer(CustomerView customer) throws ModelException{
        this.handleService(customer);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.handleService(customerRegisterService);
    }
    public abstract void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    
    public abstract void handleAbstractOrder(AbstractOrderView abstractOrder) throws ModelException;
    
    public void handleOrder(OrderView order) throws ModelException{
        this.handleAbstractOrder(order);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.handleAbstractOrder(preOrder);
    }
    public abstract void handleQuantifiedArticle(QuantifiedArticleView quantifiedArticle) throws ModelException;
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public abstract void handleProducer(ProducerView producer) throws ModelException;
    
    public abstract void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
    public abstract void handleArticleState(ArticleStateView articleState) throws ModelException;
    
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.handleArticleState(notInSale);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.handleArticleState(newCreated);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.handleArticleState(inSale);
    }
    public abstract void handleComponent(ComponentView component) throws ModelException;
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.handleComponent(rootProductGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.handleComponent(article);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.handleComponent(subProductGroup);
    }
    public abstract void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException{
        this.handleArticleWrapper(orderArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException{
        this.handleArticleWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException{
        this.handleArticleWrapper(shoppingCartArticleWrapper);
    }
    
}
