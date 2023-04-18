package com.nulabinc.backlog4j.api.option;

import com.nulabinc.backlog4j.http.NameValuePair;

import java.util.List;

public class UpdateTeamParams extends PatchParams {

    private String teamId;

    public UpdateTeamParams(Object teamId){
        this.teamId = teamId.toString();
    }


    public UpdateTeamParams name(String name) {
        parameters.add(new NameValuePair("name", name));
        return this;
    }

    public UpdateTeamParams members(List members) {
        for (Object member : members) {
            parameters.add(new NameValuePair("members[]", member.toString()));
        }
        return this;
    }

    public String getTeamId() {
        return teamId;
    }
}
