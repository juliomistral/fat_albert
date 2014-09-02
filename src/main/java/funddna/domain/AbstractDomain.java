package funddna.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

public class AbstractDomain {
    private String id;
    private Integer version;
    private String creatorId;
    private String updatedById;
    private Date updatedDate;
    private Date createdDate;

    public AbstractDomain() {
        this.createdDate = new Date();
    }

    public String getId() {
        return this.id;
    }

    public AbstractDomain setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getVersion() {
        return this.version;
    }

    public AbstractDomain setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public AbstractDomain setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public AbstractDomain setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
        return this;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public AbstractDomain setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public AbstractDomain setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", id)
                .append("version", version)
                .append("creatorId", creatorId)
                .append("updatedById", updatedById)
                .append("updatedDate", updatedDate)
                .append("createdDate", createdDate)
                .toString();
    }
}
