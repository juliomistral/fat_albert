package funddna.domain.motif;

import funddna.domain.AbstractDomain;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.List;

public class Weightings extends AbstractDomain {
    private List<Weighting> versions;
    private int lastRebalanceVersionIndex;
    private int currentVersionIndex;

    public Weightings() {
        this(null, 0, 0);
    }

    public Weightings(List<Weighting> versions, int lastRebalanceVersionIndex, int currentVersionIndex) {
        this.versions = versions == null ? null : new ArrayList<>(versions);
        this.lastRebalanceVersionIndex = lastRebalanceVersionIndex;
        this.currentVersionIndex = currentVersionIndex;

    }

    public List<Weighting> getVersions() {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        return this.versions;
    }

    public int getLastRebalanceVersionIndex() {
        return lastRebalanceVersionIndex;
    }

    public int getCurrentVersionIndex() {
        return currentVersionIndex;
    }

    public Weighting getCurrentVersion() {
        if (getVersions().isEmpty()) {
            return null;
        }
        return getVersions().get(currentVersionIndex);
    }

    public Weighting getLastRebalanceVersion() {
        if (getVersions().isEmpty()) {
            return null;
        }
        return getVersions().get(lastRebalanceVersionIndex);
    }

    public void addVersion(Weighting weighting) {
        this.addVersion(weighting, true);
    }

    public void addVersion(Weighting weighting, boolean rollForward) {
        weighting.setSequence(getVersions().size());
        getVersions().add(weighting);

        if (rollForward) {
            rollCurrentToLatestVersion();
        }
    }

    public void rollCurrentToLatestVersion() {
        lastRebalanceVersionIndex = currentVersionIndex = getVersions().size() - 1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("versions", versions)
                .append("lastRebalanceVersionIndex", lastRebalanceVersionIndex)
                .append("currentVersionIndex", currentVersionIndex)
                .toString();
    }
}
