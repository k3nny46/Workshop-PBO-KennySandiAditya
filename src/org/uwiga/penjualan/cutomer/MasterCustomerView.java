package org.uwiga.penjualan.cutomer;

public class MasterCustomerView extends CustomerFrame{
	private MasterCustomerModel model;
	public MasterCustomerView(MasterCustomerModel parModel){
		this.model=parModel;
		initVariable();
		
		initForms();
	}
	public void initVariable(){
		
	}
	public void initForms(){
		
	}

	public void reloadAll() {
		throw new UnsupportedOperationException();
	}

	public void reset() {
		getTextAddress().setText(" ");
		getTextIdCust().setText(" ");
		getTextName().setText(" ");
		getTextTransDate().setText(" ");
		getTextFind().setText(" ");
	}
	public static void main(String[] args) {
		MasterCustomerModel model = new MasterCustomerModel();
		MasterCustomerView f = new MasterCustomerView(model);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}

