package test;

import java.util.function.Function;

public class AXConfig {

	private boolean ignoreNull;
//	Function<String, Integer> converter = new Function<String, Integer>() {
//
//		@Override
//		public Integer apply(String t) {
//			return Integer.parseInt(t);
//		}
//	};

	public AXConfig() {
		this.ignoreNull = false;
	}

	public AXConfig(boolean ignoreNull) {
		this.ignoreNull = ignoreNull;
	}

	public AXConfig ignoreNull(boolean value) {
		this.ignoreNull = value;
		return this;
	}
}
