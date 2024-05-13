
public class Player {

    private int classType;
    private int width;
    private int height;
    private int x, y;

    public Player(int cT, int xPos, int yPos) {
        classType = cT;
        x = xPos;
        y = yPos;
        width = 50;
        height = 50;
    }

    public int getClassType() {
        return classType;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw(Main window){

    }

}
