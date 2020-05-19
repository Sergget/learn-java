package com.itranswarp.learnjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Time {

	/**
	 * 从"21:05:19"中提取时，分，秒，否则抛出IllegalArgumentException
	 */
	public static int[] parseTime(String s) {
		if(s==null||s.isEmpty()){throw new IllegalArgumentException();}
		Pattern p = Pattern.compile("([01]\\d|2[0-3])\\:([0-5]\\d)\\:([0-5]\\d)");
		Matcher m = p.matcher(s);
		if (m.matches()) {
			return new int[]{Integer.parseInt(m.group(1)),Integer.parseInt(m.group(2)),Integer.parseInt(m.group(3))};
		}
		throw new IllegalArgumentException();
	}
}
