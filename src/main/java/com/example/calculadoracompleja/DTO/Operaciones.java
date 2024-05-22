package com.example.calculadoracompleja.DTO;

public class Operaciones {

    double op1;
    double op2;

    public Operaciones(double op1, double op2) {
        setOp1(op1);
        setOp2(op2);
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }


    public String Sumar(double operando1, double operando2){

        return String.valueOf(operando1 + operando2);
    }

    public String Restar(double operando1, double operando2){
        return String.valueOf(operando1 - operando2);
    }

    public String Multiplicar(double operando1, double operando2){

        return String.valueOf(operando1 * operando2);
    }

    public String Dividir(double operando1, double operando2){
        return String.valueOf(operando1 / operando2);
    }

    public String Resto(double operando1, double operando2){
            return String.valueOf(operando1 % operando2);

    }





}
