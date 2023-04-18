package com.nulabinc.backlog4j.api.option;

import com.nulabinc.backlog4j.http.NameValuePair;

import java.util.List;

public class CreateTeamParams extends PostParams {
    public CreateTeamParams(String name){
    parameters.add(new NameValuePair("name", name));
}

    public CreateTeamParams members(List members) {
        for (Object member : members) {
            parameters.add(new NameValuePair("members[]", member.toString()));
        }
        return this;
    }

}
