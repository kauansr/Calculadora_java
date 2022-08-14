package calculador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Calculadora extends JFrame{
JLabel valora, valorb, valorc,x1,x2;
JButton somar, subtrair,dividir,multiplica, Calculador;
JTextField texto, texto2, texto3, texta, textb, textc, textxa, textxb;
double delta;
int num1, num2, resultado=0, num3,r1,r2,r3,resultadoo,resultadob;

public Calculadora(){
super("Calculadora");
Container tela = getContentPane();
setLayout(null);

texto = new JTextField(15);
texto2 = new JTextField(15);
texto3 = new JTextField(15);
texta = new JTextField(50);
textb = new JTextField(50);
textc = new JTextField(50);
textxa = new JTextField(50);
textxb = new JTextField(50);

valora = new JLabel("Valor a: ");
valorb = new JLabel("Valor b: ");
valorc = new JLabel("Valor c: ");
x1 = new JLabel("X1 : ");
x2 = new JLabel("x2 : ");

somar = new JButton(" SOMAR ");
subtrair = new JButton(" SUBTRAIR ");
dividir = new JButton("DIVIDIR");
multiplica = new JButton("MULTIPLICAR");
Calculador = new JButton("Calcular");

texto.setBounds(120,20,200,20);
texto2.setBounds(120,40,200,20);
texto3.setBounds(120,170,200,20);


somar.setBounds(200,80,100,20);
subtrair.setBounds(200,100,100,20);
dividir.setBounds(200,120,100,20);
multiplica.setBounds(200,140,100,20);
valora.setBounds(50,20,80,20);
valorb.setBounds(50, 60, 80, 20);
valorc.setBounds(50,100,80,20);
Calculador.setBounds(50,140,300,20);

x1.setBounds(50,180,80,20);
x2.setBounds(50,220,80,20);

texta.setBounds(200,20,100,20);
textb.setBounds(200,60,100,20);
textc.setBounds(200,100,100,20);
    
    
textxa.setBounds(200,180,100,20);
textxb.setBounds(200,220,100,20);

tela.add(somar);
tela.add(subtrair);
tela.add(dividir);
tela.add(multiplica);

tela.add(texto);
tela.add(texto2);
tela.add(texto3);

tela.add(valora);
tela.add(valorb);
tela.add(valorc);
    
tela.add(x1);
tela.add(x2);
    
tela.add(Calculador);
    
tela.add(texta);
tela.add(textb);
tela.add(textc);
tela.add(textxa);
tela.add(textxb);

somar.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 + num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});


subtrair.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 - num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

dividir.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 / num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

multiplica.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 * num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

Calculador.addActionListener( new ActionListener(){

        public void actionPerformed(ActionEvent event){
            num1 = Integer.parseInt(texta.getText());
            num2 = Integer.parseInt(textb.getText());
            num3 = Integer.parseInt(textc.getText());
            delta = (num2 * num2) + (-4 * (num1 * num3));
            r1 = (int)(double) ((-(num2) + Math.sqrt(delta)) / 2 * num1);
            r2 = (int)(double) ((-(num2) - Math.sqrt(delta)) / 2 * num1);
            resultado = r1;
            resultadob = r2;

            String resul = String.valueOf(resultado);
            String resulb = String.valueOf(resultadob);
            
           
            textxa.setText(Integer.toString(resultado));
            textxb.setText(Integer.toString(resultadob));
            }
            });


setSize(400,250);
setVisible(true);
texto.requestFocus();
}

public static void main (String[] args){
Calculadora app = new Calculadora();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}