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
    public String toString() {
        return id + "|" + name + "|" + entranceYear + "|" + gender;
    }
}



// Seorang mahasiswa (```student```) dapat diidentifikasi dengan atribut: nomor induk mahasiswa (```id```), nama (```name```), tahun masuk (```entrance year```), dan jenis kelamin (```gender```). Keunikan seorang mahasiswa dijamin melalui nomor induk mahasiswa (```id```).