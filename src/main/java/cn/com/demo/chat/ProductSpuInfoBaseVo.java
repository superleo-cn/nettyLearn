package cn.com.demo.chat;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProductSpuInfoBaseVo {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long spuId;
    private Long brandId;
    private String productName;
    private String subtitle;
    private Long originPrice;
    private Long price;
    private String priceUnit;
    private Integer currencyUnit;
    private String posterNormal;
    private String posterHd;
    private String images;
    private String videos;
    private String qualifications;
    private String evaluationReports;
    private String description;
    private String label;
    private String tags;
    private String phoneNumber;
    private String pageOnlineUrl;
    private String extra;
    private Integer status;
    private Integer state;
    private Integer productType;
    private Integer supportPayType;
    private Long freightTemplateId;
    private Long sales;
    private Integer appId;
    private Integer subAppId;
    private String channel;
    private Long ucId;
    private Long shopId;
    private Integer version;
    private Integer isDelete;
    private Date createTime;
    private Date updateTime;
    private String kvJson;
    private String returnData;
    private String platformCategoryIds;
    private String webappUrl;
    private Long stock;
    private Long saleStock;
    private Long lockStock;
    private Long sortIndex;
    private Long virtualSale;
    private String attributeJson;
    private String labelJson;
    private String entityJson;
    private Long bizId;
    private Long passportId;
    private String reason;
    private String specificationOrder;
    private Boolean depositSwitch;
    private Long deposit;
    private Long depositDeductPrice;
    private Long commissionPrice;
    private String path;
    private String from;
    private String programKey;
    private Integer IsCommission;
    private Integer commissionRate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Long originPrice) {
        this.originPrice = originPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Integer getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(Integer currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public String getPosterNormal() {
        return posterNormal;
    }

    public void setPosterNormal(String posterNormal) {
        this.posterNormal = posterNormal;
    }

    public String getPosterHd() {
        return posterHd;
    }

    public void setPosterHd(String posterHd) {
        this.posterHd = posterHd;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getEvaluationReports() {
        return evaluationReports;
    }

    public void setEvaluationReports(String evaluationReports) {
        this.evaluationReports = evaluationReports;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPageOnlineUrl() {
        return pageOnlineUrl;
    }

    public void setPageOnlineUrl(String pageOnlineUrl) {
        this.pageOnlineUrl = pageOnlineUrl;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getSupportPayType() {
        return supportPayType;
    }

    public void setSupportPayType(Integer supportPayType) {
        this.supportPayType = supportPayType;
    }

    public Long getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(Long freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(Integer subAppId) {
        this.subAppId = subAppId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Long getUcId() {
        return ucId;
    }

    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getKvJson() {
        return kvJson;
    }

    public void setKvJson(String kvJson) {
        this.kvJson = kvJson;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    public String getPlatformCategoryIds() {
        return platformCategoryIds;
    }

    public void setPlatformCategoryIds(String platformCategoryIds) {
        this.platformCategoryIds = platformCategoryIds;
    }

    public String getWebappUrl() {
        return webappUrl;
    }

    public void setWebappUrl(String webappUrl) {
        this.webappUrl = webappUrl;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getSaleStock() {
        return saleStock;
    }

    public void setSaleStock(Long saleStock) {
        this.saleStock = saleStock;
    }

    public Long getLockStock() {
        return lockStock;
    }

    public void setLockStock(Long lockStock) {
        this.lockStock = lockStock;
    }

    public Long getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Long sortIndex) {
        this.sortIndex = sortIndex;
    }

    public Long getVirtualSale() {
        return virtualSale;
    }

    public void setVirtualSale(Long virtualSale) {
        this.virtualSale = virtualSale;
    }

    public String getAttributeJson() {
        return attributeJson;
    }

    public void setAttributeJson(String attributeJson) {
        this.attributeJson = attributeJson;
    }

    public String getLabelJson() {
        return labelJson;
    }

    public void setLabelJson(String labelJson) {
        this.labelJson = labelJson;
    }

    public String getEntityJson() {
        return entityJson;
    }

    public void setEntityJson(String entityJson) {
        this.entityJson = entityJson;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSpecificationOrder() {
        return specificationOrder;
    }

    public void setSpecificationOrder(String specificationOrder) {
        this.specificationOrder = specificationOrder;
    }

    public Boolean getDepositSwitch() {
        return depositSwitch;
    }

    public void setDepositSwitch(Boolean depositSwitch) {
        this.depositSwitch = depositSwitch;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getDepositDeductPrice() {
        return depositDeductPrice;
    }

    public void setDepositDeductPrice(Long depositDeductPrice) {
        this.depositDeductPrice = depositDeductPrice;
    }

    public Long getCommissionPrice() {
        return commissionPrice;
    }

    public void setCommissionPrice(Long commissionPrice) {
        this.commissionPrice = commissionPrice;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getProgramKey() {
        return programKey;
    }

    public void setProgramKey(String programKey) {
        this.programKey = programKey;
    }

    public Integer getIsCommission() {
        return IsCommission;
    }

    public void setIsCommission(Integer isCommission) {
        IsCommission = isCommission;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public static void main22(String[] args) {
        GsonBuilder builder = new GsonBuilder();

        // Register an adapter to manage the date types as long values
        builder.registerTypeAdapter(Date.class, new DateTypeAdapter(new SimpleDateFormat("MMM d, yyyy HH:mm:ss a")));

        Gson gson = builder.create();
        for (int i = 0; i <= 10; i++) {
            // String obj = "{\"appId\":5,\"attributeJson\":\"[{\\\"attributeId\\\":24044,\\\"key\\\":\\\"e3623348d276b8fa54e772581fac9cae\\\",\\\"name\\\":\\\"材质\\\",\\\"optionId\\\":76493,\\\"optionValue\\\":\\\"锌合金/梨木/松石\\\"},{\\\"attributeId\\\":24232,\\\"key\\\":\\\"9c5d49bda7000887a8d10670ef1b1ed7\\\",\\\"name\\\":\\\"用途\\\",\\\"optionId\\\":76505,\\\"optionValue\\\":\\\"摆件/礼品/纪念品\\\"}]\",\"bizId\":0,\"brandId\":-1,\"channel\":\"SJH\",\"commissionPrice\":0,\"commissionRate\":0,\"createTime\":1573614463000,\"currencyUnit\":0,\"deposit\":0,\"depositDeductPrice\":0,\"depositSwitch\":false,\"description\":\"[{\\\"id\\\":\\\"item-image-1\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic25a65ecd-b97b-4462-9d78-b71d6622e081.png\\\"]},{\\\"id\\\":\\\"item-image-2\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_picadc9ab8d-40ee-47b8-9ae2-c0e8dc864678.png\\\"]},{\\\"id\\\":\\\"item-image-3\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic03eb3edc-d233-4498-af14-df93c0ac9e52.png\\\"]},{\\\"id\\\":\\\"item-image-4\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic2cffe01a-8273-4c91-8337-fda3f65edb0f.png\\\"]},{\\\"id\\\":\\\"item-image-5\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic298bf627-44f7-42dc-aefd-6e395c8a6d44.png\\\"]}]\",\"entityJson\":\"\",\"evaluationReports\":\"\",\"extra\":\"\",\"freightTemplateId\":0,\"id\":86046,\"images\":\"https://imagelib.cdn.bcebos.com/cip_ml_pic174970b0-1068-4f9a-9da1-426dce12de33.png,https://imagelib.cdn.bcebos.com/cip_ml_picdcda9204-f374-4994-821b-8398af10f2a0.png,https://imagelib.cdn.bcebos.com/cip_ml_pic65339c5b-e7a6-43d8-b084-5f2776c6fb16.png,https://imagelib.cdn.bcebos.com/cip_ml_pic3bc16ce3-d801-4162-b653-53c0086f0198.png\",\"isCommission\":0,\"isDelete\":0,\"kvJson\":\"\",\"label\":\"\",\"labelJson\":\"[{\\\"icon\\\":\\\"\\\",\\\"id\\\":188884,\\\"labelGroup\\\":0,\\\"name\\\":\\\"草原文化\\\",\\\"spuId\\\":1126109,\\\"type\\\":0},{\\\"icon\\\":\\\"\\\",\\\"id\\\":188885,\\\"labelGroup\\\":0,\\\"name\\\":\\\"精品工艺\\\",\\\"spuId\\\":1126109,\\\"type\\\":0},{\\\"icon\\\":\\\"\\\",\\\"id\\\":188886,\\\"labelGroup\\\":0,\\\"name\\\":\\\"寓意深远\\\",\\\"spuId\\\":1126109,\\\"type\\\":0},{\\\"icon\\\":\\\"testicon286\\\",\\\"id\\\":107223,\\\"labelGroup\\\":0,\\\"name\\\":\\\"包邮\\\",\\\"spuId\\\":1126109,\\\"type\\\":404},{\\\"icon\\\":\\\"testicon5\\\",\\\"id\\\":186638,\\\"labelGroup\\\":1,\\\"name\\\":\\\"七天无理由退换\\\",\\\"spuId\\\":1126109,\\\"type\\\":405}]\",\"lockStock\":0,\"originPrice\":280000,\"pageOnlineUrl\":\"https://aisite.wejianzhan.com/site/29361529/b88c788b-4ea9-435e-9734-c2168d272692\",\"passportId\":0,\"path\":\"\",\"phoneNumber\":\"\",\"platformCategoryIds\":\",10127,\",\"posterHd\":\"https://imagelib.cdn.bcebos.com/cip_ml_pic174970b0-1068-4f9a-9da1-426dce12de33.png\",\"posterNormal\":\"https://imagelib.cdn.bcebos.com/cip_ml_pic174970b0-1068-4f9a-9da1-426dce12de33.png\",\"price\":185000,\"priceUnit\":\"\",\"productName\":\"祥运福鞍-草原文化特色工艺品摆件内蒙特色\",\"productType\":0,\"programKey\":\"\",\"qualifications\":\"\",\"reason\":\"\",\"returnData\":\"{\\\"promotionConfig\\\":{\\\"btnComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":0},\\\"countDownComp\\\":{\\\"resetCountDown\\\":false,\\\"switcher\\\":false,\\\"theme\\\":0},\\\"customBottomComp\\\":{\\\"switcher\\\":false},\\\"marqueeComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":1},\\\"reducePromotionComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":1}}}\",\"saleStock\":0,\"sales\":3,\"shopId\":20602,\"sortIndex\":0,\"specificationOrder\":\"\",\"spuId\":1126109,\"state\":1,\"status\":1,\"stock\":10000,\"subAppId\":1,\"subtitle\":\"\",\"supportPayType\":1,\"ucId\":29361529,\"updateTime\":1575535108000,\"version\":1,\"videos\":\"[{\\\"durationInSecond\\\":59,\\\"fileSizeByte\\\":8011889,\\\"files\\\":[{\\\"transcodingPreset\\\":\\\"mp4_720p\\\",\\\"url\\\":\\\"http://hbys92utfs0gqreczvm.exp.bcevod.com/mda-jkcfieu4yvvgx4te/mda-jkcfieu4yvvgx4te.mp4\\\"},{\\\"transcodingPreset\\\":\\\"mp4_1080p\\\",\\\"url\\\":\\\"http://hbys92utfs0gqreczvm.exp.bcevod.com/mda-jkcfieu4yvvgx4te/mp41080p/mda-jkcfieu4yvvgx4te.mp4\\\"},{\\\"transcodingPreset\\\":\\\"mp4_360p\\\",\\\"url\\\":\\\"http://hbys92utfs0gqreczvm.exp.bcevod.com/mda-jkcfieu4yvvgx4te/mp4360p/mda-jkcfieu4yvvgx4te.mp4\\\"}],\\\"heightInPixel\\\":800,\\\"mediaId\\\":\\\"mda-jkcfieu4yvvgx4te\\\",\\\"thumbanial\\\":\\\"http://hbys92utfs0gqreczvm.exp.bcevod.com/mda-jkcfieu4yvvgx4te/mda-jkcfieu4yvvgx4te.jpg\\\",\\\"type\\\":\\\"video\\\",\\\"widthInPixel\\\":800}]\",\"virtualSale\":0,\"webappUrl\":\"baiduboxapp://swan/wv2F0VQZrjbeZEo9phiNFSK8Xvyh8AFt/wjz/bdxd/product-detail/product-detail?pageId=50419267&url=https%3A%2F%2Faisite.wejianzhan.com%2Fsite%2F29361529%2F20334c77-8121-41a8-b10e-20ab9c799d66&spuId=1126109\"}";
            List<Object> collect = new ArrayList<>();
           Object obj = "{\\\"id\\\":99,\\\"spuId\\\":1077501,\\\"brandId\\\":-1,\\\"productName\\\":\\\"人参滴丸1\\\",\\\"subtitle\\\":\\\"人参滴丸减缓疲劳\\\",\\\"originPrice\\\":168000,\\\"price\\\":49800,\\\"priceUnit\\\":\\\"\\\",\\\"currencyUnit\\\":0,\\\"posterNormal\\\":\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic5d2031ac-88e8-422b-af88-e70f228d0407.png\\\",\\\"posterHd\\\":\\\"https://imagelib.cdn.bcebos.com/cip_ml_picf9ab1a5a-8dd2-44d2-88e3-ef5d9bd1ecb6.png\\\",\\\"images\\\":\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic5d2031ac-88e8-422b-af88-e70f228d0407.png\\\",\\\"videos\\\":\\\"\\\",\\\"qualifications\\\":\\\"\\\",\\\"evaluationReports\\\":\\\"\\\",\\\"description\\\":\\\"[{\\\\\\\"id\\\\\\\":\\\\\\\"item-text-2\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"\\\\u003cp\\\\u003e长白山人参滴丸\\\\u003c/p\\\\u003e\\\\u003cp\\\\u003e萃取长白山人参精华，凝结人参营养，缓解身体疲劳。\\\\u003c/p\\\\u003e\\\\u003cp\\\\u003e累了，困了，难受了，浑身没劲。\\\\u003c/p\\\\u003e\\\\u003cp\\\\u003e适合体虚、经常加班熬夜、易疲劳人群、中老年人。\\\\u003c/p\\\\u003e\\\\\\\"},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-3\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_picabc93ab6-3323-4238-80fe-ab330304c0b7.png\\\\\\\"]},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-4\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_picfc2a2dff-08ca-4ffa-8b29-30dde2b34d29.png\\\\\\\"]},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-5\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic7050cb8d-770b-4651-967e-e68b64b74b1b.png\\\\\\\"]},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-6\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic6f3a0741-4ce8-4272-ac36-53439c842e3c.png\\\\\\\"]},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-7\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic3bebcf26-d944-4929-9d66-a2463dd7757c.png\\\\\\\"]},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-8\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_pica8b13968-c512-442e-88ad-dc8dd157c644.png\\\\\\\"]},{\\\\\\\"id\\\\\\\":\\\\\\\"item-image-9\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"list\\\\\\\":[\\\\\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic7b1dab4d-9c02-4ac6-8a67-c466a90a87fb.png\\\\\\\"]}]\\\",\\\"label\\\":\\\"\\\",\\\"tags\\\":\\\"\\\",\\\"phoneNumber\\\":\\\"\\\",\\\"pageOnlineUrl\\\":\\\"https://aisite.wejianzhan.com/site/znhkj13.cn/f389ca17-a29f-41af-b88e-966b88c3ee81\\\",\\\"extra\\\":\\\"\\\",\\\"status\\\":1,\\\"state\\\":1,\\\"productType\\\":0,\\\"supportPayType\\\":2,\\\"freightTemplateId\\\":0,\\\"sales\\\":0,\\\"appId\\\":5,\\\"subAppId\\\":2,\\\"channel\\\":\\\"SJH\\\",\\\"ucId\\\":29221981,\\\"shopId\\\":17912,\\\"version\\\":2,\\\"isDelete\\\":0,\\\"createTime\\\":\\\"Oct 31, 2019 3:54:29 PM\\\",\\\"updateTime\\\":\\\"Oct 31, 2019 4:00:14 PM\\\",\\\"kvJson\\\":\\\"\\\",\\\"returnData\\\":\\\"{\\\\\\\"lunboDuration\\\\\\\":4,\\\\\\\"needSmsCode\\\\\\\":0,\\\\\\\"promotionConfig\\\\\\\":{\\\\\\\"btnComp\\\\\\\":{\\\\\\\"btnFontColor\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"btnLeftContent\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"btnRightContent\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"switcher\\\\\\\":false,\\\\\\\"theme\\\\\\\":1},\\\\\\\"countDownComp\\\\\\\":{\\\\\\\"resetCountDown\\\\\\\":false,\\\\\\\"switcher\\\\\\\":false,\\\\\\\"theme\\\\\\\":0},\\\\\\\"customBottomComp\\\\\\\":{\\\\\\\"background\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"content\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"switcher\\\\\\\":false},\\\\\\\"marqueeComp\\\\\\\":{\\\\\\\"switcher\\\\\\\":false,\\\\\\\"theme\\\\\\\":1},\\\\\\\"reducePromotionComp\\\\\\\":{\\\\\\\"switcher\\\\\\\":false,\\\\\\\"theme\\\\\\\":1}},\\\\\\\"showSales\\\\\\\":0}\\\",\\\"platformCategoryIds\\\":\\\",10239,\\\",\\\"webappUrl\\\":\\\"\\\",\\\"stock\\\":9999999,\\\"saleStock\\\":0,\\\"lockStock\\\":0,\\\"sortIndex\\\":0,\\\"virtualSale\\\":0,\\\"attributeJson\\\":\\\"[{\\\\\\\"attributeId\\\\\\\":7723,\\\\\\\"key\\\\\\\":\\\\\\\"53adc4962213dbd818793211cb849359\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"不适宜人群\\\\\\\",\\\\\\\"optionId\\\\\\\":10579,\\\\\\\"optionValue\\\\\\\":\\\\\\\"少年儿童、孕妇、乳母\\\\\\\"},{\\\\\\\"attributeId\\\\\\\":24760,\\\\\\\"key\\\\\\\":\\\\\\\"b599ef7638b97f0fb366d2602fb3ea6c\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"储藏方法\\\\\\\",\\\\\\\"optionId\\\\\\\":75523,\\\\\\\"optionValue\\\\\\\":\\\\\\\"置阴凉干燥处\\\\\\\"},{\\\\\\\"attributeId\\\\\\\":7927,\\\\\\\"key\\\\\\\":\\\\\\\"c8b4107f1f6c6091da1c494828faff0e\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"适宜人群\\\\\\\",\\\\\\\"optionId\\\\\\\":75524,\\\\\\\"optionValue\\\\\\\":\\\\\\\"易疲劳者\\\\\\\"},{\\\\\\\"attributeId\\\\\\\":7926,\\\\\\\"key\\\\\\\":\\\\\\\"5a7262360e9bd7ccc75013fe155ce5ef\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"保健功能\\\\\\\",\\\\\\\"optionId\\\\\\\":75525,\\\\\\\"optionValue\\\\\\\":\\\\\\\"缓解体力疲劳\\\\\\\"},{\\\\\\\"attributeId\\\\\\\":7999,\\\\\\\"key\\\\\\\":\\\\\\\"ff6855279eeccc6d6f1ff32f40a8e4d4\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"产品名称\\\\\\\",\\\\\\\"optionId\\\\\\\":75526,\\\\\\\"optionValue\\\\\\\":\\\\\\\"人参滴丸\\\\\\\"},{\\\\\\\"attributeId\\\\\\\":7969,\\\\\\\"key\\\\\\\":\\\\\\\"1687c1e18320759b36fcbddd16167878\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"主要原料\\\\\\\",\\\\\\\"optionId\\\\\\\":75527,\\\\\\\"optionValue\\\\\\\":\\\\\\\"人参叶提取物、聚乙二醇4000\\\\\\\"},{\\\\\\\"attributeId\\\\\\\":24761,\\\\\\\"key\\\\\\\":\\\\\\\"d62aaebb2b3845ef429b30da471c5a8e\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"使用方法及用量\\\\\\\",\\\\\\\"optionId\\\\\\\":75528,\\\\\\\"optionValue\\\\\\\":\\\\\\\"每日3次，每次5粒\\\\\\\"}]\\\",\\\"labelJson\\\":\\\"[{\\\\\\\"icon\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":187633,\\\\\\\"labelGroup\\\\\\\":0,\\\\\\\"name\\\\\\\":\\\\\\\"缓解疲劳\\\\\\\",\\\\\\\"spuId\\\\\\\":1077501,\\\\\\\"type\\\\\\\":0},{\\\\\\\"icon\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":187634,\\\\\\\"labelGroup\\\\\\\":0,\\\\\\\"name\\\\\\\":\\\\\\\"货到付款\\\\\\\",\\\\\\\"spuId\\\\\\\":1077501,\\\\\\\"type\\\\\\\":0},{\\\\\\\"icon\\\\\\\":\\\\\\\"testicon286\\\\\\\",\\\\\\\"id\\\\\\\":107223,\\\\\\\"labelGroup\\\\\\\":0,\\\\\\\"name\\\\\\\":\\\\\\\"包邮\\\\\\\",\\\\\\\"spuId\\\\\\\":1077501,\\\\\\\"type\\\\\\\":404}]\\\",\\\"entityJson\\\":\\\"[{\\\\\\\"appId\\\\\\\":5,\\\\\\\"entityId\\\\\\\":\\\\\\\"100330\\\\\\\",\\\\\\\"entityType\\\\\\\":2,\\\\\\\"kvJson\\\\\\\":\\\\\\\"{\\\\\\\\\\\\\\\"sku_package.name\\\\\\\\\\\\\\\":\\\\\\\\\\\\\\\"套餐1\\\\\\\\\\\\\\\"}\\\\\\\",\\\\\\\"shopId\\\\\\\":17912,\\\\\\\"skuId\\\\\\\":1017423943,\\\\\\\"spuId\\\\\\\":1077501,\\\\\\\"type\\\\\\\":0},{\\\\\\\"appId\\\\\\\":5,\\\\\\\"entityId\\\\\\\":\\\\\\\"100330\\\\\\\",\\\\\\\"entityType\\\\\\\":2,\\\\\\\"kvJson\\\\\\\":\\\\\\\"{\\\\\\\\\\\\\\\"sku_package.name\\\\\\\\\\\\\\\":\\\\\\\\\\\\\\\"套餐1\\\\\\\\\\\\\\\"}\\\\\\\",\\\\\\\"shopId\\\\\\\":17912,\\\\\\\"skuId\\\\\\\":1017423943,\\\\\\\"spuId\\\\\\\":1077501,\\\\\\\"type\\\\\\\":0},{\\\\\\\"appId\\\\\\\":5,\\\\\\\"entityId\\\\\\\":\\\\\\\"100330\\\\\\\",\\\\\\\"entityType\\\\\\\":2,\\\\\\\"kvJson\\\\\\\":\\\\\\\"{\\\\\\\\\\\\\\\"sku_package.name\\\\\\\\\\\\\\\":\\\\\\\\\\\\\\\"套餐1\\\\\\\\\\\\\\\"}\\\\\\\",\\\\\\\"shopId\\\\\\\":17912,\\\\\\\"skuId\\\\\\\":1017423943,\\\\\\\"spuId\\\\\\\":1077501,\\\\\\\"type\\\\\\\":0}]\\\",\\\"bizId\\\":0,\\\"passportId\\\":0,\\\"reason\\\":\\\"\\\",\\\"specificationOrder\\\":\\\"\\\",\\\"depositSwitch\\\":false,\\\"deposit\\\":0,\\\"depositDeductPrice\\\":0,\\\"commissionPrice\\\":null,\\\"path\\\":null,\\\"from\\\":null,\\\"programKey\\\":null,\\\"IsCommission\\\":null,\\\"commissionRate\\\":null}";

            collect.add(obj);
            long start1 = System.currentTimeMillis();
            List<ProductSpuInfoBaseVo> spuInfoList = collect.stream()
//                    .map(p -> JSON.parseObject(obj, new TypeReference<ProductSpuInfoBaseVo>() {}))
                    .map(p -> gson.fromJson((String) p, ProductSpuInfoBaseVo.class))
                    .collect(Collectors.toList());
            long spendTime1 = System.currentTimeMillis() - start1;
            System.out.println(spendTime1);
        }
    }

    public static void main22111(String[] args) {
        GsonBuilder builder = new GsonBuilder();

        // Register an adapter to manage the date types as long values
        builder.registerTypeAdapter(Date.class, new DateTypeAdapter(new SimpleDateFormat("MMM d, yyyy HH:mm:ss a")));

        Gson gson = builder.create();
        for (int i = 0; i <= 10; i++) {
            Object obj = "\"{\"id\":99,\"spuId\":1077501,\"brandId\":-1,\"productName\":\"人参滴丸1\",\"subtitle\":\"人参滴丸减缓疲劳\",\"originPrice\":168000,\"price\":49800,\"priceUnit\":\"\",\"currencyUnit\":0,\"posterNormal\":\"https://imagelib.cdn.bcebos.com/cip_ml_pic5d2031ac-88e8-422b-af88-e70f228d0407.png\",\"posterHd\":\"https://imagelib.cdn.bcebos.com/cip_ml_picf9ab1a5a-8dd2-44d2-88e3-ef5d9bd1ecb6.png\",\"images\":\"https://imagelib.cdn.bcebos.com/cip_ml_pic5d2031ac-88e8-422b-af88-e70f228d0407.png\",\"videos\":\"\",\"qualifications\":\"\",\"evaluationReports\":\"\",\"description\":\"[{\\\"id\\\":\\\"item-text-2\\\",\\\"type\\\":\\\"text\\\",\\\"value\\\":\\\"\\u003cp\\u003e长白山人参滴丸\\u003c/p\\u003e\\u003cp\\u003e萃取长白山人参精华，凝结人参营养，缓解身体疲劳。\\u003c/p\\u003e\\u003cp\\u003e累了，困了，难受了，浑身没劲。\\u003c/p\\u003e\\u003cp\\u003e适合体虚、经常加班熬夜、易疲劳人群、中老年人。\\u003c/p\\u003e\\\"},{\\\"id\\\":\\\"item-image-3\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_picabc93ab6-3323-4238-80fe-ab330304c0b7.png\\\"]},{\\\"id\\\":\\\"item-image-4\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_picfc2a2dff-08ca-4ffa-8b29-30dde2b34d29.png\\\"]},{\\\"id\\\":\\\"item-image-5\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic7050cb8d-770b-4651-967e-e68b64b74b1b.png\\\"]},{\\\"id\\\":\\\"item-image-6\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic6f3a0741-4ce8-4272-ac36-53439c842e3c.png\\\"]},{\\\"id\\\":\\\"item-image-7\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic3bebcf26-d944-4929-9d66-a2463dd7757c.png\\\"]},{\\\"id\\\":\\\"item-image-8\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pica8b13968-c512-442e-88ad-dc8dd157c644.png\\\"]},{\\\"id\\\":\\\"item-image-9\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic7b1dab4d-9c02-4ac6-8a67-c466a90a87fb.png\\\"]}]\",\"label\":\"\",\"tags\":\"\",\"phoneNumber\":\"\",\"pageOnlineUrl\":\"https://aisite.wejianzhan.com/site/znhkj13.cn/f389ca17-a29f-41af-b88e-966b88c3ee81\",\"extra\":\"\",\"status\":1,\"state\":1,\"productType\":0,\"supportPayType\":2,\"freightTemplateId\":0,\"sales\":0,\"appId\":5,\"subAppId\":2,\"channel\":\"SJH\",\"ucId\":29221981,\"shopId\":17912,\"version\":2,\"isDelete\":0,\"createTime\":\"Oct 31, 2019 3:54:29 PM\",\"updateTime\":\"Oct 31, 2019 4:00:14 PM\",\"kvJson\":\"\",\"returnData\":\"{\\\"lunboDuration\\\":4,\\\"needSmsCode\\\":0,\\\"promotionConfig\\\":{\\\"btnComp\\\":{\\\"btnFontColor\\\":\\\"\\\",\\\"btnLeftContent\\\":\\\"\\\",\\\"btnRightContent\\\":\\\"\\\",\\\"switcher\\\":false,\\\"theme\\\":1},\\\"countDownComp\\\":{\\\"resetCountDown\\\":false,\\\"switcher\\\":false,\\\"theme\\\":0},\\\"customBottomComp\\\":{\\\"background\\\":\\\"\\\",\\\"content\\\":\\\"\\\",\\\"switcher\\\":false},\\\"marqueeComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":1},\\\"reducePromotionComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":1}},\\\"showSales\\\":0}\",\"platformCategoryIds\":\",10239,\",\"webappUrl\":\"\",\"stock\":9999999,\"saleStock\":0,\"lockStock\":0,\"sortIndex\":0,\"virtualSale\":0,\"attributeJson\":\"[{\\\"attributeId\\\":7723,\\\"key\\\":\\\"53adc4962213dbd818793211cb849359\\\",\\\"name\\\":\\\"不适宜人群\\\",\\\"optionId\\\":10579,\\\"optionValue\\\":\\\"少年儿童、孕妇、乳母\\\"},{\\\"attributeId\\\":24760,\\\"key\\\":\\\"b599ef7638b97f0fb366d2602fb3ea6c\\\",\\\"name\\\":\\\"储藏方法\\\",\\\"optionId\\\":75523,\\\"optionValue\\\":\\\"置阴凉干燥处\\\"},{\\\"attributeId\\\":7927,\\\"key\\\":\\\"c8b4107f1f6c6091da1c494828faff0e\\\",\\\"name\\\":\\\"适宜人群\\\",\\\"optionId\\\":75524,\\\"optionValue\\\":\\\"易疲劳者\\\"},{\\\"attributeId\\\":7926,\\\"key\\\":\\\"5a7262360e9bd7ccc75013fe155ce5ef\\\",\\\"name\\\":\\\"保健功能\\\",\\\"optionId\\\":75525,\\\"optionValue\\\":\\\"缓解体力疲劳\\\"},{\\\"attributeId\\\":7999,\\\"key\\\":\\\"ff6855279eeccc6d6f1ff32f40a8e4d4\\\",\\\"name\\\":\\\"产品名称\\\",\\\"optionId\\\":75526,\\\"optionValue\\\":\\\"人参滴丸\\\"},{\\\"attributeId\\\":7969,\\\"key\\\":\\\"1687c1e18320759b36fcbddd16167878\\\",\\\"name\\\":\\\"主要原料\\\",\\\"optionId\\\":75527,\\\"optionValue\\\":\\\"人参叶提取物、聚乙二醇4000\\\"},{\\\"attributeId\\\":24761,\\\"key\\\":\\\"d62aaebb2b3845ef429b30da471c5a8e\\\",\\\"name\\\":\\\"使用方法及用量\\\",\\\"optionId\\\":75528,\\\"optionValue\\\":\\\"每日3次，每次5粒\\\"}]\",\"labelJson\":\"[{\\\"icon\\\":\\\"\\\",\\\"id\\\":187633,\\\"labelGroup\\\":0,\\\"name\\\":\\\"缓解疲劳\\\",\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"icon\\\":\\\"\\\",\\\"id\\\":187634,\\\"labelGroup\\\":0,\\\"name\\\":\\\"货到付款\\\",\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"icon\\\":\\\"testicon286\\\",\\\"id\\\":107223,\\\"labelGroup\\\":0,\\\"name\\\":\\\"包邮\\\",\\\"spuId\\\":1077501,\\\"type\\\":404}]\",\"entityJson\":\"[{\\\"appId\\\":5,\\\"entityId\\\":\\\"100330\\\",\\\"entityType\\\":2,\\\"kvJson\\\":\\\"{\\\\\\\"sku_package.name\\\\\\\":\\\\\\\"套餐1\\\\\\\"}\\\",\\\"shopId\\\":17912,\\\"skuId\\\":1017423943,\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"appId\\\":5,\\\"entityId\\\":\\\"100330\\\",\\\"entityType\\\":2,\\\"kvJson\\\":\\\"{\\\\\\\"sku_package.name\\\\\\\":\\\\\\\"套餐1\\\\\\\"}\\\",\\\"shopId\\\":17912,\\\"skuId\\\":1017423943,\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"appId\\\":5,\\\"entityId\\\":\\\"100330\\\",\\\"entityType\\\":2,\\\"kvJson\\\":\\\"{\\\\\\\"sku_package.name\\\\\\\":\\\\\\\"套餐1\\\\\\\"}\\\",\\\"shopId\\\":17912,\\\"skuId\\\":1017423943,\\\"spuId\\\":1077501,\\\"type\\\":0}]\",\"bizId\":0,\"passportId\":0,\"reason\":\"\",\"specificationOrder\":\"\",\"depositSwitch\":false,\"deposit\":0,\"depositDeductPrice\":0,\"commissionPrice\":null,\"path\":null,\"from\":null,\"programKey\":null,\"IsCommission\":null,\"commissionRate\":null}\"";
            List<Object> collect = new ArrayList<>();
            collect.add(obj);
            long start1 = System.currentTimeMillis();
            List<ProductSpuInfoBaseVo> spuInfoList = collect.stream()
                    .map(p -> gson.fromJson((String) p, ProductSpuInfoBaseVo.class))
                    .collect(Collectors.toList());
            long spendTime1 = System.currentTimeMillis() - start1;
            System.out.println(spendTime1);
        }
    }

    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();

        // Register an adapter to manage the date types as long values
        builder.registerTypeAdapter(Date.class, new DateTypeAdapter(new SimpleDateFormat("MMM d, yyyy HH:mm:ss a")));
        Gson gson = builder.create();
        for (int i = 0; i <= 10; i++) {
            Object obj = "{\n" +
                    "    \"id\": 99,\n" +
                    "    \"spuId\": 1077501,\n" +
                    "    \"brandId\": -1,\n" +
                    "    \"productName\": \"人参滴丸1\",\n" +
                    "    \"subtitle\": \"人参滴丸减缓疲劳\",\n" +
                    "    \"originPrice\": 168000,\n" +
                    "    \"price\": 49800,\n" +
                    "    \"priceUnit\": \"\",\n" +
                    "    \"currencyUnit\": 0,\n" +
                    "    \"posterNormal\": \"https://imagelib.cdn.bcebos.com/cip_ml_pic5d2031ac-88e8-422b-af88-e70f228d0407.png\",\n" +
                    "    \"posterHd\": \"https://imagelib.cdn.bcebos.com/cip_ml_picf9ab1a5a-8dd2-44d2-88e3-ef5d9bd1ecb6.png\",\n" +
                    "    \"images\": \"https://imagelib.cdn.bcebos.com/cip_ml_pic5d2031ac-88e8-422b-af88-e70f228d0407.png\",\n" +
                    "    \"videos\": \"\",\n" +
                    "    \"qualifications\": \"\",\n" +
                    "    \"evaluationReports\": \"\",\n" +
                    "    \"description\": \"[{\\\"id\\\":\\\"item-text-2\\\",\\\"type\\\":\\\"text\\\",\\\"value\\\":\\\"<p>长白山人参滴丸</p ><p>萃取长白山人参精华，凝结人参营养，缓解身体疲劳。</p ><p>累了，困了，难受了，浑身没劲。</p ><p>适合体虚、经常加班熬夜、易疲劳人群、中老年人。</p >\\\"},{\\\"id\\\":\\\"item-image-3\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_picabc93ab6-3323-4238-80fe-ab330304c0b7.png\\\"]},{\\\"id\\\":\\\"item-image-4\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_picfc2a2dff-08ca-4ffa-8b29-30dde2b34d29.png\\\"]},{\\\"id\\\":\\\"item-image-5\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic7050cb8d-770b-4651-967e-e68b64b74b1b.png\\\"]},{\\\"id\\\":\\\"item-image-6\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic6f3a0741-4ce8-4272-ac36-53439c842e3c.png\\\"]},{\\\"id\\\":\\\"item-image-7\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic3bebcf26-d944-4929-9d66-a2463dd7757c.png\\\"]},{\\\"id\\\":\\\"item-image-8\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pica8b13968-c512-442e-88ad-dc8dd157c644.png\\\"]},{\\\"id\\\":\\\"item-image-9\\\",\\\"type\\\":\\\"image\\\",\\\"list\\\":[\\\"https://imagelib.cdn.bcebos.com/cip_ml_pic7b1dab4d-9c02-4ac6-8a67-c466a90a87fb.png\\\"]}]\",\n" +
                    "    \"label\": \"\",\n" +
                    "    \"tags\": \"\",\n" +
                    "    \"phoneNumber\": \"\",\n" +
                    "    \"pageOnlineUrl\": \"https://aisite.wejianzhan.com/site/znhkj13.cn/f389ca17-a29f-41af-b88e-966b88c3ee81\",\n" +
                    "    \"extra\": \"\",\n" +
                    "    \"status\": 1,\n" +
                    "    \"state\": 1,\n" +
                    "    \"productType\": 0,\n" +
                    "    \"supportPayType\": 2,\n" +
                    "    \"freightTemplateId\": 0,\n" +
                    "    \"sales\": 0,\n" +
                    "    \"appId\": 5,\n" +
                    "    \"subAppId\": 2,\n" +
                    "    \"channel\": \"SJH\",\n" +
                    "    \"ucId\": 29221981,\n" +
                    "    \"shopId\": 17912,\n" +
                    "    \"version\": 2,\n" +
                    "    \"isDelete\": 0,\n" +
                    "    \"createTime\": \"Oct 31, 2019 3:54:29 PM\",\n" +
                    "    \"updateTime\": \"Oct 31, 2019 4:00:14 PM\",\n" +
                    "    \"kvJson\": \"\",\n" +
                    "    \"returnData\": \"{\\\"lunboDuration\\\":4,\\\"needSmsCode\\\":0,\\\"promotionConfig\\\":{\\\"btnComp\\\":{\\\"btnFontColor\\\":\\\"\\\",\\\"btnLeftContent\\\":\\\"\\\",\\\"btnRightContent\\\":\\\"\\\",\\\"switcher\\\":false,\\\"theme\\\":1},\\\"countDownComp\\\":{\\\"resetCountDown\\\":false,\\\"switcher\\\":false,\\\"theme\\\":0},\\\"customBottomComp\\\":{\\\"background\\\":\\\"\\\",\\\"content\\\":\\\"\\\",\\\"switcher\\\":false},\\\"marqueeComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":1},\\\"reducePromotionComp\\\":{\\\"switcher\\\":false,\\\"theme\\\":1}},\\\"showSales\\\":0}\",\n" +
                    "    \"platformCategoryIds\": \",10239,\",\n" +
                    "    \"webappUrl\": \"\",\n" +
                    "    \"stock\": 9999999,\n" +
                    "    \"saleStock\": 0,\n" +
                    "    \"lockStock\": 0,\n" +
                    "    \"sortIndex\": 0,\n" +
                    "    \"virtualSale\": 0,\n" +
                    "    \"attributeJson\": \"[{\\\"attributeId\\\":7723,\\\"key\\\":\\\"53adc4962213dbd818793211cb849359\\\",\\\"name\\\":\\\"不适宜人群\\\",\\\"optionId\\\":10579,\\\"optionValue\\\":\\\"少年儿童、孕妇、乳母\\\"},{\\\"attributeId\\\":24760,\\\"key\\\":\\\"b599ef7638b97f0fb366d2602fb3ea6c\\\",\\\"name\\\":\\\"储藏方法\\\",\\\"optionId\\\":75523,\\\"optionValue\\\":\\\"置阴凉干燥处\\\"},{\\\"attributeId\\\":7927,\\\"key\\\":\\\"c8b4107f1f6c6091da1c494828faff0e\\\",\\\"name\\\":\\\"适宜人群\\\",\\\"optionId\\\":75524,\\\"optionValue\\\":\\\"易疲劳者\\\"},{\\\"attributeId\\\":7926,\\\"key\\\":\\\"5a7262360e9bd7ccc75013fe155ce5ef\\\",\\\"name\\\":\\\"保健功能\\\",\\\"optionId\\\":75525,\\\"optionValue\\\":\\\"缓解体力疲劳\\\"},{\\\"attributeId\\\":7999,\\\"key\\\":\\\"ff6855279eeccc6d6f1ff32f40a8e4d4\\\",\\\"name\\\":\\\"产品名称\\\",\\\"optionId\\\":75526,\\\"optionValue\\\":\\\"人参滴丸\\\"},{\\\"attributeId\\\":7969,\\\"key\\\":\\\"1687c1e18320759b36fcbddd16167878\\\",\\\"name\\\":\\\"主要原料\\\",\\\"optionId\\\":75527,\\\"optionValue\\\":\\\"人参叶提取物、聚乙二醇4000\\\"},{\\\"attributeId\\\":24761,\\\"key\\\":\\\"d62aaebb2b3845ef429b30da471c5a8e\\\",\\\"name\\\":\\\"使用方法及用量\\\",\\\"optionId\\\":75528,\\\"optionValue\\\":\\\"每日3次，每次5粒\\\"}]\",\n" +
                    "    \"labelJson\": \"[{\\\"icon\\\":\\\"\\\",\\\"id\\\":187633,\\\"labelGroup\\\":0,\\\"name\\\":\\\"缓解疲劳\\\",\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"icon\\\":\\\"\\\",\\\"id\\\":187634,\\\"labelGroup\\\":0,\\\"name\\\":\\\"货到付款\\\",\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"icon\\\":\\\"testicon286\\\",\\\"id\\\":107223,\\\"labelGroup\\\":0,\\\"name\\\":\\\"包邮\\\",\\\"spuId\\\":1077501,\\\"type\\\":404}]\",\n" +
                    "    \"entityJson\": \"[{\\\"appId\\\":5,\\\"entityId\\\":\\\"100330\\\",\\\"entityType\\\":2,\\\"kvJson\\\":\\\"{\\\\\\\"sku_package.name\\\\\\\":\\\\\\\"套餐1\\\\\\\"}\\\",\\\"shopId\\\":17912,\\\"skuId\\\":1017423943,\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"appId\\\":5,\\\"entityId\\\":\\\"100330\\\",\\\"entityType\\\":2,\\\"kvJson\\\":\\\"{\\\\\\\"sku_package.name\\\\\\\":\\\\\\\"套餐1\\\\\\\"}\\\",\\\"shopId\\\":17912,\\\"skuId\\\":1017423943,\\\"spuId\\\":1077501,\\\"type\\\":0},{\\\"appId\\\":5,\\\"entityId\\\":\\\"100330\\\",\\\"entityType\\\":2,\\\"kvJson\\\":\\\"{\\\\\\\"sku_package.name\\\\\\\":\\\\\\\"套餐1\\\\\\\"}\\\",\\\"shopId\\\":17912,\\\"skuId\\\":1017423943,\\\"spuId\\\":1077501,\\\"type\\\":0}]\",\n" +
                    "    \"bizId\": 0,\n" +
                    "    \"passportId\": 0,\n" +
                    "    \"reason\": \"\",\n" +
                    "    \"specificationOrder\": \"\",\n" +
                    "    \"depositSwitch\": false,\n" +
                    "    \"deposit\": 0,\n" +
                    "    \"depositDeductPrice\": 0,\n" +
                    "    \"commissionPrice\": null,\n" +
                    "    \"path\": null,\n" +
                    "    \"from\": null,\n" +
                    "    \"programKey\": null,\n" +
                    "    \"IsCommission\": null,\n" +
                    "    \"commissionRate\": null\n" +
                    "}";
            List<Object> collect = new ArrayList<>();
            collect.add(obj);
            long start1 = System.currentTimeMillis();
            List<ProductSpuInfoBaseVo> spuInfoList = collect.stream()
                    .map(p -> gson.fromJson((String) p, ProductSpuInfoBaseVo.class))
                    .collect(Collectors.toList());
            long spendTime1 = System.currentTimeMillis() - start1;
            System.out.println(spendTime1);
        }
    }

}


class DateTypeAdapter implements JsonDeserializer<Date> {

    private DateFormat format;

    public DateTypeAdapter() {

    }

    public DateTypeAdapter(DateFormat format) {

        this.format = format;
    }

    @Override
    public synchronized Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        if (!(json instanceof JsonPrimitive)) {
            throw new JsonParseException("This is not a primitive value");
        }
        String jsonStr = json.getAsString();
        try {
            if (format != null) {
                try {
                    return format.parse(jsonStr);
                } catch (ParseException e) {
                }
            }
        } catch (Exception e) {
        }
        return new Date(Long.parseLong(jsonStr));
    }
}
