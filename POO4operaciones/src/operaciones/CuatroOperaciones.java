package operaciones;


public class CuatroOperaciones {
    public int num1,num2,multiplicacion,suma,resta;
    public double division;
    
    
    //-------------------------------------CONSTRUCTOR-----------------------------------------------------------//
    public CuatroOperaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //-------------------------------------GET AND SET-----------------------------------------------------------//
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //-------------------------------------------------METODOS CALCULO-------------------------------------------//
    public int multiplicacion(){
        return num1 * num2;
    }
    
    public double division(){
        return num1 / num2;
    }
    
    public int suma(){
        return num1 + num2;
    }
    
    public int resta(){
        return num1 - num2;
    }

    


    
    

}
