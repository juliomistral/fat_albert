package funddna.domain.motif;

import funddna.domain.AbstractDomain;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

public class Analytics extends AbstractDomain {
    private BigDecimal oneYearReturns;
    private BigDecimal fiveYearReturns;
    private Long bulls;
    private Long bears;

    public BigDecimal getOneYearReturns() {
        return this.oneYearReturns;
    }

    public Analytics setOneYearReturns(BigDecimal oneYearReturns) {
        this.oneYearReturns = oneYearReturns;
        return this;
    }

    public BigDecimal getFiveYearReturns() {
        return this.fiveYearReturns;
    }

    public Analytics setFiveYearReturns(BigDecimal fiveYearReturns) {
        this.fiveYearReturns = fiveYearReturns;
        return this;
    }

    public Long getBulls() {
        return this.bulls;
    }

    public Analytics setBulls(Long bulls) {
        this.bulls = bulls;
        return this;
    }

    public Long getBears() {
        return this.bears;
    }

    public Analytics setBears(Long bears) {
        this.bears = bears;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .appendSuper(super.toString())
                .append("oneYearReturns", oneYearReturns)
                .append("fiveYearReturns", fiveYearReturns)
                .append("bulls", bulls)
                .append("bears", bears)
                .toString();
    }
}
