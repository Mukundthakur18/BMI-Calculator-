
import java.util.Scanner;
// class representing the BMI calculator

class BMICalculator{
    double weight;  // in kg
    double height; // in m
    
    // constructor
    public BMICalculator(double weight, double height)
    {
        this.weight = weight;
        this.height = height;
    }
    
    // method to calculate BMI 
    public double calculateBMI(){
        return weight/(height*height);
    }
    
    // Method to get BMI category 
    public String getCategory(){
        double bmi = calculateBMI();
        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi >= 18.5 && bmi<24.9){
            return "Normal Weight";
        }
        else if(bmi >= 24.9 && bmi<29.9){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
}


// Main class 
public class BMICalculatorApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // take input from user
        System.out.printf("Enter your weight in kilogram: ");
        double weight = scanner.nextDouble();
        
        System.out.printf("Enter your height in meter: ");
        double height = scanner.nextDouble();
        
        // create object and use methods
        BMICalculator bmiCalculator = new BMICalculator(weight,height);
        double bmi = bmiCalculator.calculateBMI();
        String category = bmiCalculator.getCategory();
        
        // output results
        System.out.printf("Your BMI is: %2f\n",bmi);
        System.out.printf("You are categorized as: "+category);
        
        scanner.close();
    }
}