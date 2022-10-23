import java.awt.*;


public class Agent {
    private Vec2D position;
    private double rad;
    private Vec2D direction;
    private Vec2D target;
    private double speed;
    private boolean arrived;

    //constructor

    public Agent(double posx, double posy, double radio){
        this.rad=radio;
        position= new Vec2D(posx,posy);
    }

    public void setTarget(double tarx,double tary){
        Vec2D target = new Vec2D(tarx,tary);
        Vec2D direction = target;
        direction.subtract(position);
        direction.normalize();
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void updatePosition(){
        final double x= direction.getX()*speed;
        final double y=direction.getY()*speed;
        Vec2D temporal = new Vec2D(x,y);
        position.add(temporal);
    }
    public boolean targetReached(){
        Vec2D difference = new Vec2D(position.getX() - target.getX() , position.getY() - target.getY());
        final double a= difference.length();
        if (rad > a){
            arrived = true;
        }
        return arrived;

    }
   // public void isColliding(){
        //no se como introducir la posicion de los demas agentes del mundo dentro de este agente puesto que no puedo inicialuzar uno aleatorio sino que debe se relacionarse con los agentes dentro del array de la clase World
        //Vec2D collision = new Vec2D(position.getX()- agent.position.getX(), position.getY() - agent.position.getY());

   // }
    public void paint(Graphics g){
        int x = (int)(position.getX()-rad);
        int y = (int)(position.getY()-rad);
        int d = (int)(2*rad);

        g.setColor(Color.RED);
        g.fillOval(x,y,d,d);
    }

    
    
}
