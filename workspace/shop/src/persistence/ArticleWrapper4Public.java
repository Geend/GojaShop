package persistence;


import model.visitor.*;

public interface ArticleWrapper4Public extends SubComponent, Component4Public {
    
    public Article4Public getArticle() throws PersistenceException ;
    
    public void accept(ComponentVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException;
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubComponentVisitor visitor) throws PersistenceException;
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void changeArticleName(final String newName) 
				throws PersistenceException;
    public void changeArticleName(final String newName, final Invoker invoker) 
				throws PersistenceException;
    public void changePrice(final common.Fraction newPrice, final Invoker invoker) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException;
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException;
    public void changeArticleNameImplementation(final String newName) 
				throws PersistenceException;
    public void changePrice(final common.Fraction newPrice) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public common.Fraction getPrice() 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}
