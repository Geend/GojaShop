
package view.visitor;

import view.*;

public interface AnythingReturnVisitor<R> extends ArticleStateReturnVisitor<R> ,ComponentReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public R handleProducer(ProducerView producer) throws ModelException;
    public R handleProducerLst(ProducerLstView producerLst) throws ModelException;
    public R handleServer(ServerView server) throws ModelException;
    
}
