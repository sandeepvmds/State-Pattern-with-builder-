package StorageBox;

public class ColdStorageBox extends StorageBoxContainer{

	@Override
	public String addmaterial() {
		// TODO Auto-generated method stub
		return "Container Buildup with Glace and Tupper Wear";
	}

	@Override
	public String selectsize() {
		// TODO Auto-generated method stub
		return "It is a Small Size";
	}

	@Override
	public String addstate() {
		// TODO Auto-generated method stub
		return "Closed State";
	}

	@Override
	public String addcover() {
		// TODO Auto-generated method stub
		return "Since it is closed container Cover is added in this state";
	}
	
	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Cold Storage Box : You have choose Small Hot container Closed Container";
	}

}
