package com.proyectofinalbases;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * @author Rodrigo Borjas
 */
@Controller
public class CourseController {
    @RequestMapping(value="/course", method=RequestMethod.GET)
    public String course(Model model){
        List<Course> lista;
        lista=getList();
        model.addAttribute("course", lista);
        return "course";
    }
    
    private List<Course> getList(){
        List<Course> lista = new ArrayList();
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB db=mongoClient.getDB("university");
        DBCollection coleccion = db.getCollection("course");
        
        DBCursor cursor = coleccion.find();
        for(DBObject doc : cursor){
            Course course = new Course();
            course.setCourse_id(doc.get("course_id").toString());
            course.setTitle(doc.get("title").toString());
            course.setDept_name(doc.get("dept_name").toString());
            course.setCredits((int) doc.get("credits"));

//            student.setId(doc.get("_id").toString());
//            student.setName(doc.get("name").toString());
//            student.setDepartment(doc.get("dept_name").toString());
//            student.setCredits((int) doc.get("tot_cred"));
            lista.add(course);
        }
        return lista;
    }
    
}
