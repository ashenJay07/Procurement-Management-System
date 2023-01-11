package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.db.OrderDBUtil;
import com.model.Order;

class JunitTesting {
	
	private OrderDBUtil orderDBUtil = new OrderDBUtil();

	@Test
	void testCase1() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		
		Date date1;
		java.sql.Date sqlOrderDate1 = null;
		
		try {
			date1 = formatter.parse("2022-10-12");
			sqlOrderDate1 = new java.sql.Date(date1.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Order order = new Order();
		
		order.setMaterial("Cement");
		order.setQuantity(34);
		order.setTotAmount(153000.00);
		order.setSiteName("NSB Bank");
		order.setSiteAddress("654 Malabe ");
		order.setOrderDate(sqlOrderDate1);
		
		assertEquals(true, orderDBUtil.placNewOrder(order));
	}
	
	
	@Test
	void testCase2() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		
		Date date1;
		java.sql.Date sqlOrderDate1 = null;
		
		try {
			date1 = formatter.parse("2022-10-29");
			sqlOrderDate1 = new java.sql.Date(date1.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		assertEquals(1, orderDBUtil.selectOrderById(1).getOrderId());
		assertEquals("Cement", orderDBUtil.selectOrderById(1).getMaterial());
		assertEquals(34, orderDBUtil.selectOrderById(1).getQuantity());
		assertEquals(153000.00, orderDBUtil.selectOrderById(1).getTotAmount());
		assertEquals("NSB Bank", orderDBUtil.selectOrderById(1).getSiteName());
		assertEquals(sqlOrderDate1, orderDBUtil.selectOrderById(1).getOrderDate());
	}
	
	
	@Test
	void testCase3() {
		
		assert(1 == orderDBUtil.declineOrder(1));
		
	}
	
	

}
