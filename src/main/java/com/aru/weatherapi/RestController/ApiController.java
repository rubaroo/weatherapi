package com.aru.weatherapi.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
@RestController
public class ApiController {
    @GetMapping("/weather/{name}")
    public AgeResponseSend makeApiCall(@PathVariable String name) {
        {
            String url = "https://api.agify.io/?name=" + name;
            AgeResponseRecieved arr = restClient.get().uri(url).header("Accept-Encoding", "identity").retrieve().body(
                    AgeResponseRecieved.class
            );
            AgeResponseSend ars = new AgeResponseSend();
            ars.setAge(arr.getAge());
            ars.setCount(arr.getCount());
            ars.setName(arr.getName());
            ars.setDate(new Date().toString());
            return ars;

        }
}


@RestController
public class ApiClientController {
    public final RestClient restClient;

    public ApiClientController(ClientConfig clientConfig, RestClient restClient) {
        this.restClient = restClient;
    }


    }
}
