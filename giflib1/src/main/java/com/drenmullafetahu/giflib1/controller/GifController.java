package com.drenmullafetahu.giflib1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dren on 3/26/2016.
 */
@Controller
public class GifController {
    @RequestMapping("/gif")
    public String listGifs(){

        return  "home";
    }
}


