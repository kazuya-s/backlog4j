package com.nulabinc.backlog4j.internal.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.nulabinc.backlog4j.Category;
import com.nulabinc.backlog4j.Team;
import com.nulabinc.backlog4j.User;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamJSONImpl implements Team {

    private long id;
    private String name;
    @JsonDeserialize(as=UserJSONImpl[].class)
    private User[] members;
    private long displayOrder;

    @JsonDeserialize(as=UserJSONImpl.class)
    private User createdUser;
    @JsonDeserialize(using = JacksonCustomDateDeserializer.class)
    private Date created;
    @JsonDeserialize(as=UserJSONImpl.class)
    private User updatedUser;
    @JsonDeserialize(using = JacksonCustomDateDeserializer.class)
    private Date updated;

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getIdAsString() {
        return String.valueOf(this.id);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<User> getMembers() {
        return Arrays.asList(members);
    }

    @Override
    public long getDisplayOrder() {
        return displayOrder;
    }

    @Override
    public User getCreatedUser() {
        return createdUser;
    }

    @Override
    public Date getCreated() {
        return created;
    }

    @Override
    public User getUpdatedUser() {
        return updatedUser;
    }

    @Override
    public Date getUpdated() {
        return updated;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TeamJSONImpl rhs = (TeamJSONImpl) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.name, rhs.name)
                .append(this.members, rhs.members)
                .append(this.displayOrder, rhs.displayOrder)
                .append(this.createdUser, rhs.createdUser)
                .append(this.created, rhs.created)
                .append(this.updatedUser, rhs.updatedUser)
                .append(this.updated, rhs.updated)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(name)
                .append(members)
                .append(displayOrder)
                .append(createdUser)
                .append(created)
                .append(updatedUser)
                .append(updated)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("members", members)
                .append("displayOrder", displayOrder)
                .append("createdUser", createdUser)
                .append("created", created)
                .append("updatedUser", updatedUser)
                .append("updated", updated)
                .toString();
    }
}
