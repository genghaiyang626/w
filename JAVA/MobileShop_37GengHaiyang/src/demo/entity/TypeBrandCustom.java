package demo.entity;

import java.util.List;

public class TypeBrandCustom extends goods_type {
	private List<Band> bands;

	public List<Band> getBands() {
		return bands;
	}

	public void setBands(List<Band> bands) {
		this.bands = bands;
	}

	@Override
	public String toString() {
		return "TypeBrandCustom [bands=" + bands + ", " + super.toString() + "]";
	}
	
	

}
