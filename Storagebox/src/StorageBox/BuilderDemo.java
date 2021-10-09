package StorageBox;

public class BuilderDemo {
	
	public static void main(String args[]){  
		
		StorageBoxBuilder containerBuilder = new StorageBoxBuilder();
		StorageBoxModel containerModel = containerBuilder.buildhotstorage();
		containerModel.showType();
		System.out.println("\n");
		StorageBoxModel containerModel1= containerBuilder.buildcoldstorage();
		containerModel1.showType();
	}
}
