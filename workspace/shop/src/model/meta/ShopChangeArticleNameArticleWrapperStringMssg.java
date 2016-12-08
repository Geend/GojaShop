package model.meta;

import persistence.*;

public class ShopChangeArticleNameArticleWrapperStringMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.ArticleWrapper4Public article;
    public final String newName;
    
    public ShopChangeArticleNameArticleWrapperStringMssg(persistence.ArticleWrapper4Public article,
                                                         String newName,
                                                         persistence.PersistentShop rcvr){
        this.article = article;
        this.newName = newName;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopChangeArticleNameArticleWrapperStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeArticleNameImplementation(this.article, this.newName);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
