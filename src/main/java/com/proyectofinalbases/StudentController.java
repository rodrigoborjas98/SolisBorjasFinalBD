
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
public class StudentController {
    @RequestMapping(value="/alumnos", method=RequestMethod.GET)
    public String Alumnos(Model model){
        List<Student> lista;
        lista=getAlumnos();
        model.addAttribute("students", lista);
        return "student";
    }
    
    private List<Student> getAlumnos(){
        List<Student> lista = new ArrayList();
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB db=mongoClient.getDB("university");
        DBCollection coleccion = db.getCollection("student");
        DBCursor cursor = coleccion.find();
        for(DBObject doc : cursor){
            Student student = new Student();
            student.setId(doc.get("ID").toString());
            student.setName(doc.get("name").toString());
            student.setDepartment(doc.get("dept_name").toString());
            student.setCredits((int) doc.get("tot_cred"));
            lista.add(student);
        }
        return lista;
    }
    
}
