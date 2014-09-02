package funddna.domain.motif;

import funddna.domain.AbstractDomain;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Weighting extends AbstractDomain {

    private int sequence;
    private Set<WeightedTicker> weights = new HashSet<WeightedTicker>();
    private String createdByOrderId;
    private String corporateActionId;
    private Date launched;
    private WeightingScale weighting = WeightingScale.SHARE;

    public int getSequence() {
        return this.sequence;
    }

    public Weighting setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public Set<WeightedTicker> getWeights() {
        return this.weights;
    }

    public Weighting setWeights(Set<WeightedTicker> weights) {
        this.weights = weights;
        return this;
    }

    public String getCreatedByOrderId() {
        return this.createdByOrderId;
    }

    public Weighting setCreatedByOrderId(String createdByOrderId) {
        this.createdByOrderId = createdByOrderId;
        return this;
    }

    public String getCorporateActionId() {
        return this.corporateActionId;
    }

    public Weighting setCorporateActionId(String corporateActionId) {
        this.corporateActionId = corporateActionId;
        return this;
    }

    public Date getLaunched() {
        return this.launched;
    }

    public Weighting setLaunched(Date launched) {
        this.launched = launched;
        return this;
    }

    public WeightingScale getWeighting() {
        return this.weighting;
    }

    public Weighting setWeighting(WeightingScale weighting) {
        this.weighting = weighting;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .appendSuper(super.toString())
                .append("weights", weights)
                .append("createdByOrderId", createdByOrderId)
                .append("corporateActionId", corporateActionId)
                .append("launched", launched)
                .append("weighting", weighting)
                .toString();
    }
}
