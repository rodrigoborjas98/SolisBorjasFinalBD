
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
public class SectionController {
    @RequestMapping(value="/section", method=RequestMethod.GET)
    public String Section (Model model){
        List<Section> lista;
        lista=getList();
        model.addAttribute("section", lista);
        return "section";
    }
    
    private List<Section> getList(){
        List<Section> lista = new ArrayList();
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB db=mongoClient.getDB("university");
        DBCollection coleccion = db.getCollection("section");
        
        DBCursor cursor = coleccion.find();
        for(DBObject doc : cursor){
            Section section = new Section();
             
            section.setCourse_id(doc.get("course_id").toString());
            section.setSec_id((int)doc.get("sec_id"));
            section.setSemester(doc.get("semester").toString());
            section.setYear((int)doc.get("year"));
            section.setBuilding(doc.get("building").toString());
            section.setRoom_number((int)doc.get("room_number"));
            section.setTime_slot_id(doc.get("time_slot_id").toString());
            
            lista.add(section);
        }
        return lista;
    }
    
}