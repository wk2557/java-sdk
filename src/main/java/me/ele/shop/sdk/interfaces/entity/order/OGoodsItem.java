package me.ele.shop.sdk.interfaces.entity.order;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 篮子商品
 */
@Data
public class OGoodsItem {

    /**
     * 商品Id||27970000058
     */
    private long id;

    /**
     * 商品名称||奶茶
     */
    private String name = "";

    /**
     * 商品分类Id||26940000135
     */
    private long categoryId = 0;

    /**
     * 商品单价||9
     */
    private double price = 0.0;

    /**
     * 商品数量||2
     */
    private int quantity = 0;

    /**
     * 总价||18
     */
    private double total = 0.0;

    /**
     * 商品配菜的列表||
     */
    private List<OGoodsAddition> additions = new ArrayList<>();

}