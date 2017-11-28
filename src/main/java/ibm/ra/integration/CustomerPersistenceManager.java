package ibm.ra.integration;

import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerPersistenceManager {
	 Logger logger = Logger.getLogger(CustomerPersistenceManager.class.getName());
	public String persitenceName="customer";
	
	// EntityManagerFactory instances are heavy weight objects. 
	// Each factory might maintain a metadata cache, object state cache, EntityManager pool, connection pool...
	protected EntityManagerFactory emf;
	private static final CustomerPersistenceManager singleton = new CustomerPersistenceManager();
	public static final boolean DEBUG = true;
	 
	public static CustomerPersistenceManager getInstance() {   
	    return singleton;
	}
	  
	private CustomerPersistenceManager() {
	}
	 
	
	public EntityManagerFactory getEntityManagerFactory() {    
	    if (emf == null)
	      synchronized (singleton) {
	    	  createEntityManagerFactory();
		}
	    return emf;
	}
	  
	public void closeEntityManagerFactory() {	    
	    if (emf != null) {
	      emf.close();
	      emf = null;
	      if (DEBUG)
	          logger.info("@@@@ Persistence manager factory finished at " + new java.util.Date());
	    }
	}
	  
	protected void createEntityManagerFactory() {	    
	   emf = Persistence.createEntityManagerFactory(persitenceName);
	   if (DEBUG)
		   logger.info("@@@@ Persistence manager factory started at " + new java.util.Date());
	}
}