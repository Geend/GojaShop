package persistence;


import model.visitor.*;

public interface NewArticleCommand4Public extends ProductGroupCommand, Anything, CommonDate4Public, AbstractPersistentProxi {
    
    public String getName() throws PersistenceException ;
    public void setName(String newValue) throws PersistenceException ;
    public common.Fraction getPrice() throws PersistenceException ;
    public void setPrice(common.Fraction newValue) throws PersistenceException ;
    public long getMinStock() throws PersistenceException ;
    public void setMinStock(long newValue) throws PersistenceException ;
    public long getMaxStock() throws PersistenceException ;
    public void setMaxStock(long newValue) throws PersistenceException ;
    public long getProducerDeliveryTime() throws PersistenceException ;
    public void setProducerDeliveryTime(long newValue) throws PersistenceException ;
    public Producer4Public getProducer() throws PersistenceException ;
    public void setProducer(Producer4Public newValue) throws PersistenceException ;
    public Invoker getInvoker() throws PersistenceException ;
    public void setInvoker(Invoker newValue) throws PersistenceException ;
    public ProductGroup4Public getCommandReceiver() throws PersistenceException ;
    public void setCommandReceiver(ProductGroup4Public newValue) throws PersistenceException ;
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException;
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ProductGroupCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ProductGroupCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ProductGroupCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ProductGroupCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(CommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void checkException() 
				throws model.UserException, PersistenceException;
    public void execute() 
				throws PersistenceException;
    public void sendException(final PersistenceException exception) 
				throws PersistenceException;
    public void sendResult() 
				throws PersistenceException;

}
