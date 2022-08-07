package org.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;


public class mainClass {
public static void main(String[] args) {
	TestListenerAdapter tla = new TestListenerAdapter();
	TestNG testng = new TestNG();
	//List<String> suites = Lists.newArrayList();
	List<String> suites =new ArrayList<String>();
	suites.add("C:\\Users\\karth\\Desktop\\demoProject\\testng.xml");//path to xml..
	//suites.add("c:/tests/testng2.xml");
	testng.setTestSuites(suites);
	testng.run();
	//Map<String, String> map = new HashMap<>();
	//Demo d =  new Demo();
	//d.test1();

}


}
/*
public static void test() throws ParseException, IOException {
System.out.println("Hello World!");
/*
 * String[] strs= {"Apple", "23", "B", "C", "22", "D"}; int[] indexs = {5,0};
 * ArrayList<String> StringArray = new ArrayList<String>(Arrays.asList(strs));
 * List<Integer> indexes = Arrays.stream(indexs).boxed().toList();
 * System.out.println(StringArray);
 * 
 * // Collections.sort(indices, Collections.reverseOrder());
 * Collections.sort(indexes, Collections.reverseOrder()); for (int i : indexs)
 * StringArray.remove(i);
 * 
 * ArrayList<String> newList = new ArrayList<String>(); for (int i = 0; i
 * <StringArray.size(); i++) { boolean flag = true; for (int j = 0; j <
 * indexs.length; j++) { if(i==indexs[j]) { flag=false; break; } } if(flag)
 * newList.add(StringArray.get(i)); }
 * 
 * 
 * 
 * System.out.println(newList);
 * 
 
Faker faker = new Faker();
String TodayDate = getTodayDate("mm/dd/yyyy");
System.out.println(TodayDate);
SimpleDateFormat form= new  SimpleDateFormat("MM/dd/yyyy");
Date date = faker.date().future(8, TimeUnit.DAYS);
String futureDate = form.format(date);
System.out.println("futureDate : "+faker.friends().character());	
breakl:{
for (int i = 0; i < 5; i++) {
	boolean breakLoop = false;
	for (int j = 0; j < 5; j++) {
		if(i==3) {
			System.out.println(i);
			breakLoop = true;
			break breakl;
		}
	}
	
	System.out.println("outside j loop");
}
}
String todayDate = getTodayDate("yyyy_MM_dd_hh_mm_ss_a");
String fileName = "\\Test_File_" + todayDate +".txt";
String path = System.getProperty("user.dir")+ fileName;
System.out.println("path : "+ path);
File newfile = new File(path);
if(newfile.createNewFile()) {
	System.out.println("File created");
}
else {
	System.out.println("\n\nFile not created xxxxxxxxxx");
}
if(newfile.delete()) {
	System.out.println("\ndeleted successfully");
}

//System.out.println("todayDate : " + todayDate);

ArrayList<String> checkList  = new ArrayList<String>();
System.out.println("checkList "+ checkList);
System.out.println(checkList.isEmpty());

Map<String, String> map = new HashMap<String, String>();
//map.put("vendoN", "1221");
map.put(null, null);
System.out.println(map.isEmpty());
System.out.println(map);

String date1 = "Jul 26 2022 06:32 pm";
SimpleDateFormat formatter =  new SimpleDateFormat("MMM dd yyyy hh:mm aa");
//String date2 = formatter.format(LocalDateTime.now());

String date2 =  getTodayDate("MMM dd yyyy hh:mm a");
System.out.println("date 2 " +date2);
Date d1 = formatter.parse(date1);
Date d2 = formatter.parse(date2);
System.out.println(d1.getMinutes()-d2.getMinutes());

int[] ints = {4, 22, 28, 5, 31, 25, 11, 40, 38, 32, 18, 37, 1, 30, 8, 6, 20, 29, 45, 16, 12, 2, 10, 19, 24, 39};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}

Collections.sort(intList);
System.out.println(intList);
}

public void sampleTest() {
System.out.println("testng test");
}
public static String getTodayDate(String formate) throws ParseException {
//String date = java.time.LocalDate.now().toString();
//DateFormat parser = new SimpleDateFormat("yyyy-mm-dd");
//Date convertedDate = parser.parse(date);
DateTimeFormatter formatter =  DateTimeFormatter.ofPattern(formate);
String date = formatter.format(LocalDateTime.now());
return date;
}
}
*/