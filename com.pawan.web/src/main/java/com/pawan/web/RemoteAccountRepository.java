package com.pawan.web;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * @author Pawan Kumar
 *
 */

@Repository
public class RemoteAccountRepository implements AccountRepository {
	
	private static final String ACCOUNTS_SERVICE_URL = "http://ACCOUNTS-MICROSERVICE";
	
	@Autowired
	protected RestTemplate restTemplate;
	
	/*protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}*/
	
	@Override
	public List<Account> getAllAccounts() {
		Account[] accounts = restTemplate.getForObject(ACCOUNTS_SERVICE_URL+"/accounts", Account[].class);
		return Arrays.asList(accounts);
	}

	@Override
	public Account getAccount(String number) {
		return restTemplate.getForObject(ACCOUNTS_SERVICE_URL + "/accounts/{id}",
				Account.class, number);
	}

}
