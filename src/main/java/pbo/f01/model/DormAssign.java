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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DormAssign that = (DormAssign) obj;
        return studentId.equals(that.studentId) && dormName.equals(that.dormName);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode() + dormName.hashCode();
    }
}