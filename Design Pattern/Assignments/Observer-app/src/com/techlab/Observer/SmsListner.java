package com.techlab.Observer;

public class SmsListner implements Listner {

	private Account account;

	public SmsListner(Account account) {
		this.account = account;
		this.account.attach(this);
	}

	@Override
	public void update() {

		System.out.println("SMS Listner Response");

		if (account.isWithdrawed() == true) {
			System.out.println(
					"hello user ....your account no " + account.getAccount_No() + " has been debuted with amount "
							+ account.amount + " on " + account.getCreationDate() + ". Your remaining balance is " + account.getBalance());
			//account.setWithdrawed(false);
		}
		if (account.isDeposited() == true) {
			System.out.println(
					"hello user ....your account no " + account.getAccount_No() + " has been credited with amount "
							+ account.amount + " on " + account.getCreationDate() + ". Your remaining balance is " + account.getBalance());
			//	account.setDeposited(false);
		}
	}

}
