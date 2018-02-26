package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AXMagic<F, T> {

	private AXConfig config;
	private AXMap map;

	public AXMagic(AXMap map, AXConfig config) {
		this.config = config;
		this.map = map;
	}

	public T doIt(F fromIstace, T toIstace) {
		Class from = fromIstace.getClass();
		Class to = toIstace.getClass();
		Method[] mFrom = from.getDeclaredMethods();
		Method[] mTo = to.getDeclaredMethods();

		Stream<Method> fromStreamSupplier = Arrays.asList(mFrom).stream();
		Stream<Method> toStreamSupplier = Arrays.asList(mTo).stream();

		this.map.map.forEach((k, v) -> {
			try {

				if (k.getReturnType() == v.getReturnType()) {
					toStreamSupplier.filter(name -> v.getMethodName().equals(name.getName())).findFirst().get().invoke(
							toIstace, fromStreamSupplier.filter(name -> k.getMethodName().equals(name.getName()))
									.findFirst().get().invoke(fromIstace, null));
				}else {
//					this.config.converter.apply(fromStreamSupplier.filter(name -> k.getMethodName().equals(name.getName()))
//							.findFirst().get().invoke(fromIstace, null));
				}

			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		);

		return toIstace;

	}

	public AXMagic() {
		// this.config = new AXConfig();
	}
}
