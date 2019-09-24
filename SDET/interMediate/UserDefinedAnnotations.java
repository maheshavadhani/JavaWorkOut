package test.practise.intermediate;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {
	String osName() default "Android";

	int version() default 5;
}

@Smartphone(osName = "MAC", version = 10)
class XSeries {
	int size;
	String model;

	public void XSeries(int size, String model) {
		this.size = size;
		this.model = model;
	}
}

class UserDefinedAnnotations extends XSeries {
	public static void main(String[] args) {
		XSeries obj = new XSeries();
		obj.XSeries(3, "XX");
		Class c = obj.getClass(); // Retention API
		Annotation an = c.getAnnotation(Smartphone.class);
		Smartphone S = (Smartphone) an; // typecasting
		System.out.println(S.osName());
	}
}