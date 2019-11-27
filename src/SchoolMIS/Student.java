/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolMIS;

/**
 *
 * @author makana
 */
public class Student {
    
     private int adm_no;
    private String sir_name,middle_name,last_name,gender,mclass,stream,DOB,DOA,TelNo;
    public Student(int adm_no,String sir_name,String middle_name,String last_name,String gender,String DOB,String TelNo,String mclass,String stream,String DOA){
        this.adm_no =adm_no;
        this.sir_name =sir_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.gender = gender;
        this.DOB =DOB;
        this.TelNo=TelNo;
        this.mclass = mclass;
        this.stream =stream;
        this.DOA =DOA;
      
        
        
        
    }

    Student(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5,String string6 ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getadm_no(){
        return adm_no;
    }
    public String getsir_name(){
        return sir_name;
    }
    
        
       public  String getmiddle_name(){
           return middle_name;
    }
                
              public   String getlast_name(){
                  return last_name;
    }
                public String getgender(){
                    return gender;
    }
                
               public  String getDOB(){
                   return DOB;}
               
               public  String getTelNO(){
                   return TelNo;}
               public  String getmclass(){
                   return mclass;
    }
               public  String getstream(){
                   return stream;
    }
                   
              public  String getDOA(){
                   return DOA;
    }
            
   
    
}
