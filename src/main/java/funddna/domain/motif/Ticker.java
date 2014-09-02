package funddna.domain.motif;

import funddna.domain.AbstractDomain;

import javax.persistence.Entity;

@Entity
public class Ticker extends AbstractDomain {
    private String pensonSymbol;
    private String companyName;
    private String shortName;
    private IssueType issue;
    private Boolean marginEligible;
    private Boolean isAdp;
    private Boolean active;
    private boolean inReferenceTracker = false;
    private String cusip;
    private boolean dirty = false;
    private String dtnMarketCode;

    public String getPensonSymbol() {
        return this.pensonSymbol;
    }

    public Ticker setPensonSymbol(String pensonSymbol) {
        this.pensonSymbol = pensonSymbol;
        return this;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public Ticker setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getShortName() {
        return this.shortName;
    }

    public Ticker setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public IssueType getIssue() {
        return this.issue;
    }

    public Ticker setIssue(IssueType issue) {
        this.issue = issue;
        return this;
    }

    public Boolean getMarginEligible() {
        return this.marginEligible;
    }

    public Ticker setMarginEligible(Boolean marginEligible) {
        this.marginEligible = marginEligible;
        return this;
    }

    public Boolean getIsAdp() {
        return this.isAdp;
    }

    public Ticker setIsAdp(Boolean isAdp) {
        this.isAdp = isAdp;
        return this;
    }

    public Boolean getActive() {
        return this.active;
    }

    public Ticker setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public boolean getInReferenceTracker() {
        return this.inReferenceTracker;
    }

    public Ticker setInReferenceTracker(boolean inReferenceTracker) {
        this.inReferenceTracker = inReferenceTracker;
        return this;
    }

    public String getCusip() {
        return this.cusip;
    }

    public Ticker setCusip(String cusip) {
        this.cusip = cusip;
        return this;
    }

    public boolean getDirty() {
        return this.dirty;
    }

    public Ticker setDirty(boolean dirty) {
        this.dirty = dirty;
        return this;
    }

    public String getDtnMarketCode() {
        return this.dtnMarketCode;
    }

    public Ticker setDtnMarketCode(String dtnMarketCode) {
        this.dtnMarketCode = dtnMarketCode;
        return this;
    }
}
