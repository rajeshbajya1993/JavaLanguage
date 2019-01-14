package oops.enumType;

public enum Planet {

	EARTH(11, 12),
	MURCURY(22,3);
	
	Planet(int a, int b){
		mass =a;
		radius=b;
		surfaceGravity=mass/radius;
	}
	
	private final int mass; // In kilograms
	private final int radius; // In meters
	private final int surfaceGravity;
	
	public int mass() { return mass; }
	public int radius() { return radius; }
	public int surfaceGravity() { return surfaceGravity; }
	public int surfaceWeight(int mass) {
	return mass * surfaceGravity; // F = ma
	}
	
}
