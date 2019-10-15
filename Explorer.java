public class Explorer{
	public Location location;
	public int direction = 1;//0=NORTH
	public Explorer(int x, int y){
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
	public void forward(){
		if(direction == 0){
			location.y-=1;
		}else if(direction == 1){
			location.x+=1;
		}else if(direction == 2){
			location.y+=1;
		}else if(direction == 3){
			location.x-=1;
		}
	}
	public Location forwardPos(){
		int x = location.x;
		int y = location.y;
		if(direction == 0){
			y-=1;
		}else if(direction == 1){
			x+=1;
		}else if(direction == 2){
			y+=1;
		}else if(direction == 3){
			x-=1;
		}
		return new Location(x,y);
	}
	public void right(){
		direction++;
		direction=direction%4;
	}
	public void left(){
		direction--;
		if(direction==-1)
			direction=3;
	}
}