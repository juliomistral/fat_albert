package funddna.domain.motif;

import funddna.domain.AbstractDomain;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Description extends AbstractDomain {
    private String name;
    private String headline;

    public String getName() {
        return this.name;
    }

    public Description setName(String name) {
        this.name = name;
        return this;
    }

    public String getHeadline() {
        return this.headline;
    }

    public Description setHeadline(String headline) {
        this.headline = headline;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .appendSuper(super.toString())
                .append("name", name)
                .append("headline", headline)
                .toString();
    }
}
