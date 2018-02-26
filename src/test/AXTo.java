package test;

public class AXTo {

	String SETmethodName;
	Class<?> inputParameterType;

	public AXTo(String methodName, Class<?> inputParameterType) {
		super();
		this.SETmethodName = methodName;
		this.inputParameterType = inputParameterType;
	}

	public String getMethodName() {
		return SETmethodName;
	}

	public void setMethodName(String methodName) {
		this.SETmethodName = methodName;
	}

	public Class<?> getReturnType() {
		return inputParameterType;
	}

	public void setReturnType(Class<?> inputParameterType) {
		this.inputParameterType = inputParameterType;
	}

}
