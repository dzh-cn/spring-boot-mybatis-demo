package spring.demo.boot.mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 产品表
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
//@TableName("abs_mall_product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 产品id
	 */
//    @TableId(value = "product_id", type = IdType.AUTO)
	private Integer productId;
	/**
	 * 产品的-security_id
	 */
	private Integer securityId;
	/**
	 * 产品状态
	 */
	private String assetPoolStatus;
	/**
	 * 发行状态
	 */
	private String ipoStatus;
	/**
	 * 上架状态
	 */
	private String newIssueStatus;
	/**
	 * 基础资产类型
	 */
	private String underlyingAssetType;
	/**
	 * 发行金额
	 */
	private BigDecimal contractValue;
	/**
	 * 备案确认函
	 */
	private String registrationId;
	/**
	 * 备案日期
	 */
	private Date registrationDate;
	/**
	 * 产品设立日
	 */
	private Date listDate;
	/**
	 * 循环期开始日
	 */
	private Date revolvingStartDate;
	/**
	 * 摊还期开始日
	 */
	private Date amortizingStartDate;
	/**
	 * 法定到期日
	 */
	private Date legalMaturityDate;
	/**
	 * 循环购买
	 */
	private Integer assetRecycle;
	/**
	 * 首次偿付日
	 */
	private Date firstPaymentDate;
	/**
	 * 簿记建档日
	 */
	private Date bookBuildingDate;
	/**
	 * 挂牌转让日
	 */
	private Date listingTransfterDate;
	/**
	 * 创建人
	 */
	private String createdBy;
	/**
	 * 修改人
	 */
	private String lastModifiedBy;
	/**
	 * 创建时间
	 */
	private Date createdDate;
	/**
	 * 修改时间
	 */
	private Date modifiedDate;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 是否首页展示，1是，0否
	 */
	private Integer promoted;
	/**
	 * 还本方式(过手摊还/固定摊还)
	 */
	private String amortizationType;
	/**
	 * 摊还期期限
	 */
	private String amortizationLength;
	/**
	 * 监管机构code
	 */
	private String regulatorCode;
	/**
	 * 到期日
	 */
	private Date maturityDate;
	/**
	 * 起期日
	 */
	private Date carryDate;
	/**
	 * 通过日
	 */
	private Date approveDate;


	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSecurityId() {
		return securityId;
	}

	public void setSecurityId(Integer securityId) {
		this.securityId = securityId;
	}

	public String getAssetPoolStatus() {
		return assetPoolStatus;
	}

	public void setAssetPoolStatus(String assetPoolStatus) {
		this.assetPoolStatus = assetPoolStatus;
	}

	public String getIpoStatus() {
		return ipoStatus;
	}

	public void setIpoStatus(String ipoStatus) {
		this.ipoStatus = ipoStatus;
	}

	public String getNewIssueStatus() {
		return newIssueStatus;
	}

	public void setNewIssueStatus(String newIssueStatus) {
		this.newIssueStatus = newIssueStatus;
	}

	public String getUnderlyingAssetType() {
		return underlyingAssetType;
	}

	public void setUnderlyingAssetType(String underlyingAssetType) {
		this.underlyingAssetType = underlyingAssetType;
	}

	public BigDecimal getContractValue() {
		return contractValue;
	}

	public void setContractValue(BigDecimal contractValue) {
		this.contractValue = contractValue;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getListDate() {
		return listDate;
	}

	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}

	public Date getRevolvingStartDate() {
		return revolvingStartDate;
	}

	public void setRevolvingStartDate(Date revolvingStartDate) {
		this.revolvingStartDate = revolvingStartDate;
	}

	public Date getAmortizingStartDate() {
		return amortizingStartDate;
	}

	public void setAmortizingStartDate(Date amortizingStartDate) {
		this.amortizingStartDate = amortizingStartDate;
	}

	public Date getLegalMaturityDate() {
		return legalMaturityDate;
	}

	public void setLegalMaturityDate(Date legalMaturityDate) {
		this.legalMaturityDate = legalMaturityDate;
	}

	public Integer getAssetRecycle() {
		return assetRecycle;
	}

	public void setAssetRecycle(Integer assetRecycle) {
		this.assetRecycle = assetRecycle;
	}

	public Date getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public Date getBookBuildingDate() {
		return bookBuildingDate;
	}

	public void setBookBuildingDate(Date bookBuildingDate) {
		this.bookBuildingDate = bookBuildingDate;
	}

	public Date getListingTransfterDate() {
		return listingTransfterDate;
	}

	public void setListingTransfterDate(Date listingTransfterDate) {
		this.listingTransfterDate = listingTransfterDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPromoted() {
		return promoted;
	}

	public void setPromoted(Integer promoted) {
		this.promoted = promoted;
	}

	public String getAmortizationType() {
		return amortizationType;
	}

	public void setAmortizationType(String amortizationType) {
		this.amortizationType = amortizationType;
	}

	public String getAmortizationLength() {
		return amortizationLength;
	}

	public void setAmortizationLength(String amortizationLength) {
		this.amortizationLength = amortizationLength;
	}

	public String getRegulatorCode() {
		return regulatorCode;
	}

	public void setRegulatorCode(String regulatorCode) {
		this.regulatorCode = regulatorCode;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Date getCarryDate() {
		return carryDate;
	}

	public void setCarryDate(Date carryDate) {
		this.carryDate = carryDate;
	}

	public Date getApproveDate() {
		return approveDate;
	}

	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("\"productId\":")
				.append(productId);
		sb.append(",\"securityId\":")
				.append(securityId);
		sb.append(",\"assetPoolStatus\":\"")
				.append(assetPoolStatus).append('\"');
		sb.append(",\"ipoStatus\":\"")
				.append(ipoStatus).append('\"');
		sb.append(",\"newIssueStatus\":\"")
				.append(newIssueStatus).append('\"');
		sb.append(",\"underlyingAssetType\":\"")
				.append(underlyingAssetType).append('\"');
		sb.append(",\"contractValue\":")
				.append(contractValue);
		sb.append(",\"registrationId\":\"")
				.append(registrationId).append('\"');
		sb.append(",\"registrationDate\":\"")
				.append(registrationDate).append('\"');
		sb.append(",\"listDate\":\"")
				.append(listDate).append('\"');
		sb.append(",\"revolvingStartDate\":\"")
				.append(revolvingStartDate).append('\"');
		sb.append(",\"amortizingStartDate\":\"")
				.append(amortizingStartDate).append('\"');
		sb.append(",\"legalMaturityDate\":\"")
				.append(legalMaturityDate).append('\"');
		sb.append(",\"assetRecycle\":")
				.append(assetRecycle);
		sb.append(",\"firstPaymentDate\":\"")
				.append(firstPaymentDate).append('\"');
		sb.append(",\"bookBuildingDate\":\"")
				.append(bookBuildingDate).append('\"');
		sb.append(",\"listingTransfterDate\":\"")
				.append(listingTransfterDate).append('\"');
		sb.append(",\"createdBy\":\"")
				.append(createdBy).append('\"');
		sb.append(",\"lastModifiedBy\":\"")
				.append(lastModifiedBy).append('\"');
		sb.append(",\"createdDate\":\"")
				.append(createdDate).append('\"');
		sb.append(",\"modifiedDate\":\"")
				.append(modifiedDate).append('\"');
		sb.append(",\"remark\":\"")
				.append(remark).append('\"');
		sb.append(",\"promoted\":")
				.append(promoted);
		sb.append(",\"amortizationType\":\"")
				.append(amortizationType).append('\"');
		sb.append(",\"amortizationLength\":\"")
				.append(amortizationLength).append('\"');
		sb.append(",\"regulatorCode\":\"")
				.append(regulatorCode).append('\"');
		sb.append(",\"maturityDate\":\"")
				.append(maturityDate).append('\"');
		sb.append(",\"carryDate\":\"")
				.append(carryDate).append('\"');
		sb.append(",\"approveDate\":\"")
				.append(approveDate).append('\"');
		sb.append('}');
		return sb.toString();
	}
}
