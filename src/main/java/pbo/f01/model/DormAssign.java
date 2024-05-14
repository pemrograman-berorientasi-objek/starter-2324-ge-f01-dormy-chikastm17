package pbo.f01.model;

/**
 * 
 * @author 12S22023 Chika Situmorang
 * @author 12S22004 Bethania Hasibuan
 * 
 */

public class DormAssign {
    private String studentId;
    private String dormName;
    

    public DormAssign(String studentId, String dormName) {
        this.studentId = studentId; 
        this.dormName = dormName;
        
    
    }

    public String getstudentId() {
        return studentId;
    }

    public String getdormName() {
        return dormName;
    }


    @Override
    public String toString() {
        return studentId + "|" + dormName ;
    }
}
