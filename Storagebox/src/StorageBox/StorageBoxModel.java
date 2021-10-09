package StorageBox;

import java.util.ArrayList;
import java.util.List;

public class StorageBoxModel {
	
	private List<StorageBoxType> type = new ArrayList<StorageBoxType>();
	
	public void addType(StorageBoxType containertype) {
		type.add(containertype);
	}
	
	public void getcover() {
		for(StorageBoxType containertype : type ) {
			containertype.addcover();
		}
	}
	public void getstate() {
		for(StorageBoxType containertype : type ) {
			containertype.addstate();
		}
	}
	public void getsize() {
		for(StorageBoxType containertype : type ) {
			containertype.selectsize();
		}
	}
	public void getMaterial() {
		for(StorageBoxType containertype : type ) {
			containertype.addmaterial();
		}
	}
	
	public void showType() {
		for(StorageBoxType containertype : type ) {
			System.out.println("Container Type:" +containertype.type());
			System.out.println("Cover State :" +containertype.addcover());
			System.out.println("Size State :" +containertype.selectsize());
			System.out.println("Material State :" +containertype.addmaterial());
			System.out.println("State State :" +containertype.addstate());
		}
	}

	
}
