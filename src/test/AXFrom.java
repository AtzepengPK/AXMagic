package test;

public class AXFrom {

	String GETmethodName;
	Class<?> returnType;

	public AXFrom(String GETmethodName, Class<?> returnType) {
		super();
		this.GETmethodName = GETmethodName;
		this.returnType = returnType;
	}

	public String getMethodName() {
		return GETmethodName;
	}

	public void setMethodName(String methodName) {
		this.GETmethodName = methodName;
	}

	public Class<?> getReturnType() {
		return returnType;
	}

	public void setReturnType(Class<?> returnType) {
		this.returnType = returnType;
	}

}
