package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import callback.StudentInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String classPath = "callback.StudentInfo";
		try {
			Class c = Class.forName(classPath);
			StudentInfo stu = (StudentInfo) c.newInstance();
			Method mSetter = c.getDeclaredMethod("setInfo", String.class);
			mSetter.setAccessible(true);
			mSetter.invoke(stu, "My name is Weston.");
			Method mGetter = c.getDeclaredMethod("getInfo");
			System.out.println(mGetter.invoke(stu));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
