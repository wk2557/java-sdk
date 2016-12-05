package me.ele.shop.sdk.interfaces.entity.shop;

import lombok.Data;
import me.ele.shop.sdk.interfaces.enumeration.shop.OBusyLevel;
import me.ele.shop.sdk.interfaces.enumeration.shop.OOrderMode;

import java.util.List;

/**
 * 店铺
 */
@Data
public class OShop {

    /**
     * 店铺Id||968514
     */
    private int id;

    /**
     * 店铺地址||上海市长宁区龙溪路虹桥路1923号
     */
    private String addressText;

    /**
     * 店铺默认配送费||3
     */
    private double agentFee;

    /**
     * 店铺营业状态||busyLevel
     */
    private OBusyLevel busyLevel;

    /**
     * 城市Id||511
     */
    private int cityId;

    /**
     * 城市区号||200097
     */
    private String cityCode;

    /**
     * 店铺关闭的原因||业务繁忙
     */
    private String closeDescription;

    /**
     * 起送价||20
     */
    private double deliverAmount;

    /**
     * 配送区域详情||额外4元配送费
     */
    private String deliverDescription;

    /**
     * 配送范围||详情请咨询饿了么
     */
    private String deliverGeoJson;

    /**
     * 2周内的平均送餐时间||10
     */
    private int deliverSpent;

    /**
     * 店铺描述||便宜好吃的小食
     */
    private String description;

    /**
     * 店铺口味||辣
     */
    private String flavors;

    /**
     * 店铺Logo地址||http://pic.ele.me/321341.jpg
     */
    private String imageUrl;

    /**
     * 是否支持开发票||1
     */
    private int invoice;

    /**
     * 支持的最小发票金额||100.0
     */
    private double invoiceMinAmount;

    /**
     * 是否支持预定(n=0表示不支持预定,7>n>=1表示支持n天内的预定）||1
     *
     * @desc 餐厅的状态可以参考 餐厅营业状态，当餐厅是营业状态的时候，有以下几种情况：
     *
     * ##### 当前时间在营业时间内
     * - 餐厅is_bookable=1（可以预定），则用户下单时可以选择立即送（deliver_time不传），也可以定时送（预订单），但是定时的选项要从餐厅的deliver_times里选择一个
     * - 餐厅is_bookable=0（不可以预定），则用户只能选择立即送
     *
     * ##### 当前时间不在营业时间内
     * - 餐厅is_bookable=1，则用户可以下预订单，预订单的选项从deliver_times里选择一个
     * - 餐厅is_bookable=0，则用户不可以下单，显示餐厅休息中
     */
    private int isBookable;

    /**
     * 营业时间bitmap||000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000
     *
     * @desc open_time_bitmap/book_time_bitmap（营业时间/预定时间）是一个字符串，在判断餐厅是否营业/可预订的时候，将当前的小时h以及当前的分钟m计算出index:
     *
     * ```java
     * index = now.hour * 12 + now.minute / 5
     * ```
     *
     * 然后在open_time_bitmap/book_time_bitmap这个string中取第index个字符，如果是1则餐厅营业/可预订，否则不营业/不可预订:
     *
     * ```java
     * is_open = int(open_time_bitmap[now.hour * 12 + now.minute / 5])
     * ```
     */
    private String openTimeBitmap;

    /**
     * 预定时间bitmap||000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
     *
     * @desc open_time_bitmap/book_time_bitmap（营业时间/预定时间）是一个字符串，在判断餐厅是否营业/可预订的时候，将当前的小时h以及当前的分钟m计算出index:
     *
     * ```java
     * index = now.hour * 12 + now.minute / 5
     * ```
     *
     * 然后在open_time_bitmap/book_time_bitmap这个string中取第index个字符，如果是1则餐厅营业/可预订，否则不营业/不可预订:
     *
     * ```java
     * is_open = int(open_time_bitmap[now.hour * 12 + now.minute / 5])
     * ```
     */
    private String bookTimeBitmap;

    /**
     * 预定时间选项||["19:00:00","19:30:00"],
     */
    private List<String> deliverTimes;

    /**
     * 是否正在营业|1
     */
    private boolean isOpen;


    /**
     * 是否隐藏电话号码||1
     */
    private int isPhoneHidden;


    /**
     * 是否品牌馆餐厅||1
     */
    private int isPremium;

    /**
     * 是否支持超时赔付||1
     */
    private int isTimeEnsure;

    /**
     * 超时赔付详细信息||超60分钟85折。雨天除外。
     */
    private String timeEnsureFullDescription;

    /**
     * 店铺地址坐标-纬度||31.242582
     */
    private double latitude;

    /**
     * 店铺地址坐标-经度||121.56724
     */
    private double longitude;

    /**
     * 店铺接收饿了么短信的手机号码||18516307707
     */
    private String mobile;

    /**
     * 免配送费的最低消费额度||20.0
     */
    private double noAgentFeeTotal;

    /**
     * 店铺评价的列表||[2,0,3,6,66]
     *
     * @desc 依次为1-5星评价的数目
     */
    private List<Short> numRatings;

    /**
     * 订单模式||1
     */
    private OOrderMode oOrderMode;

    /**
     * 是否支持在线支付||1
     */
    private int onlinePayment;

    /**
     * 店铺的联系电话的列表||[18516307705,13482893679]
     */
    private List<String> phones;

    /**
     * 店铺促销文案信息||本店商品均为虚拟商品，只为方便大家体验订餐流程，订单不配送，请各位知悉。
     */
    private String promotionInfo;

    /**
     * 最近一个月美食销量||27522
     */
    private int recentFoodPopularity;

    /**
     * 店铺名称||实验餐厅20号
     */
    private String name;

    /**
     * 店铺手机站url||http://r.ele.me/b3bdj6t87h
     */
    private String mUrl;

    /**
     * 营业时间的列表||[["08:00:00-23:00:00"],["01:00:00-03:00:00"]]
     */
    private List<String> servingTime;

    /**
     * 是否支持在线订餐||true
     */
    private boolean supportOnline;

    /**
     * 自配送餐厅合作类型||1
     */
    private int serviceCategory;

    /**
     * 订单打包费||3.0
     *
     * @desc 对于该店铺的每张订单，如果有店铺订单打包费，则采用该值；如果没有，则根据订单中的菜品来决定打包费。
     */
    private double packingFee;
}