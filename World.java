public class World {
    private int width;
    private int height;
    private int numAgents;
    private int agents[];

    //constructor
    public World(int widhtInit, int heightInit, int initAgents, int array[]) {width=widhtInit; height=heightInit; agents=array; numAgents=initAgents;}

    public World(World newWorld) {width=newWorld.getwidth(); height=getHeight();}

    //getters

    public int getHeight() {return height;}
    public int getwidth() {return width;}
    public int getAgents() {return array[];}
    public int getNumAgents() {return numAgents;}



    
}
