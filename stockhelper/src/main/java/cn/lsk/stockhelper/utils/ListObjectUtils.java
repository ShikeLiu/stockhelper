package cn.lsk.stockhelper.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import cn.lsk.stockhelper.domain.dto.DayPriceDTO;

public class ListObjectUtils {
	public static Integer getIndexOfListDayPriceDTOFromDate(List<DayPriceDTO> dayPrices , Date date) throws ParseException{
		date = DateUtils.getOnlyDay(date);
		Integer k = null;
		for (int i = dayPrices.size()-1; i >= 0; i--) {
			if(date!=null&&date.equals(DateUtils.getOnlyDay(dayPrices.get(i).getTime()))){
				k = i;
				break;
			}
		}
		return k;
		
	}

}
