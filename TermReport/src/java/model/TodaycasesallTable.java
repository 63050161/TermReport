/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author HP
 */

public class TodaycasesallTable {
    
    public static Connection ConnectToDB() throws Exception {
      String mysqlUrl = "jdbc:derby://localhost:1527/today-cases-all";
      Connection con = DriverManager.getConnection(mysqlUrl, "app", "app");
      return con;
   }    

    public static void main(String args[]) {
        JSONParser jsonParser = new JSONParser();
      try {
         //Parsing the contents of the JSON file
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\HP\\Desktop\\today-cases-all.json"));
         //Retrieving the arra
            JSONArray jsonArray = (JSONArray) jsonObject.get("");
            Connection con = ConnectToDB();
         //Insert a row into the MyPlayers table
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO MyData");
            Object object = jsonArray;
            JSONObject record = (JSONObject) object;
            int year_case = Integer.parseInt((String) record.get("year"));
            int week_case = Integer.parseInt((String) record.get("weeknum"));
            int new_case = Integer.parseInt((String) record.get("new_case"));
            int total_case = Integer.parseInt((String) record.get("total_case"));
            int new_case_excludeabroad = Integer.parseInt((String) record.get("new_case_excludeabroad"));
            int total_case_excludeabroad = Integer.parseInt((String) record.get("total_case_excludeabroad"));
            int new_recovered = Integer.parseInt((String) record.get("new_recovered"));
            int total_recovered = Integer.parseInt((String) record.get("total_recovered"));
            int new_death = Integer.parseInt((String) record.get("new_death"));
            int total_death = Integer.parseInt((String) record.get("total_death"));
            int case_foreign = Integer.parseInt((String) record.get("case_foreign"));
            int case_prison = Integer.parseInt((String) record.get("case_prison"));
            int case_walkin = Integer.parseInt((String) record.get("case_walkin"));
            int case_new_prev = Integer.parseInt((String) record.get("case_new_prev"));
            int case_new_diff = Integer.parseInt((String) record.get("case_new_diff"));
            int death_new_prev = Integer.parseInt((String) record.get("death_new_prev"));
            int death_new_diff = Integer.parseInt((String) record.get("death_new_diff"));
            String update_date = (String) record.get("update_date");
            pstmt.setInt(1, year_case);
            pstmt.setInt(2, week_case);
            pstmt.setInt(3, new_case);
            pstmt.setInt(4, total_case);
            pstmt.setInt(5, new_case_excludeabroad);
            pstmt.setInt(6, total_case_excludeabroad);
            pstmt.setInt(7, new_recovered);
            pstmt.setInt(8, total_recovered);
            pstmt.setInt(9, new_death);
            pstmt.setInt(10, total_death);
            pstmt.setInt(11, case_foreign);
            pstmt.setInt(12, case_prison);
            pstmt.setInt(13, case_walkin);
            pstmt.setInt(14, case_new_prev);
            pstmt.setInt(15, case_new_diff);
            pstmt.setInt(16, death_new_prev);
            pstmt.setInt(17, death_new_diff);
            pstmt.setString(18, update_date);
            pstmt.executeUpdate();
         } 
        catch (FileNotFoundException e) {
         e.printStackTrace();
      } 
        catch (IOException e) {
         e.printStackTrace();
      } 
        catch (ParseException e) {
         e.printStackTrace();
      } 
        catch (Exception e) {
         e.printStackTrace();
      }        
   }
}
