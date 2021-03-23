package cn.yto.customersetward.app.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class AutoRechargeAModeRequest  extends BaseRuquest  {
    private String kCode; //客户编码
    private String kCodeName; //客户编码名称
    private Integer totalNum; //总数量
    private BigDecimal totalAmount; //总金额
    private List<RechargeShopInfo> rechargeShopInfoList; // 店铺明细
    private RechargeThermalPaperInfo rechargeThermalPaperInfo; //热敏纸明细
    private String mdmOrgCustomerInfoId;
    private String rechargeChannel;//支付方式（银行卡：HUIFU, 支付宝：ALIPAY）
    private String rechargeType; //支付渠道（WEB、APP）
    private String orderNo; //订单号（获取支付url）
    @Data
    public static class RechargeShopInfo {
        private String shopId; //店铺ID
        private String shopName; //店铺名称
        private Integer rechargeNum; //充值数量
        private BigDecimal unitPrice;//单价
        private BigDecimal amount;//金额
        private String platformCode;//平台编码
        private String platformName;//平台名称
    }

    @Data
    public static class RechargeThermalPaperInfo {
        private String thermalPaperCode;//热敏纸Code
        private String thermalPaperName;//热敏纸名称
        private Integer rechargeNum;//数量
        private BigDecimal unitPrice;//单价
        private BigDecimal amount;//金额
    }

}
