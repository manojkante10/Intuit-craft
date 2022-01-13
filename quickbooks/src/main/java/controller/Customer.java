package controller;

import models.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class Customer   {

    @ResponseBody
    @RequestMapping(value = "/intuit", method = RequestMethod.GET)
    public Response products(){
        return new Response("a", "b");
    }

    @ResponseBody
    @GetMapping(path = "/string")
    public String returnString(){
        return "String message";
    }
}
