package com.db;

import java.util.HashMap;

import com.db.Impl.PriceListenerImpl;
import com.db.Impl.PriceSourceImpl;
import com.db.Interface.PriceListener;
import com.db.Interface.PriceSource;

public class ProductSourceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriceSource pricesouce= new PriceSourceImpl();
		
		HashMap hashmap=new HashMap();
		PriceListener pricelistener=new PriceListenerImpl();
		pricelistener.priceUpdate("IBM", 100);
		

	}

}
