import java.util.ArrayList;
public class Maze{
	public ArrayList<Wall> walls = new ArrayList<Wall>();
	public Maze(){

	}
	void addMazing(Wall newWall){
		walls.add(newWall);
	}
	void addMazing(int x,int y){
		addMazing(new Wall(x,y));
	}
	public boolean checkPos(Location location, int width, int height){
		for(int i = 0; i!=walls.size();i++)
			if(walls.get(i).getX() == location.x && walls.get(i).getY() == location.y)
					return false;
		if(location.x>-1 && location.x<width && location.y>-1 && location.y<height)
			return true;
		return false;
	}
}