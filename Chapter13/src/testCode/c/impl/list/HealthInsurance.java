package testCode.c.impl.list;

import javax.swing.SwingUtilities;

public enum HealthInsurance {
    LEVEL_ONE(1000, 0.01),
    LEVEL_TWO(2000, 0.02),
    LEVEL_THREE(3000, 0.032),
    LEVEL_FOUR(4000, 0.045),
    LEVEL_FIVE(5000, 0.056),
    LEVEL_SIX(6000, 0.071);

    private final int maxSalary;
    private final double ratio;
    HealthInsurance(int maxSalary, double ratio){
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio(){
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        if(salary<=1000){
            return LEVEL_ONE;
        }else if(salary>1000 && salary<=2000){
            return LEVEL_TWO;
        }else if(salary>2000 && salary<=3000){
            return LEVEL_THREE;
        }else if(salary>3000 && salary<=4000){
            return LEVEL_FOUR;
        }else if(salary>4000 && salary<=5000){
            return LEVEL_FIVE;
        }
        return LEVEL_TWO;

    }

    public static void main(String[] args) {
        int salaryArray[] = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for (HealthInsurance insurance : insurances) {
            System.out.println(insurance);
        }
    }
}
