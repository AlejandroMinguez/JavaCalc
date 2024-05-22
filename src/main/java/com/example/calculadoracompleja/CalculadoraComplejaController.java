package com.example.calculadoracompleja;

import com.example.calculadoracompleja.DTO.Operaciones;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class CalculadoraComplejaController  implements Initializable {
    @FXML
    private Label labPantalla;
    private boolean digito = false;
    private boolean puntoOp = false;
    private int numOperandos = 0;
    private String operador= " ";
    @FXML
    Operaciones op = null;
    @FXML
    public void onClickButtonBorradoPantalla() {
        labPantalla.setText("0");
        numOperandos = 0;
        puntoOp = false;
        digito = false;
    }

    @FXML
    protected void onClickButtonSumar() {
        if (!labPantalla.getText().equals("0") && digito && numOperandos==0) {
            labPantalla.setText(labPantalla.getText() + "+");
            numOperandos++;
            puntoOp=false;
            operador="+";
        }


    }
    @FXML
    public void onClickButtonRestar() {
        if (!labPantalla.getText().equals("0") && digito && numOperandos==0){
            labPantalla.setText(labPantalla.getText() + "-");
            numOperandos++;
            puntoOp=false;
            operador="-";
        }
    }
    @FXML
    public void onClickButtonMultiplicar() {
        if (!labPantalla.getText().equals("0") && digito && numOperandos==0){
            labPantalla.setText(labPantalla.getText() + "x");
            numOperandos++;
            puntoOp=false;
            operador="x";
        }
    }
    @FXML
    public void onClickButtonDividir() {
        if (!labPantalla.getText().equals("0") && digito && numOperandos==0){
            labPantalla.setText(labPantalla.getText() + "/");
            numOperandos++;
            puntoOp=false;
            operador="/";
        }
    }
    @FXML
    public void onClickButtonResto() {
        if (!labPantalla.getText().equals("0") && digito && numOperandos==0){
            labPantalla.setText(labPantalla.getText() + "%");
            numOperandos++;
            puntoOp=false;
            operador="%";
        }
    }
    @FXML
    public void onClickButtonSimboloNegativo() {
        if (!labPantalla.getText().equals("0") && digito) {
            if (!labPantalla.getText().startsWith("-")) {
                labPantalla.setText("-" + labPantalla.getText());
            } else {
                labPantalla.setText(labPantalla.getText().substring(1));
            }
        }
    }

    @FXML
    public void onClickButtonPunto(){
        if (!labPantalla.getText().contains(".") && !puntoOp){
            labPantalla.setText(labPantalla.getText() + ".");
            puntoOp = true;
        }
        if (labPantalla.getText().contains(".")  && !puntoOp && digito && !labPantalla.getText().endsWith(operador)){
            labPantalla.setText(labPantalla.getText() + ".");
            puntoOp = true;
        }
    }
    @FXML
    public void onClickButtonCero(){
        if (!labPantalla.getText().equals("0")) {
            labPantalla.setText(labPantalla.getText() + "0");
        }
    }
    @FXML
    public void onClickButtonUno(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("1");
        }else {
            labPantalla.setText(labPantalla.getText()+"1");
        }
        digito=true;
    }
    @FXML
    public void onClickButtonDos(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("2");
        }else {
            labPantalla.setText(labPantalla.getText()+"2");
        }
        digito=true;
    }
    @FXML
    public void onClickButtonTres(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("3");
        }else {
            labPantalla.setText(labPantalla.getText()+"3");
        }
        digito=true;
    }
    @FXML
    public void onClickButtonCuatro(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("4");
        }else {
            labPantalla.setText(labPantalla.getText()+"4");

        }
        digito=true;
    }
    @FXML
    public void onClickButtonCinco(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("5");
        }else {
            labPantalla.setText(labPantalla.getText()+"5");
        }
        digito=true;
    }
    @FXML
    public void onClickButtonSeis(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("6");
        }else {
            labPantalla.setText(labPantalla.getText()+"6");
        }
        digito=true;

    }
    @FXML
    public void onClickButtonSiete(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("7");
        }else {
            labPantalla.setText(labPantalla.getText()+"7");

        }
        digito=true;
    }
    @FXML
    public void onClickButtonOcho(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("8");
        }else {
            labPantalla.setText(labPantalla.getText()+"8");

        }
        digito=true;
    }
    @FXML
    public void onClickButtonNueve(){
        if (labPantalla.getText().equals("0")) {
            labPantalla.setText("9");
        }else {
            labPantalla.setText(labPantalla.getText()+"9");

        }
        digito=true;
    }
    String[] subOperando;


    @FXML
    public void onClickResultado() {
        subOperando = labPantalla.getText().split(Pattern.quote(operador));
        op.setOp1(Double.parseDouble(subOperando[0]));
        op.setOp2(Double.parseDouble(subOperando[1]));
        switch (operador){
            case "+":
                if (op.Sumar(op.getOp1(), op.getOp2()).endsWith(".0")){
                    labPantalla.setText(op.Sumar(op.getOp1(), op.getOp2()).replace(".0",""));
                }else {
                    labPantalla.setText(op.Sumar(op.getOp1(), op.getOp2()));
                };
                break;
            case "-":
                if (op.Restar(op.getOp1(), op.getOp2()).endsWith(".0")){
                    labPantalla.setText(op.Restar(op.getOp1(), op.getOp2()).replace(".0",""));
                }else {
                    labPantalla.setText(op.Restar(op.getOp1(), op.getOp2()));
                };
                break;

            case "/":
                if (op.Multiplicar(op.getOp1(), op.getOp2()).endsWith(".0")){
                    labPantalla.setText(op.Multiplicar(op.getOp1(), op.getOp2()).replace(".0",""));
                }else {
                    labPantalla.setText(op.Multiplicar(op.getOp1(), op.getOp2()));
                };
                break;
            case "x":
                if (op.Dividir(op.getOp1(), op.getOp2()).endsWith(".0")){
                    labPantalla.setText(op.Dividir(op.getOp1(), op.getOp2()).replace(".0",""));
                }else {
                    labPantalla.setText(op.Dividir(op.getOp1(), op.getOp2()));
                };
                break;
            case "%":
                if (op.Resto(op.getOp1(), op.getOp2()).endsWith(".0")){
                    labPantalla.setText(op.Resto(op.getOp1(), op.getOp2()).replace(".0",""));
                }else {
                    labPantalla.setText(op.Resto(op.getOp1(), op.getOp2()));
                };
                break;
        }
        numOperandos = 0;
        digito = true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        op = new Operaciones(0,0);
        labPantalla.setText("0");
    }
}
