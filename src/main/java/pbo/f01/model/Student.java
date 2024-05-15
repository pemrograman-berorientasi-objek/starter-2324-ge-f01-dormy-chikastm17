package pbo.f01.model;

/**
 * 
 * @author 12S22023 Chika Situmorang
 * @author 12S22004 Bethania Hasibuan
 * 
 */

public class Student {
    private String id;
    private String name;
    private String entranceYear;
    private String gender;

    public Student(String id, String name, String entranceYear, String gender ) {
        this.id = id; 
        this.name = name;
        this.entranceYear = entranceYear;
        this.gender = gender;
    
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEntranceYear() {
        return entranceYear;
    }

    public String getGender() {
        return gender;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}


// Seorang mahasiswa (```student```) dapat diidentifikasi dengan atribut: nomor induk mahasiswa (```id```), nama (```name```), tahun masuk (```entrance year```), dan jenis kelamin (```gender```). Keunikan seorang mahasiswa dijamin melalui nomor induk mahasiswa (```id```).