/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Administrator
 */
public abstract class C11Pet {
    private String petName;

    public C11Pet() {
    }
    
    

    public C11Pet(String petName) {
        this.petName = petName;
    }
    
    public abstract String speak();

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "C11Pet{" + "petName=" + petName + '}';
    }
    
    
    





    
    
}
