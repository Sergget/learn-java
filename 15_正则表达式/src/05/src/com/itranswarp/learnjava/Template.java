package com.itranswarp.learnjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Template {

	final String template;
	final Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");

	public Template(String template) {
		this.template = template;
	}

	public String render(Map<String, Object> data) {
		Matcher m = pattern.matcher(template);
		// String re = template;
		StringBuilder sb = new StringBuilder();
		while (m.find()) {
			// String oldSub = template.substring(m.start(), m.end());
			// String newSub = data.get(template.substring(m.start()+2,m.end()-1)).toString();
			// re=re.replace(oldSub,newSub);
			m.appendReplacement(sb, data.get(m.group(1)).toString());
		}
		m.appendTail(sb);
		return sb.toString();
	}

}