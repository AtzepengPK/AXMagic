package test;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// new Transform<ClasseA, ClasseB, Mapp>(ClasseA.class);

		// new Transform<ClasseA,ClasseB>(new ClasseA(),new ClasseB()).test();
		//
		// new Map().add
		// new From("get",String.class)
		// new To("set",String.class);
		// .ignoreNull(true);
		//
		//
		//
		// new Transform(FromIstace,ToIstace,Map);

		AXMap map = new AXMap().add(new AXFrom("getTest1", String.class), new AXTo("setTest2", String.class));
		AXConfig conf = new AXConfig().ignoreNull(true);

		ClasseB res = new AXMagic<ClasseA, ClasseB>(map, conf).doIt(new ClasseA("ewq", "", 1, 2, null), new ClasseB());

		System.out.println(res.getTest2());

	}

}
