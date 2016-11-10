package model;

import persistence.*;

public class ToString$Visitor extends model.visitor.ToString$Visitor {

	private String result;
	
	public ToString$Visitor() {
	}
	public synchronized String toString(Anything anything) throws PersistenceException {
		try {
			result = null;
			anything.accept(this);
			if (result == null) {
				this.standardHandling(anything);
			} else {
				if (common.RPCConstantsAndServices.test) 
					result = " " + anything.getClassId() + " , " + anything.getId() + "::  " + result; 
			}
		} catch (Exception ex){
			System.out.println("During toString of " + anything.getClass() + " happened " + ex);
			this.standardHandling(anything);
		}
		return result;
	}
	
	protected void standardHandling(Anything anything) {
		result = anything.getClassId() + ";" + anything.getId();
	}

	@Override
	public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException {
		result = "HERSTELLER (H)"; //TODO! constant
	}

	@Override
	public void handleOwner(Owner4Public owner) throws PersistenceException {

	}


	@Override
	public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
		result = "RESTPOSTENVERKAUF"; //TODO! constant
	}

	@Override
	public void handleServer(Server4Public server) throws PersistenceException {

	}

	@Override
	public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException {
		result = "RootProductGroup (" + rootProductGroup.getName() + ")";
	}

	@Override
	public void handleCustomer(Customer4Public customer) throws PersistenceException {

	}

	@Override
	public void handleArticle(Article4Public article) throws PersistenceException {
		result = "A: " + article.getName(); //TODO! constant
	}

	@Override
	public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
		result = "NICHT VERFÜGBAR"; //TODO! constant
	}

	@Override
	public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException {
		result = "P: " + subProductGroup.getName();
	}

	@Override
	public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException {

	}

	@Override
	public void handleInSale(InSale4Public inSale) throws PersistenceException {
		result = "VERFÜGBAR"; //TODO! constant
	}

	@Override
	public void handleProducer(Producer4Public producer) throws PersistenceException {
		result = "H: " + producer.getName(); //TODO! constant
	}


	@Override
	public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
		result = "NEUER ARTIKEL, NICHT IM VERKAUF"; //TODO! constant
	}
}
