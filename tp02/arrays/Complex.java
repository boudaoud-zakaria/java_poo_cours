package poo.tp02.arrays; 

public class Complex { 

    double r; // Partie réelle 
    double i; // Partie Imaginaire 

    // Default constructor 
    public Complex(){} 

    // Constructor with parameters
    public Complex(double r, double i){  // 2ème constructeur 
        this.r = r; 
        this.i = i; 
    } 

    // equals method to compare Fraction objects
    public boolean equals(Complex c){ 
        if (this.r == c.r && this.i == c.i ) 
            return true; 
        return false; 
    } 
    
    //toString method to provide a string representation of the Fraction object
    public String toString(){ 
        return "("+ this.r + "," + this.i +")"; 
    } 
} 