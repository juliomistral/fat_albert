package funddna.domain.motif;

import funddna.domain.AbstractDomain;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;
import java.util.Map;

public class Motif extends AbstractDomain {
    private String parentMotifId;
    private Date originDate;
    private MotifType motifType;
    private Scope scope;

    private Weighting parentMotifWeighting;
    private Weightings weightings;
    private Analytics analytics;
    private Description description;
    private Map<Tag, String> tags;
    private boolean indexable;
    private String urlName;

    public String getParentMotifId() {
        return this.parentMotifId;
    }

    public Motif setParentMotifId(String parentMotifId) {
        this.parentMotifId = parentMotifId;
        return this;
    }

    public Weighting getParentMotifWeighting() {
        return this.parentMotifWeighting;
    }

    public Motif setParentMotifWeighting(Weighting parentMotifWeighting) {
        this.parentMotifWeighting = parentMotifWeighting;
        return this;
    }

    public Weightings getWeightings() {
        if (this.weightings == null) {
            this.weightings = new Weightings();
        }
        return this.weightings;
    }

    public Motif setWeightings(Weightings weightings) {
        this.weightings = weightings;
        return this;
    }

    public Date getOriginDate() {
        return this.originDate;
    }

    public Motif setOriginDate(Date originDate) {
        this.originDate = originDate;
        return this;
    }

    public MotifType getMotifType() {
        return this.motifType;
    }

    public Motif setMotifType(MotifType motifType) {
        this.motifType = motifType;
        return this;
    }

    public Scope getScope() {
        return this.scope;
    }

    public Motif setScope(Scope scope) {
        this.scope = scope;
        return this;
    }

    public Analytics getAnalytics() {
        return this.analytics;
    }

    public Motif setAnalytics(Analytics analytics) {
        this.analytics = analytics;
        return this;
    }

    public Description getDescription() {
        return this.description;
    }

    public Motif setDescription(Description description) {
        this.description = description;
        return this;
    }

    public String getUrlName() {
        return this.urlName;
    }

    public Motif setUrlName(String urlName) {
        this.urlName = urlName;
        return this;
    }

    public Map<Tag, String> getTags() {
        return this.tags;
    }

    public Motif setTags(Map<Tag, String> tags) {
        this.tags = tags;
        return this;
    }

    public boolean isIndexable() {
        return this.indexable;
    }

    public Motif setIndexable(boolean indexable) {
        this.indexable = indexable;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .appendSuper(super.toString())
                .append("parentMotifId", parentMotifId)
                .append("parentMotifWeighting", parentMotifWeighting)
                .append("weightings", weightings)
                .append("originDate", originDate)
                .append("motifType", motifType)
                .append("scope", scope)
                .append("analytics", analytics)
                .append("description", description)
                .append("tags", tags)
                .append("indexable", indexable)
                .append("urlName", urlName)
                .toString();
    }
}
