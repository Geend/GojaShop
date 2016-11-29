package view;

import view.visitor.*;

public interface SubProductGroupView extends SubComponent, ProductGroupView {
    
    public ProductGroupView getParent()throws ModelException;
    public void setParent(ProductGroupView newValue) throws ModelException ;
    
    public void accept(ProductGroupVisitor visitor) throws ModelException;
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(ComponentVisitor visitor) throws ModelException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(SubComponentVisitor visitor) throws ModelException;
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}
