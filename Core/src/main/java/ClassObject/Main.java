package ClassObject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Class<Person> clazz = Person.class;
		
		System.out.println("name: "+clazz.getName());
		Field[] fields =clazz.getFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field.getName() +" ---- "+field.getType()+" ---- "+field.getModifiers());
		}
		
		Method[] methods =clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName() +" ---- "+method.getReturnType()+" ---- "+method.getModifiers());

		}
		System.out.println();
		System.out.println();
		System.out.println("--get private field");
		
		Field f;
		try {
			f = clazz.getDeclaredField("id");
			f.setAccessible(true);
			System.out.println(f.getName() +" ---- "+f.getType()+" ---- "+f.getModifiers());
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //NoSuchFieldException
		
	}

}
