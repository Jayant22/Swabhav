package com.techlab.Violation;

public class TaxCalculation {

	private LogType log;
	
	public TaxCalculation(LogType log) {
		this.log = log;
	}
	
	public LogType getLog() {
		return log;
	}
	
	public int calculation(int amount, int rate) {
		try {
			int r = amount/rate;
			return r;			
		}catch(Exception e){
			if(this.getLog() == LogType.TXT) {
				TxtLogger txtF = new TxtLogger();
				txtF.log(e.getMessage());
				return -1;
			}
			XmlLogger xml = new XmlLogger();
			xml.log(e.getMessage());
			return -1;
		}
		
	}
}
