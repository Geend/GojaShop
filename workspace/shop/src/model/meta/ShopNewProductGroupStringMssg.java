package model.meta;

import persistence.*;

public class ShopNewProductGroupStringMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final String name;
    
    public ShopNewProductGroupStringMssg(String name,
                                         persistence.PersistentShop rcvr){
        this.name = name;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopNewProductGroupStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.newProductGroupImplementation(this.name);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.DoubleDefinitionException, model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.DoubleDefinitionException) throw (model.DoubleDefinitionException) this.excptn;
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
