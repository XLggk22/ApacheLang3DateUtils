package my.test.DateUtils.ApacheLang3DateUtils;

public class TestStringsParam {

	public static void main(String[] args) {
		TestStringsParam test = new TestStringsParam();
		test.test01("001","002");
		test.test01(new String[]{"003","004"});
	}
	
	public void test01(String... strings){
		for (int i = 0; i < strings.length; i++) {
			System.out.println("第"+i+"个参数："+strings[i]);
		}
	}
}
