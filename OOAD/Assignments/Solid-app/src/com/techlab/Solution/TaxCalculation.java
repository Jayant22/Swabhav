package com.techlab.Solution;

public class TaxCalculation {

	private ILogable log;
	
	public TaxCalculation(ILogable log) {
		this.log = log;
	}
	
	public ILogable getLog() {
		return log;
	}
	
	public int calculation(int amount, int rate) {
		try {
			int r = amount/rate;
			return r;			
		}catch(Exception e){
			log.log(e.getMessage());
			return -1;
		}
		
	}
}
