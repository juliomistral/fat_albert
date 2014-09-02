package funddna.domain.motif;

import funddna.domain.AbstractDomain;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

public class WeightedTicker extends AbstractDomain {
    private BigDecimal weight;
    private BigDecimal adjustedWeight;
    private BigDecimal outstandingShares;
    private BigDecimal businessLineAdjustment;
    private BigDecimal sharePrice;
    private boolean locked;
    private boolean splitAdjusted = false;
    private Ticker ticker;

    public BigDecimal getWeight() {
        return this.weight;
    }

    public WeightedTicker setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public BigDecimal getAdjustedWeight() {
        return this.adjustedWeight;
    }

    public WeightedTicker setAdjustedWeight(BigDecimal adjustedWeight) {
        this.adjustedWeight = adjustedWeight;
        return this;
    }

    public BigDecimal getOutstandingShares() {
        return this.outstandingShares;
    }

    public WeightedTicker setOutstandingShares(BigDecimal outstandingShares) {
        this.outstandingShares = outstandingShares;
        return this;
    }

    public BigDecimal getBusinessLineAdjustment() {
        return this.businessLineAdjustment;
    }

    public WeightedTicker setBusinessLineAdjustment(BigDecimal businessLineAdjustment) {
        this.businessLineAdjustment = businessLineAdjustment;
        return this;
    }

    public BigDecimal getSharePrice() {
        return this.sharePrice;
    }

    public WeightedTicker setSharePrice(BigDecimal sharePrice) {
        this.sharePrice = sharePrice;
        return this;
    }

    public boolean getLocked() {
        return this.locked;
    }

    public WeightedTicker setLocked(boolean locked) {
        this.locked = locked;
        return this;
    }

    public boolean getSplitAdjusted() {
        return this.splitAdjusted;
    }

    public WeightedTicker setSplitAdjusted(boolean splitAdjusted) {
        this.splitAdjusted = splitAdjusted;
        return this;
    }

    public Ticker getTicker() {
        return this.ticker;
    }

    public WeightedTicker setTicker(Ticker ticker) {
        this.ticker = ticker;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("ticker", ticker)
                .append("weight", weight)
                .append("sharePrice", sharePrice)
                .toString();
    }
}
