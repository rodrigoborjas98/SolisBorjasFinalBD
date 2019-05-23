
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
public class InstructorController {
    @RequestMapping(value="/instructor", method=RequestMethod.GET)
    public String Instructor(Model model){
        List<Instructor> lista;
        lista=getList();
        model.addAttribute("instructor", lista);
        return "instructor";
    }
    
    private List<Instructor> getList(){
        List<Instructor> lista = new ArrayList();
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB db=mongoClient.getDB("university");
        DBCollection coleccion = db.getCollection("instructor");
        
        DBCursor cursor = coleccion.find();
        for(DBObject doc : cursor){
            Instructor instructor = new Instructor();
            instructor.setNombre(doc.get("nombre").toString());
            instructor.setDeptName(doc.get("deptName").toString());
            instructor.setSalary((Double) doc.get("salary"));

//            student.setId(doc.get("_id").toString());
//            student.setName(doc.get("name").toString());
//            student.setDepartment(doc.get("dept_name").toString());
//            student.setCredits((int) doc.get("tot_cred"));
            lista.add(instructor);
        }
        return lista;
    }
    
}
