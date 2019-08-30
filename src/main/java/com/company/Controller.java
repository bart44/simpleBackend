package com.company;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @RequestMapping("/user/info")
    public String consumeRest(){
        final String url = "https://api.github.com/users/octocat";
        RestTemplate restTemplate = new RestTemplate();
        Model model = restTemplate.getForObject(url, Model.class);
        return model.toString();
        //restTemplate.getForObject(url, Model.class);
    }
}
