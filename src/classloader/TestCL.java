package classloader;

/*
 * BootStrap Loader -Load system classes(jre/lib/re.jar)
 *					|
 *					--ExtClassLoader -Load extend classes(jar/lib/ext/*.jar)
 *						|
 *						--AppClassLoader - Load Application classed(classpath & jar) * 
 */
public class TestCL {
	public static void main(String[] args) {
		ClassLoader clApp = TestCL.class.getClassLoader();
		System.out.println(clApp);
		ClassLoader clExt = clApp.getParent();
		System.out.println(clExt);
		ClassLoader clBoot = clExt.getParent();
		System.out.println(clBoot);
	}

}
