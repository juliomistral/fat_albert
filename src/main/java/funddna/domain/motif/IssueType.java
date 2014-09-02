package funddna.domain.motif;

public enum IssueType {
    ADR("adr", "A", "EQS", true, "ADR", "E....A"),
    PREFERRED_STOCK("ps", "B", "PRF", true, "Preferred Stock", "E[PR]...."),
    CLOSED_END_FUND("cef", "C", "EQS", false, "Closed-End Fund", "EUC..."),
    CONVERTIBLE_SHARES("cos", "A", "EQS", true, "Convertible Shares", "EC...."),
    PREFERRED_CONVERTIBLE_SHARES("pcs", "A", "EQS", true, "Preferred Convertible Shares", "E[FV]...."),
    COMMON_STOCK("cs", "A", "EQS", true, "Stock", "ES...."),
    MUTUAL_FUND("mtf", "C", "ETF", false, "Mutual Fund", "EUO..."),
    ETF("etf", "C", "ETF", false, "ETF", "EUO..."),
    WARRANT("war", "4", "WAR", true, "Warrant", "RW...."),
    RIGHTS("rt", "", "TRT", true, "Right", "RS...."),
    BOND("bnd", "", "BND", false, "Bond", "D....."), // For now treating bond as unknown from the Penson
    UNKNOWN("unk", "", "", false, "Unknown", "M.....");

    private final String code;
    private final String pensonCode;
    private final String quoteMediaCode;
    private final String displayText;
    private final String isocfiCode;
    private final boolean motifSupported;

    private IssueType(final String code, final String pensonCode, final String quoteMediaCode,
                      final boolean motifSupported, final String displayText, final String isocfiCode) {
        this.code = code;
        this.pensonCode = pensonCode;
        this.quoteMediaCode = quoteMediaCode;
        this.motifSupported = motifSupported;
        this.displayText = displayText;
        this.isocfiCode = isocfiCode;
    }

    public String getCode() {
        return code;
    }

    public String getPensonCode() {
        return pensonCode;
    }

    public String getQuoteMediaCode() {
        return quoteMediaCode;
    }

    public String getDisplayText() {
        return displayText;
    }

    public String getIsocfiCode() {
        return isocfiCode;
    }

    public boolean isMotifSupported() {
        return motifSupported;
    }

    public IssueType fromXigniteCode(String xigniteValue) {
        if ("".equals(xigniteValue) || xigniteValue == null) {
            return IssueType.UNKNOWN;
        }

        if (xigniteValue.toLowerCase().indexOf("common stock") >= 0) {
            return IssueType.COMMON_STOCK;
        }
        if (xigniteValue.toLowerCase().indexOf("american depository") >= 0) {
            return IssueType.ADR;
        }
        if (xigniteValue.toLowerCase().indexOf("preferred stock") >= 0) {
            return IssueType.PREFERRED_STOCK;
        }
        if (xigniteValue.toLowerCase().indexOf("warrant") >= 0) {
            return IssueType.WARRANT;
        }
        if (xigniteValue.toLowerCase().indexOf("etf") >= 0) {
            return IssueType.ETF;
        }
        if (xigniteValue.toLowerCase().indexOf("exchange traded fund") >= 0) {
            return IssueType.ETF;
        }
        if (xigniteValue.toLowerCase().indexOf("bond") >= 0) {
            return IssueType.BOND;
        }

        return IssueType.UNKNOWN;
    }
}
