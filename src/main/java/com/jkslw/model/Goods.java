package com.jkslw.model;

public class Goods {
    private String Goods_id;
    private String Goods_name;
    private String Shop_price;
    private String Number;

    public Goods(){}

    @Override
    public String toString() {
        return "Goods{" +
                "Goods_id='" + Goods_id + '\'' +
                ", Goods_name='" + Goods_name + '\'' +
                ", Shop_price='" + Shop_price + '\'' +
                ", Number='" + Number + '\'' +
                '}';
    }

    public String getGoods_id() {
        return Goods_id;
    }

    public void setGoods_id(String goods_id) {
        Goods_id = goods_id;
    }

    public String getGoods_name() {
        return Goods_name;
    }

    public void setGoods_name(String goods_name) {
        Goods_name = goods_name;
    }

    public String getShop_price() {
        return Shop_price;
    }

    public void setShop_price(String shop_price) {
        Shop_price = shop_price;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Goods(String goods_id, String goods_name, String shop_price, String number) {
        Goods_id = goods_id;
        Goods_name = goods_name;
        Shop_price = shop_price;
        Number = number;
    }

    public void put(String level, int i) {
    }
}
