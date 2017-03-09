package com.crudappgroup.controller;

/**
 * Created by Kaiser Ahmed on 3/9/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    //http://localhost:8080/index
    @RequestMapping(value="/index", method= RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "My Quick Blog";
    }

    //http://localhost:8080/index/kaiser
    @RequestMapping(value="/index/{name}", method= RequestMethod.GET)
    @ResponseBody
    public String indexWithName(@PathVariable("name") String name) {
        return "My Quick Blog, " + name;
    }

    //http://localhost:8080/method9?id=2
    @RequestMapping(value="/method9")
    @ResponseBody
    public String method9(@RequestParam("id") int id){
        return "method9 with id= "+id;
    }

    //http://localhost:8080/template
    @RequestMapping(value="/template", method = RequestMethod.GET)
    public ModelAndView templateIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Content Available Only for Users with Free member Role");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    //http://localhost:8080/temppara?name=Kaiser
    @RequestMapping(value="/temppara")
    public ModelAndView templatePara(@RequestParam("name") String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",name);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}