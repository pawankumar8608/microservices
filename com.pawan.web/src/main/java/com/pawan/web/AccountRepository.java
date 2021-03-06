/**
 * 
 */
package com.pawan.web;

import java.util.List;

/**
 * @author Pawan Kumar
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
