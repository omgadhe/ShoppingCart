package com.inautix;

import java.util.ArrayList;

public class CartController {

	ArrayList<CartItemBean> items = new ArrayList<CartItemBean>();
	public void addCartItem(int id, String name, String desc, int quantity, int unitPrice) {
	  CartItemBean cartItemBean=new CartItemBean();
	  cartItemBean.setId(id);
	  cartItemBean.setName(name);
	  cartItemBean.setDesc(desc);
	  cartItemBean.setQuantity(quantity);
	  cartItemBean.setUntiPrice(unitPrice);
	  items.add(cartItemBean);
	}
}
