package persistence;



import model.visitor.*;

public class ProducerLstICProxi extends PersistentInCacheProxiOptimistic implements PersistentProducerLst{
    
    public ProducerLstICProxi(long objectId) {
        super(objectId);
    }
    public ProducerLstICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
            .getProducerLst(this.getId());
    }
    
    public long getClassId() {
        return 210;
    }
    
    public ProducerLst_CurrentProducerProxi getCurrentProducer() throws PersistenceException {
        return ((PersistentProducerLst)this.getTheObject()).getCurrentProducer();
    }
    public PersistentProducerLst getThis() throws PersistenceException {
        return ((PersistentProducerLst)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProducerLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProducerLst(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProducerLst(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProducerLst(this);
    }
    
    
    public void createProducer(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentProducerLst)this.getTheObject()).createProducer(name, invoker);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProducerLst)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProducerLst)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinition, PersistenceException{
        ((PersistentProducerLst)this.getTheObject()).createProducer(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProducerLst)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProducerLst)this.getTheObject()).initializeOnInstantiation();
    }

    
}