/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinalbases;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * @author Rodrigo Borjas
 */
@Controller
public class mainController {
    @RequestMapping(value={"/index","/"},method=RequestMethod.GET)
    public String Home(){
        return "index";
    }
}
