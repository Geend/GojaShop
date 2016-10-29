package persistence;



import model.visitor.*;

public class AddSubProductGroupCommandProxi extends PersistentProxi implements PersistentAddSubProductGroupCommand{
    
    public AddSubProductGroupCommandProxi(long objectId) {
        super(objectId);
    }
    public AddSubProductGroupCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 192;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).setName(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ProductGroup4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ProductGroup4Public newValue) throws PersistenceException {
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleAddSubProductGroupCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAddSubProductGroupCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public void accept(ProductGroupCommandVisitor visitor) throws PersistenceException {
        visitor.handleAddSubProductGroupCommand(this);
    }
    public <R> R accept(ProductGroupCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleAddSubProductGroupCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddSubProductGroupCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentAddSubProductGroupCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentAddSubProductGroupCommand)this.getTheObject()).sendResult();
    }

    
}
