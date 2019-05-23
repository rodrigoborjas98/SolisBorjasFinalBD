package com.mycompany.cesar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/university?useTimezone=true&serverTimezone=GMT%2B8";

    public static void main(String[] args) {
        Connection conn = createdataBaseConnection();
        
        List<Instructor> instructores = BaseInstructor(conn);
        List<Advisor>    advisor      = BaseAdvisor(conn);
        List<Classroom>  classrom     = BaseClassroom(conn);
        List<Course>     course       = BaseCourse(conn);
        List<Department> department   = BaseDepartment(conn);
        List<PreReq>     prereq       = BasePreReq(conn);
        List<Section>    section      = BaseSection(conn);
        List<Student>    student      = BaseStudent(conn);
        List<Takes>      takes        = BaseTakes(conn);
        List<Teaches>    teaches      = BaseTeaches(conn);
        List<Time_Slot>  time_Slot     = BaseTime_Slot(conn);
        
        System.out.println(instructores);
        System.out.println(advisor);
        System.out.println(classrom);
        System.out.println(course);
        System.out.println(department);
        System.out.println(prereq);
        System.out.println(section);
        System.out.println(student);
        System.out.println(takes);
        System.out.println(teaches);
        System.out.println(time_Slot);
        
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase db_uni = mongoClient.getDatabase("university");
        
        //MONGO
        // collection 6 is missing bec
        MongoCollection collection1 = db_uni.getCollection("instructor");
        MongoCollection collection2 = db_uni.getCollection("advisor");
        MongoCollection collection3 = db_uni.getCollection("classroom");
        MongoCollection collection4 = db_uni.getCollection("course");
        MongoCollection collection5 = db_uni.getCollection("department");
        MongoCollection collection6 = db_uni.getCollection("prereq");
        MongoCollection collection7 = db_uni.getCollection("section");
        MongoCollection collection8 = db_uni.getCollection("student");
        MongoCollection collection9 = db_uni.getCollection("takes");
        MongoCollection collection10= db_uni.getCollection("teaches");
        MongoCollection collection11= db_uni.getCollection("time_slot");
        
        collection1.drop();
        collection2.drop();
        collection3.drop();
        collection4.drop();
        collection5.drop();
        collection6.drop();
        collection7.drop();
        collection8.drop();
        collection9.drop();
        collection10.drop();
        collection11.drop();
        
        db_uni.createCollection("instructor");
        db_uni.createCollection("advisor");
        db_uni.createCollection("classroom");
        db_uni.createCollection("course");
        db_uni.createCollection("department");
        db_uni.createCollection("prereq");
        db_uni.createCollection("section");
        db_uni.createCollection("student");
        db_uni.createCollection("takes");
        db_uni.createCollection("teaches");
        db_uni.createCollection("time_slot");
       
        //Generacion de variables por extraccion de lista
        for (int i = 0; i < instructores.size(); i++) {
            Instructor instructIterable = instructores.get(i);
            //int ID = instructIterable
            String nombre = instructIterable.getNombre();
            String deptName = instructIterable.getDeptName();
            Double salary = instructIterable.getSalary();
            Document instructorDoc = new Document().append("salary", salary)
                    .append("nombre", nombre).append("deptName", deptName);
            collection1.insertOne(instructorDoc);
        }
        
        for (int i = 0; i < advisor.size(); i++) {
            Advisor advIterable = advisor.get(i);
            int i_ID = advIterable.getI_ID();
            int s_ID = advIterable.getS_ID();
            Document advisorDoc = new Document().append("i_ID", i_ID)
                    .append("s_ID", s_ID);
            collection2.insertOne(advisorDoc);
        }
        
        for (int i = 0; i < classrom.size(); i++) {
            Classroom classIterable = classrom.get(i);
            String building = classIterable.getBuilding();
            int room_building = classIterable.getRoom_number();
            int capacity = classIterable.getCapacity();
            
            Document classroomDoc = new Document()
                    .append("building", building)
                    .append("room_building", room_building)
                    .append("capacity", capacity);
            collection3.insertOne(classroomDoc);
        }
        
        for (int i = 0; i < course.size(); i++) {
            Course courseIterable = course.get(i);
            String course_id =courseIterable.getCourse_id();
            String title = courseIterable.getTitle();
            String dept_name = courseIterable.getDept_name();
            int credits = courseIterable.getCredits();
            Document DocToInsert = new Document()
                    .append("course_id", course_id)
                    .append("title", title)
                    .append("dept_name", dept_name)
                    .append("credits", credits);
            collection4.insertOne(DocToInsert);
        }
        
        for (int i = 0; i < department.size(); i++) {
            Department Iterable = department.get(i);
            String dept_name = Iterable.getDept_name();
            String building = Iterable.getBuilding();
            
            Document DocToInsert = new Document()
                    .append("dept_name", dept_name)
                    .append("building", building);
     
            collection5.insertOne(DocToInsert);
        }
        
        for (int i = 0; i < prereq.size(); i++) {
            PreReq Iterable = prereq.get(i);
            
            String course_id =Iterable.getCourse_id();
            String prereq_id =Iterable.getPrereq_id();
            
            Document DocToInsert = new Document()
                    .append("course_id", course_id)
                    .append("prereq_id", prereq_id);
                  
            collection6.insertOne(DocToInsert);
        }
        
        for (int i = 0; i < section.size(); i++) {
            Section Iterable = section.get(i);
            
            String course_id =Iterable.getCourse_id();
            int sec_id =Iterable.getSec_id();
            String semester = Iterable.getSemester();
            int year= Iterable.getYear();
            String building= Iterable.getBuilding();
            int room_number = Iterable.getRoom_number();
            String time_slot_id= Iterable.getTime_slot_id();
            
            Document DocToInsert = new Document()
                    .append("course_id",course_id)
                    .append("sec_id",sec_id)
                    .append("semester",semester)
                    .append("semester",semester)
                    .append("year",year)
                    .append("building",building)
                    .append("room_number",room_number)
                    .append("time_slot_id",time_slot_id);
 
            collection7.insertOne(DocToInsert);
        }
        
        for (int i = 0; i < student.size(); i++) {
            Student Iterable = student.get(i);
            
            int ID = Iterable.getID();
            String name = Iterable.getName();
            String dept_name = Iterable.getDept_name();
            int tot_cred = Iterable.getTot_cred();
            
            Document DocToInsert = new Document()
                    .append("ID",ID)
                    .append("name",name)
                    .append("dept_name",dept_name)
                    .append("tot_cred",tot_cred);
          
            collection8.insertOne(DocToInsert);
        }
                
        for (int i = 0; i < department.size(); i++) {
            Department Iterable = department.get(i);
            
            Document DocToInsert = new Document();
                  
            collection10.insertOne(DocToInsert);
        }
        
 }

    static private Connection createdataBaseConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, "rodrigo", "rodrigo");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    private static List<Instructor> BaseInstructor(Connection conn) {
        List<Instructor> instructores = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from instructor";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String deptName = rs.getString("dept_name");
                Double salary = rs.getDouble("salary");
                Instructor inst = new Instructor(name, deptName, salary);
                instructores.add(inst);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instructores;
    }
     private static List<Advisor> BaseAdvisor(Connection conn) {
        List<Advisor> advisor = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from advisor";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                int s_ID = rs.getInt("s_ID");
                int i_ID = rs.getInt("i_ID");
                Advisor adv = new Advisor(s_ID,i_ID);
                advisor.add(adv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return advisor;
    }

private static List<Classroom> BaseClassroom(Connection conn) {
        List<Classroom> classroom = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from classroom";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String building = rs.getString("building");
                int room_building = rs.getInt("room_number");
                int capacity = rs.getInt("capacity");
                Classroom classrom = new Classroom(building,room_building,capacity);;
                classroom.add(classrom);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return classroom;
    }
private static List<Course> BaseCourse(Connection conn) {
        List<Course> course = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from course";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                 String course_id =rs.getString("course_id");
                 String title = rs.getNString("title");
                 String dept_name = rs.getString("dept_name");
                 int credits = rs.getInt("credits");
                Course cours = new Course(course_id,title,dept_name,credits);
                course.add(cours);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return course;
    }

private static List<Department> BaseDepartment(Connection conn) {
        List<Department> department = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from department";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
            String dept_name = rs.getString("dept_name");
            String building = rs.getString("building");
            int budget = rs.getInt("budget");
                Department departmen = new Department(dept_name,building,budget);
                department.add(departmen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return department;
    }

private static List<PreReq> BasePreReq(Connection conn) {
        List<PreReq> preReq = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from prereq";
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                String course_id =rs.getString("course_id");
                String prereq_id =rs.getString("prereq_id");
                PreReq preRe = new PreReq(course_id,prereq_id);
                preReq.add(preRe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preReq;
    }
private static List<Section> BaseSection(Connection conn) {
        List<Section> section = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from section";
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                String course_id =rs.getString("course_id");
                int sec_id =rs.getInt("sec_id");
                String semester =rs.getString("semester");
                int year =rs.getInt("year");
                String building =rs.getString("building");
                int room_number =rs.getInt("room_number");
                String time_slot_id =rs.getString("time_slot_id");
                Section sectio = new Section(course_id,sec_id, semester,year,building, room_number, time_slot_id);
                section.add(sectio);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return section;
    }

private static List<Student> BaseStudent(Connection conn) {
        List<Student> student = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from student";
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                int ID = rs.getInt("ID");
                String name = rs.getString("name");
                String dept_name = rs.getString("dept_name");
                int tot_cred = rs.getInt("tot_cred");
                
                Student studen = new Student(ID,name, dept_name,tot_cred);
                student.add(studen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

private static List<Takes> BaseTakes(Connection conn) {
        List<Takes> takes = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from takes";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                int ID=rs.getInt("ID");
                String course_id=rs.getString("course_id");
                String sec_id=rs.getString("sec_id");
                String semester=rs.getString("semester");
                int year=rs.getInt("year");
                String grade=rs.getString("grade");
     
                Takes take = new Takes(ID,course_id, sec_id,semester,year,grade);
                takes.add(take);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return takes;
    }
private static List<Teaches> BaseTeaches(Connection conn) {
        List<Teaches> teaches = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from teaches";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                int ID =rs.getInt("ID");
                String course_id=rs.getString("course_id");
                int sec_id=rs.getInt("sec_id");
                String semester=rs.getString("semester");
                int year=rs.getInt("year");
                
                Teaches teache = new Teaches(ID,course_id, sec_id,semester,year);
                teaches.add(teache);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teaches;
    }
private static List<Time_Slot> BaseTime_Slot(Connection conn) {
        List<Time_Slot> time_Slot = new LinkedList<>();
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * from time_Slot";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
            String time_slot_id=rs.getString("time_slot_id");
            String day=rs.getString("day");
            int start_hr =rs.getInt("start_hr");
            int start_min=rs.getInt("start_min");
            int end_hr=rs.getInt("end_hr");
            int end_min=rs.getInt("end_min");
                Time_Slot time_Slo = new Time_Slot(time_slot_id,day, start_hr,start_min,end_hr,end_min);
                time_Slot.add(time_Slo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return time_Slot;
    }
}
