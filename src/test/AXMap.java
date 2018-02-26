package test;

import java.util.HashMap;
import java.util.Map;

public class AXMap {

	Map<AXFrom, AXTo> map;

	public AXMap() {
		this.map = new HashMap<AXFrom, AXTo>();
	}

	public AXMap(Map<AXFrom, AXTo> map) {
		super();
		this.map = map;
	}

	public AXMap add(AXFrom f, AXTo t) {
		map.put(f, t);
		return this;
	}

	public AXMap remove(AXFrom f) {
		map.remove(f);
		return this;
	}

}
