package my.test.DateUtils.ApacheLang3DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ParseException {
//		Date addDays = DateUtils.addDays(new Date(), -1);
//		System.out.println(DateFormatUtils.format(addDays, "yyyy-MM-dd HH:mm:ss"));
		
//		Date oneHoursAgo = DateUtils.addHours(new Date(), -1);
//		long flagTime = DateUtils.addDays(oneHoursAgo, -1).getTime();
//		int minute = 60;
//		for(int i = 0 ; i < 1440/minute ; i++){
//			//开始时间	2018-06-06 10:30:15
//			long startTime = flagTime + i * (minute * 60 * 1000);
//			//结束时间	2018-06-06 11:30:15,
//			long endTime = flagTime + (i+1) * (minute * 60 * 1000);
//			System.out.println("开始时间:"+DateFormatUtils.format(startTime, "yyyy-MM-dd HH:mm:ss")+",结束时间："+DateFormatUtils.format(endTime, "yyyy-MM-dd HH:mm:ss"));
//		}
//		DateUtils.parseDate("2018-09-13 19:29:20", "yyyy-MM-dd HH:mm:ss");
//		Date ceiling = DateUtils.ceiling(new Date(), Calendar.DATE);
		Date truncate = DateUtils.truncate(new Date(), Calendar.DATE);
//		System.out.println(DateFormatUtils.format(ceiling, "yyyy-MM-dd HH:mm:ss"));
		System.out.println(DateFormatUtils.format(truncate, "yyyy-MM-dd HH:mm:ss"));
	}
}
