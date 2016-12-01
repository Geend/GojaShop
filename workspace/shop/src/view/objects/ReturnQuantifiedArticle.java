
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ReturnQuantifiedArticle extends view.objects.QuantifiedArticle implements ReturnQuantifiedArticleView{
    
    
    public ReturnQuantifiedArticle(long quantity,ArticleWrapperView article,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((long)quantity,(ArticleWrapperView)article,id, classId);        
    }
    
    static public long getTypeId() {
        return 346;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    
    public void accept(QuantifiedArticleVisitor visitor) throws ModelException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ArticleWrapperView article = this.getArticle();
        if (article != null) {
            ((ViewProxi)article).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(article.getClassId(), article.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 ;
    }
    public boolean isLeaf() throws ModelException {
        return true;
    }
    public int getIndexOfChild(Object child) throws ModelException {
        
        return -1;
    }
    public int getQuantityIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "quantity";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getQuantity());
                rowIndex = rowIndex - 1;
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        if(rowIndex == 0){
            this.setQuantity(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
    }
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
