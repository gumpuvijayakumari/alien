package example.firstproj;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int lid;
	private String brandString;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrandString() {
		return brandString;
	}
	public void setBrandString(String brandString) {
		this.brandString = brandString;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brandString=" + brandString + "]";
	}
	
	public void compile()
	{
		System.out.println("compiling");
	}

}
