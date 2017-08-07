package com.xl.data.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock extends Investment {
	@Id
	@GeneratedValue
	@Column(name = "STOCK_ID")
	private Long stockId;

	@Column(name = "SHARE_PRICE")
	private BigDecimal sharePrice;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	public Long getStockId() {
		return stockId;
	}

	public BigDecimal getSharePrice() {
		return sharePrice;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public void setSharePrice(BigDecimal sharePrice) {
		this.sharePrice = sharePrice;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
}
