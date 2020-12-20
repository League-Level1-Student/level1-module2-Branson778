package _05_minion;

public class Minion {
	private String name; 
		private int eyes; 
		private String color; 
		private String master;
	public Minion(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
this.name=string;
this.eyes=i;
this.color=string2;
this.master=string3;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String smaster) {
		// TODO Auto-generated method stub
		this.master=smaster;
	}
	
	public void setColor(String scolor) {
		// TODO Auto-generated method stub
		this.color=scolor;
	}
	
	public void setEyes(int seyes) {
		// TODO Auto-generated method stub
		this.eyes=seyes;
	}
	
	public void setName(String sname) {
		// TODO Auto-generated method stub
		this.name=sname;
	}

	public String getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

}
