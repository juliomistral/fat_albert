package funddna.domain.motif;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class WeightingsTest {
    private Weightings weightings;

    @Before
    public void setup() {
        weightings = new Weightings();
    }

    @Test
    public void whenWeightingsIsEmptyShouldReturnNullWhenRetrievingCurrentVersion() {
        assertNull(weightings.getCurrentVersion());
    }

    @Test
    public void whenWeightingsIsEmptyShouldReturnNullRetrievingLastRebalnaceVersion() {
        assertNull(weightings.getLastRebalanceVersion());
    }

    @Test
    public void whenAddingAVersionShouldAddTheNewlyAddedVersionToTheEndOfTheListOfVersions() {
        // given: a weightings with 2 previous versions
        addVersionToWeightings();
        addVersionToWeightings();

        // when: adding a new version
        Weighting newWeighting = new Weighting();
        weightings.addVersion(newWeighting);

        // then: the list of versions should be 3
        assertEquals(3, weightings.getVersions().size());

        // and: the last item in the list is the newly added version
        assertEquals(newWeighting, weightings.getVersions().get(2));
    }

    @Test
    public void whenAddingAVersionAsTheCurrentVersionShouldReturnTheNewlyAddedVersionAsTheCurrentVersion() {
        // given: a weightings with a current version
        Weighting original = addVersionToWeightings();

        // when: adding a new version
        Weighting newWeighting = new Weighting();
        weightings.addVersion(newWeighting, true);

        // then: the newly added weighting is the current version
        assertEquals(newWeighting, weightings.getCurrentVersion());
    }

    @Test
    public void whenAddingAVersionAsASilentVersionTheOriginalCurrentVersionShouldStayTheCurrentVersion() {
        // given: a weightings with a current version
        Weighting original = addVersionToWeightings();

        // when: adding a new silent version
        Weighting newWeighting = new Weighting();
        weightings.addVersion(newWeighting, false);

        // then: the newly added weighting is the current version
        assertEquals(original, weightings.getCurrentVersion());
    }

    private Weighting addVersionToWeightings() {
        Weighting weighting = new Weighting();
        weightings.addVersion(weighting);

        return weighting;
    }

}
