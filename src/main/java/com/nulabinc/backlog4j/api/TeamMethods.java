package com.nulabinc.backlog4j.api;

import com.nulabinc.backlog4j.BacklogException;
import com.nulabinc.backlog4j.ResponseList;
import com.nulabinc.backlog4j.Team;
import com.nulabinc.backlog4j.api.option.*;

public interface TeamMethods {

    /**
     * Returns all the teams.
     *
     * @return the teams in a list.
     * @throws BacklogException
     */
    ResponseList<Team> getTeams() throws BacklogException;

    /**
     * Returns all the teams.
     *
     * @param params the offset parameters
     * @return the teams in a list.
     * @throws BacklogException
     */
    ResponseList<Team> getTeams(OffsetParams params) throws BacklogException;

    /**
     * Creates a team.
     *
     * @param params the team creating parameters
     * @return the created Team
     * @throws BacklogException
     */
    Team createTeam(CreateTeamParams params) throws BacklogException;

    /**
     * Returns the team identified by the teams's id.
     *
     * @param teamId the team identifier
     * @return the Team.
     * @throws BacklogException
     */
    Team getTeam(Object teamId) throws BacklogException;

    /**
     * Updates the existing team.
     *
     * @param params the team updating parameters
     * @return the updated Team.
     * @throws BacklogException
     */
    Team updateTeam(UpdateTeamParams params) throws BacklogException;

    /**
     * Deletes the existing teams.
     *
     * @param teamId the team identifier
     * @return the deleted Group.
     * @throws BacklogException
     */
    Team deleteTeam(Object teamId) throws BacklogException;

}
