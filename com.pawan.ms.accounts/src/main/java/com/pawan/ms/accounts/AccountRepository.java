/**
 * 
 */
package com.pawan.ms.accounts;

import java.util.List;

/**
 * @author Pawan Kumar
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
