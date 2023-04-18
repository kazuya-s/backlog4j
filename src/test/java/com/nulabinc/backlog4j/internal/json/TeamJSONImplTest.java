package com.nulabinc.backlog4j.internal.json;

import com.nulabinc.backlog4j.ResponseList;
import com.nulabinc.backlog4j.Team;
import com.nulabinc.backlog4j.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamJSONImplTest extends AbstractJSONImplTest {
    @Test
    public void createPriorityListTest() throws IOException {
        String fileContentStr = getJsonString("json/teams.json");
        ResponseList<Team> teams = factory.createTeamList(fileContentStr);

        assertEquals(2, teams.size());

        Team team = teams.get(0);
        assertEquals(123, team.getId());
        assertEquals("test-team1", team.getName());
        assertEquals(21, team.getDisplayOrder());
        List<User> members = team.getMembers();
        assertEquals(3, members.size());
    }
}
