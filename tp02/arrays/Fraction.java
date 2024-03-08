package poo.tp02.arrays; 

public class Fraction { 

    // variables d'objet
    int numerateur, denominateur; 
    
    // Default constructor 
    Fraction(){} 
    
    // Constructor with parameters
    Fraction(int n, int d){ 
        this.numerateur = n;  
        this.denominateur = d; 
    } 
    
    // equals method to compare Complex objects
    public boolean equals(Fraction f){ 
        if ((this.numerateur == f.numerateur)  && (this.denominateur == f.denominateur)) 
            return true; 
        return false; 
    } 

    //toString method to provide a string representation of the Complex object
    public String toString(){ 
        return this.numerateur + "/" + this.denominateur; 
    } 
} 