package com.nom.radarloans.recreqt;

public class RecReqtApprove implements RecurringReqt{

	public static void main(String[] args) {
		RecReqtApprove Apr=new RecReqtApprove();
		Apr.addition();
		Apr.deletion();

	}

	@Override
	public void addition() {
		System.out.println("This is an overridden addition of recurrig reqt");
		
	}

	@Override
	public void deletion() {
		System.out.println("This is an overridden deletion of recurrig reqt");
		
	}

}
