package com.company;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data // no need for constructor/getters/setters
@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {

    private int id;
    private String login;
    private String name;
    private String type;
    private String avatar_url;
    private String created_at;

    private int calculate() {
        return 6/2*(2+1);
    }
    @Override
    public String toString() {
        return "{" + "<br />" +
                '\"' + "id" + '\"' + ": " + '\"' + id + '\"' + "," +  "<br />" +
                '\"' + "login" + '\"' + ": " + '\"' + login + '\"' + "," + "<br />"  +
                '\"' + "name" + '\"' + ": " + '\"' +  name + '\"' + "," + "<br />" +
                '\"' + "type" + '\"' + ": " + '\"' + type  + '\"' + "," + "<br />" +
                '\"' + "avatarUrl" + '\"' + ": " + "„" + avatar_url + "”" + "," + "<br />" +
                '\"' + "createdAt" + '\"' + ": " + '\"' + created_at + '\"' + "<br />" +
                '\"' + "calculations" + '\"' + ": " + '\"' + calculate() + '\"' + "<br />" +
                '}';
    }
}





