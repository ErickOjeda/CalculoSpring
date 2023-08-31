package com.pog.count;

import com.pog.count.Entity.Recibo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.pog.count.Service.ReciboService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CountApplicationTests {

	@Test
	public void testMedia() {

		ReciboService service = new ReciboService();

		List<BigDecimal> nums = new ArrayList<BigDecimal>();
		nums.add(new BigDecimal(1));
		nums.add(new BigDecimal(2));
		nums.add(new BigDecimal(10));
		nums.add(new BigDecimal(34));

		assertEquals(new BigDecimal("11.75"), service.media(nums));

	}

	@Test
	public void testMediana(){

		ReciboService service = new ReciboService();

		List<BigDecimal> nums = new ArrayList<BigDecimal>();
		nums.add(new BigDecimal(1));
		nums.add(new BigDecimal(2));
		nums.add(new BigDecimal(10));
		nums.add(new BigDecimal(34));

		assertEquals(new BigDecimal(6), service.mediana(nums));

	}

	@Test
	public void testDesvioPadrao(){

		ReciboService service = new ReciboService();

		List<BigDecimal> nums = new ArrayList<BigDecimal>();
		nums.add(new BigDecimal(1));
		nums.add(new BigDecimal(2));
		nums.add(new BigDecimal(3));
		nums.add(new BigDecimal(4));
		nums.add(new BigDecimal(5));
		nums.add(new BigDecimal(6));
		nums.add(new BigDecimal(7));

		assertEquals(new BigDecimal("2.000"), service.desvioPadrao(nums));
	}

}
