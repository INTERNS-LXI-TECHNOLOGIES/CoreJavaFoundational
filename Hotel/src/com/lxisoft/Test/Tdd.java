package com.lxisoft.Test;
import com.lxisoft.Hotel.Hotel;
public class Tdd
{
  public static void main (String[] args)
  {
  	Hotel h = new Hotel();
  	h.hotelDetails();
  	h.setHotelMenu();
  	h.searchItems();
  	h.admin();
  	h.orderItem();
  	h.bill();
  }
}