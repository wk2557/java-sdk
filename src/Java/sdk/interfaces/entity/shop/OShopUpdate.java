package sdk.interfaces.entity.shop;

/**
 * 店铺的更新参数
 */
public class OShopUpdate {

    /**
     * 店铺地址||"上海市长宁区龙溪路虹桥路1923号"
     */
    private String addressText;


    /**
     * 经纬度，longitude和latitude用英文逗号分隔||"111.223,22.233"
     */
    private String geo;


    /**
     * 配送费||3
     */
    private Short agentFee;


    /**
     * 关店描述信息||"业务繁忙"
     */
    private String closeDescription;


    /**
     * 配送区域说明||"超过5公里，100元起送"
     */
    private String deliverDescription;


    /**
     * 店铺简介||"便宜好吃的小食"
     */
    private String description;


    /**
     * 店铺名称||"烤鸭大王"
     */
    private String name;


    /**
     * 是否接受预定||1
     */
    private Short isBookable;


    /**
     * 店铺营业时间||"10:00-13:00,18:00-21:00"
     *
     * @desc 多个时间用英文逗号分隔
     */
    private String openTime;


    /**
     * 店铺联系电话||"18516307705,13482893679"
     *
     * @desc 多个用英文逗号分隔
     */
    private String phone;


    /**
     * 店铺公告信息||"本周全场半价"
     */
    private String promotionInfo;


    /**
     * 店铺Logo的图片imageHash||"3077080f760e7bf0fc985e23dd3e36e2"
     *
     * @desc 上传图片接口的返回值
     */
    private String logoImageHash;


    /**
     * 是否支持开发票||1
     */
    private Short invoice;


    /**
     * 支持的最小发票金额||100.0
     */
    private Double invoiceMinAmount;


    /**
     * 满xx元免配送费||20
     */
    private Integer noAgentFeeTotal;


    /**
     * 店铺是否有效（上线、下线）||1
     */
    private Short isValid;

    /**
     * 订单打包费||2.0
     *
     * @desc 对于该店铺的每张订单，如果有店铺订单打包费，则采用该值；如果没有，则根据订单中的菜品来决定打包费。注：设置该值为 -1 表示禁用该值。
     */
    private Double packingFee;


    /**
     * 配送范围||
     *
     * @desc #### geoJson说明
     * geo_json的定义参考了 GEOJSON官网 http://geojson.org/ ，当前只支持Polygon一种type
     * 示例如下:
     * <p>
     * ###### 包含跟配送范围相关的属性：
     * 1. 配送范围
     * 2. 起送价
     * 3. 配送费
     * 4. 多时段设置
     * <p>
     * ```javascript
     * "properties": {
     * "delivery_price": 20,   //起送价
     * "area_agent_fee": 3     //配送费
     * "multiPeriod":{		   //多时段
     * "times":[["10:00:00", "23:59:59"]]
     * }
     * }
     * ```
     * <p>
     * #### Json串示例
     * <p>
     * ```javascript
     * [{"geometry": {"type": "Polygon", "coordinates": [[[121.381303, 31.243521], [121.380938, 31.242778], [121.380735, 31.242421], [121.380627, 31.242196], [121.380541, 31.24204], [121.38037, 31.241664], [121.380284, 31.241499], [121.38023, 31.241389], [121.380166, 31.241269], [121.380134, 31.241178], [121.379951, 31.24093], [121.379748, 31.24071], [121.379565, 31.240499], [121.379426, 31.24037], [121.379297, 31.240205], [121.379104, 31.239967], [121.378911, 31.239747], [121.378696, 31.239471], [121.377881, 31.238554], [121.377291, 31.237848], [121.376561, 31.237077], [121.37566, 31.236013], [121.375123, 31.235435], [121.374684, 31.234967], [121.374265, 31.234499], [121.374126, 31.23427], [121.374072, 31.234105], [121.374029, 31.233912], [121.3739, 31.233334], [121.373782, 31.232738], [121.373675, 31.232334], [121.3736, 31.231967], [121.373342, 31.230821], [121.374319, 31.23038], [121.375542, 31.22983], [121.377065, 31.229133], [121.377913, 31.228775], [121.378857, 31.228545], [121.37964, 31.228399], [121.381539, 31.228096], [121.382891, 31.227903], [121.38361, 31.229628], [121.384661, 31.231977], [121.385713, 31.23449], [121.386753, 31.236527], [121.386764, 31.236554], [121.387183, 31.237426], [121.387504, 31.238095], [121.388213, 31.239499], [121.388695, 31.24049], [121.387912, 31.240701], [121.386839, 31.240985], [121.385766, 31.241315], [121.385251, 31.241389], [121.383728, 31.24226], [121.381582, 31.243361], [121.381679, 31.243297], [121.381303, 31.243521]]]}, "type": "Feature", "properties": {"delivery_price": 20, "area_agent_fee": 3}}]
     * <p>
     * ```
     * <p>
     * 可以看出geo_json是一个List，如果一家餐厅有多个多边形配送范围，那么就是多个多边形定义的List
     * 该示例配送范围在「上海普陀区真北路地铁站」附近
     */
    private String deliverGeoJson;

    /**
     * 餐厅外部的唯一标识||8389292348123
     */
    private String openId;

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public Short getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(Short agentFee) {
        this.agentFee = agentFee;
    }

    public String getCloseDescription() {
        return closeDescription;
    }

    public void setCloseDescription(String closeDescription) {
        this.closeDescription = closeDescription;
    }

    public String getDeliverDescription() {
        return deliverDescription;
    }

    public void setDeliverDescription(String deliverDescription) {
        this.deliverDescription = deliverDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getIsBookable() {
        return isBookable;
    }

    public void setIsBookable(Short isBookable) {
        this.isBookable = isBookable;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public String getLogoImageHash() {
        return logoImageHash;
    }

    public void setLogoImageHash(String logoImageHash) {
        this.logoImageHash = logoImageHash;
    }

    public Short getInvoice() {
        return invoice;
    }

    public void setInvoice(Short invoice) {
        this.invoice = invoice;
    }

    public Double getInvoiceMinAmount() {
        return invoiceMinAmount;
    }

    public void setInvoiceMinAmount(Double invoiceMinAmount) {
        this.invoiceMinAmount = invoiceMinAmount;
    }

    public Integer getNoAgentFeeTotal() {
        return noAgentFeeTotal;
    }

    public void setNoAgentFeeTotal(Integer noAgentFeeTotal) {
        this.noAgentFeeTotal = noAgentFeeTotal;
    }

    public Short getIsValid() {
        return isValid;
    }

    public void setIsValid(Short isValid) {
        this.isValid = isValid;
    }

    public Double getPackingFee() {
        return packingFee;
    }

    public void setPackingFee(Double packingFee) {
        this.packingFee = packingFee;
    }

    public String getDeliverGeoJson() {
        return deliverGeoJson;
    }

    public void setDeliverGeoJson(String deliverGeoJson) {
        this.deliverGeoJson = deliverGeoJson;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}