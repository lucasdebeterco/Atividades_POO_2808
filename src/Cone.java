public class Cone {
	
	private float z;
	private float r;
	private int tipo = 3;
	
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		if (z > 0)
			this.z = z;
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		if (r > 0)
			this.r = r;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if ((tipo >= 1) && (tipo <= 3))
			this.tipo = tipo;
	}
	public float areaCirculo() {
		return (float)(3.14 * Math.pow(r, 2));
	}
	public float areaLateral() {
		return (float)(3.14 * r * geratriz());
	}
	public float areaTotal() {
		return (float)(3.14 * r * (r + geratriz()));
	}
	public float geratriz() {
		return (float)(Math.sqrt(Math.pow(z, 2) + Math.pow(r, 2)));
	}
	public float litros() {
		// 3,45 litros por m2
		final float REND = (float)3.45;
		
		return areaTotal() * REND;
	}
	public float latas() {
		// cada lata tem 18 litros de tinta
		final float LITROS_LATA = 18;
		
		return (float)(Math.ceil(litros() / LITROS_LATA)); 
	}
	public float valor() {
		final float T1 = (float)238.90;
		final float T2 = (float)467.98;
		final float T3 = (float)758.34;
		float valor = 0;
		switch (tipo) {
		case 1:
			valor = T1;
			break;
		case 2:
			valor = T2;
			break;
		case 3:
			valor = T3;
			break;
		default:
			valor = T3;
			break;
		}
		return latas() * valor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [z=");
		builder.append(z);
		builder.append(", r=");
		builder.append(r);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", areaCirculo()=");
		builder.append(areaCirculo());
		builder.append(", areaLateral()=");
		builder.append(areaLateral());
		builder.append(", areaTotal()=");
		builder.append(areaTotal());
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", litros()=");
		builder.append(litros());
		builder.append(", latas()=");
		builder.append(latas());
		builder.append(", valor()=");
		builder.append(valor());
		builder.append("]");
		return builder.toString();
	}
	

}
