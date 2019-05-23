package com.proyectofinalbases;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 * @author Rodrigo Borjas
 */
@Controller
public class AddAlumnoController {
    
public class Employee {
    private String name;
    private long id;
    private String contactNumber;
}
    
    @RequestMapping(value="/addstudentpage", method=RequestMethod.GET)
    public String Alumnos(Model model){
        return "addstudentindex";
    }
    
    @RequestMapping(value="/addcoursepage", method=RequestMethod.GET)
    public String Course(Model model){
        return "addcourseindex";
    }
    
    @RequestMapping(value ="/addstudentpost", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("alumno")Student student, 
      BindingResult result, ModelMap model) {
        model.addAttribute("name",student.getName());
        model.addAttribute("sample","SAMPLEHOLA");
        return "print";
    }
}
