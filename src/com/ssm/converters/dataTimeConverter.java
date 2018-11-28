package com.ssm.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class dataTimeConverter implements Converter<String, Date> {

	@Override
	public Date convert(String date) {
		// TODO Auto-generated method stub
		Date newDate=null;
		date=date.replace("T", " ");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");//2018-11-02T12:23
		try {
			newDate=sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newDate;
	}


}
