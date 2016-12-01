
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,ArticleWrapperCommandReturnVisitor<R> ,CustomerAccountCommandReturnVisitor<R> ,CustomerDeliveryTimeManagerCommandReturnVisitor<R> ,CustomerOrderManagerCommandReturnVisitor<R> ,CustomerRegisterServiceCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ProductGroupCommandReturnVisitor<R> ,ReOrderManagerCommandReturnVisitor<R> ,ReturnManagerCommandReturnVisitor<R> ,ShoppingCartCommandReturnVisitor<R> ,ShoppingCartQuantifiedArticleCommandReturnVisitor<R> ,SubComponentCommandReturnVisitor<R> {
    
    
}
