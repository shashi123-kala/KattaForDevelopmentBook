package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {
	CalculateDiscount calculateDiscount;

	@Test
	public void initializeToBuyBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		assertNotNull(calculateDiscount);
	}

}
