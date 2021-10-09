package StorageBox;

public class StorageBoxBuilder {
	
	public StorageBoxModel buildcoldstorage() {
		StorageBoxModel model = new StorageBoxModel();
		model.addType(new ColdStorageBox());
		return model;	
	}
	
	public StorageBoxModel buildhotstorage() {
		StorageBoxModel model = new StorageBoxModel();
		model.addType(new HotStorageBox());
		return model;	
	}
}
