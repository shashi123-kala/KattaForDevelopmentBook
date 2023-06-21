package com.sdb.tdd;

import java.util.List;

import com.sdb.entity.SoftwareDevelopmentBook;

public class CalculateDiscount {

	public double getTotalPrice(List<SoftwareDevelopmentBook> bookList, double dis) {
		double amtAfterDis = 0.00;
		int n = bookList.size();
		double count = n * 50.00;
		amtAfterDis = count - (count * (dis / 100));
		return amtAfterDis;
	}

}
