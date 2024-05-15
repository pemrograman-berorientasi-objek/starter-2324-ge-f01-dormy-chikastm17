package pbo.f01.model;

/**
 * 
 * @author 12S22023 Chika Situmorang
 * @author 12S22004 Bethania Hasibuan
 * 
 */

public class Dorm {
    private String name;
    private int capacity;
    private String gender;

    public Dorm(String name, int capacity, String gender ) {
        this.name = name; 
        this.capacity = capacity;
        this.gender = gender;
    
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return name + "|" + gender + "|" + capacity;
    }
}

// Sebuah asrama (```dorm```) dapat diidentifikasi dengan atribut: nama (```name```), kapasitas (```capacity```), dan jenis kelamin penghuni (```gender```). Keunikan sebuah asrama dijamin melalui nama (```name```).
