package mer.mano.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int SupplierId;
	String SupplierName;
	String SupplierDescription;
	public int getSupplierID() 
	{
		return SupplierId;
	}
	public void setSupplierID(int supplierID) {
		SupplierId = supplierID;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupplierDescription() {
		return SupplierDescription;
	}
	public void setSupplierDescription(String supplierDescription) {
		SupplierDescription = supplierDescription;
	}

}
