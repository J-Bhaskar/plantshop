package com.Spring.services;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.Spring.models.orderTransactionDetails;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;


@Service("orderservices")
public class orderServices {
private static final String KEY="rzp_test_xkug0x6IGfBzNO";
private static final String KEY_SECRET="iLEryrOJesc7uGsnM9YvCfJy";
	
private static final String CURRENCY="INR";


public orderTransactionDetails orderCreateTransaction(double amount)
{
try {
JSONObject jsonObject=new JSONObject();
jsonObject.put("amount", amount*100);
jsonObject.put("currency", CURRENCY);
RazorpayClient razorpayClient=new RazorpayClient(KEY, 
KEY_SECRET);
Order order= razorpayClient.orders.create(jsonObject);
return orderTransaction(order);
} catch (Exception e) {
// TODO Auto-generated catch block
System.out.println(e.getMessage());
}
return null;
}


private orderTransactionDetails orderTransaction(Order order)
{
String orderid=order.get("id");
String currency=order.get("currency");
int amount=order.get("amount");
orderTransactionDetails orderTransactionDetails=new
orderTransactionDetails(orderid, currency, amount,KEY);
return orderTransactionDetails;
}
}

