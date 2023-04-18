package com.nulabinc.backlog4j;

import java.util.Date;
import java.util.List;

public interface Team {
    long getId();

    String getIdAsString();

    String getName();

    List<User> getMembers();

    long getDisplayOrder();

    User getCreatedUser();

    Date getCreated();

    User getUpdatedUser();

    Date getUpdated();
}
