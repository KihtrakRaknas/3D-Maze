public class Wall{
	Location location;
	public Wall(int x, int y){
		location = new Location(x,y);
	}
	public int getX(){
		return location.x;
	}
	public int getY(){
		return location.y;
	}
	public String toString(){
		return "x: "+ getX()+";y: "+ getY();
	}
}