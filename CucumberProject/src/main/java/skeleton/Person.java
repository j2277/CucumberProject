package skeleton;

public class Person {
	private int distance;
	private String message;
	
	public void setDistance(Integer distance ) {
		if(distance>0&&distance<30)
		{
			this.distance=distance;
		}
	}
	
	public void setMessage(String message) {
		if(distance>0&&distance<30) {
		this.message=message;
		}
		else
		{
			this.message=null;
		}
	}
	public String getMessage() {
		return this.message;
	}

}
