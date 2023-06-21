package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {
	CalculateDiscount calculateDiscount;

	@Test
	public void initializeToBuyBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<SoftwareDevelopmentBook>();
		double discount = 0;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook("Clean Code (Robert Martin, 2008)");
		sdbList.add(sdbFirstI);
		assertEquals(50.0, calculateDiscount.getTotalPrice(sdbList, discount));
	}

}
