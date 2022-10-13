
public class Vec2D {
	private double x;
	private double y;

	// constructors
	public Vec2D(double xInit, double yInit) { x = xInit; y = yInit; }
	
	public Vec2D(Vec2D v) { x = v.getX(); y = v.getY(); }

	// getters
	public double getX() { return x; }
	public double getY() { return y; }

	// add or subtract another vector
	public void add     (Vec2D v) { x += v.getX(); y += v.getY(); }
	public void subtract(Vec2D v) { x -= v.getX(); y -= v.getY(); }

	// compute the Euclidean length
	public double length() {
		return Math.sqrt(x * x + y * y);
	}
	
	// normalize to unit length
	public void normalize() {
		double len = length();
		x = x / len;
		y = y / len;
	}
}

