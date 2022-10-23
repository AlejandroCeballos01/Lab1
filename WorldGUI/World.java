import java.awt.*;



public class World {
    private int width;
    private int height;
    private int numAgents;
    private Agent[] array;
    private int margin;

    //constructor
    public World(int w,int h){
        this.height=h;
        this.width=w;
        this.numAgents=10;
        this.margin = 30;
        array = new Agent[numAgents];
        for( int i = 0; i < numAgents; i++){
            final Vec2D a=randomPos();
            final Vec2D b=randomPos();
            array[i] = new Agent( a.getX(), a.getY(),randomRadius());
            array[i].setTarget(b.getX(), b.getY());
            array[i].setSpeed(1);
        }
    }
    public void simulationStep(){
        for (int i = 0; i<numAgents;i++){
            if (array[i].targetReached() == true){
                final Vec2D a=randomPos();
                array[i].setTarget(a.getX(),a.getY());

            }
            else{
                array[i].updatePosition();
            }
        }

    }
    private Vec2D randomPos(){
        double x = margin + Math.random()+(width - 2*margin);
        double y = margin + Math.random()+(height - 2*margin);
        return new Vec2D(x,y);
    }
    private double randomRadius(){
        return 5 + Math.random() * (margin-5);
    }
    public void paint(Graphics g){

    }


    
}
